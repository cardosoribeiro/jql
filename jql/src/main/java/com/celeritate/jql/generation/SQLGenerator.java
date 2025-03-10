package com.celeritate.jql.generation;

import com.celeritate.jql.ast.JQLVisitor;
import com.celeritate.jql.ast.*;
import java.util.List;

public class SQLGenerator implements JQLVisitor {
    private StructuredQueryModel queryModel;

    public SQLGenerator() {
        this.queryModel = new StructuredQueryModel();
    }

    public StructuredQueryModel getQueryModel() {
        return this.queryModel;
    }

    @Override
    public Object visitAndCondition(AndCondition andCondition) {
        List<LogicalExpression> expressions = andCondition.logicalExpressionList;
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < expressions.size(); i++) {
            expressions.get(i).accept(this);
            sb.append(queryModel.getCurrentConditionPart());
            if (i < expressions.size() - 1) {
                sb.append(" AND ");
            }
        }
        sb.append(")");
        queryModel.setCurrentConditionPart(sb.toString());    
        return null;
    }

    @Override
    public Object visitAtomicCondition(AtomicCondition atomicCondition) {
        atomicCondition.conditionItem.accept(this);        
        return null;
    }

    @Override
    public Object visitCondition(Condition condition) {
        if (condition.logicalExpression != null) {
            condition.logicalExpression.accept(this);
            queryModel.setWhereClause(queryModel.getWhereClause() + queryModel.getCurrentConditionPart());
        }
        return null;
    }

    @Override
    public Object visitConditionItem(ConditionItem conditionItem) {
        conditionItem.value.accept(this);
        queryModel.setCurrentConditionPart(conditionItem.name + " " + queryModel.getCurrentConditionPart());            
        return null;
    }

    @Override
    public Object visitConditionValue(ConditionValue conditionValue) {
        queryModel.setCurrentConditionPart(conditionValue.operator + " '" + conditionValue.value + "'");
        return null;
    }

    @Override
    public Object visitDeleteField(DeleteField deleteField) {
        queryModel.setOperation("DELETE");
        deleteField.condition.accept(this);
        return null;
    }   

    @Override
    public Object visitGroupByField(GroupByField groupByField) {
        queryModel.setGroupBy(groupByField.stringList);
        return null;
    }

    @Override
    public Object visitGroupCondition(GroupCondition groupCondition) {
        queryModel.setCurrentConditionPart("(");
        groupCondition.logicalExpression.accept(this);
        queryModel.setCurrentConditionPart(queryModel.getCurrentConditionPart() + ")");
        return null;
    }

    @Override
    public Object visitInsertField(InsertField insertField) {
        queryModel.setOperation("INSERT");
        queryModel.setInsertValues(insertField.keyValuePairs);
        return null;
    }

    @Override
    public Object visitNotCondition(NotCondition notCondition) {
        queryModel.setCurrentConditionPart("NOT ");
        notCondition.logicalExpression.accept(this);        
        return null;
    }

    @Override
    public Object visitOrCondition(OrCondition orCondition) {
        List<LogicalExpression> expressions = orCondition.logicalExpressionList;
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < expressions.size(); i++) {
            expressions.get(i).accept(this);
            sb.append(queryModel.getCurrentConditionPart());
            if (i < expressions.size() - 1) {
                sb.append(" OR ");
            }
        }
        sb.append(")");
        queryModel.setCurrentConditionPart(sb.toString());        
        return null;
    }

    @Override
    public Object visitOrderByField(OrderByField orderByField) {
        queryModel.setOrderBy(orderByField.orderByList);
        return null;
    }

    @Override
    public Object visitOrderByItem(OrderByItem orderByItem) {
        return null;
    }

    @Override
    public Object visitQuery(Query query) {
        query.queryFields.accept(this);
        return null;
    }

    @Override
    public Object visitQueryFields(QueryFields queryFields) {
        queryFields.usingField.accept(this);
        for (QueryField field : queryFields.queryFieldList) {
            field.accept(this);
        }        
        return null;
    }

    @Override
    public Object visitSelectField(SelectField selectField) {
        queryModel.setOperation("SELECT");
        queryModel.setSelectFields(selectField.stringList);
        return null;
    }

    @Override
    public Object visitStringValuePair(StringValuePair stringValuePair) {
        return null;
    }

    @Override
    public Object visitUpdateField(UpdateField updateField) {
        queryModel.setOperation("UPDATE");
        queryModel.setUpdateValues(updateField.keyValuePairs);
        return null;
    }

    @Override
    public Object visitUsingField(UsingField usingField) {
        queryModel.setTables(usingField.stringList);
        return null;
    }

    @Override
    public Object visitWhereField(WhereField whereField) {
        whereField.condition.accept(this);
        return null;
    }
}