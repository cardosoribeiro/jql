package com.celeritate.jql.generation;

import com.celeritate.jql.ast.JQLVisitor;
import com.celeritate.jql.ast.*;

public class SQLGenerator implements JQLVisitor {
    private StructuredQueryModel queryModel;        

    public SQLGenerator() {
        this.queryModel = new StructuredQueryModel();
    }

    public StructuredQueryModel getQueryModel() {return this.queryModel;}

    public Object visitAndCondition(AndCondition andCondition){
        return null;
    }

    public Object visitAtomicCondition(AtomicCondition atomicCondition){
        return null;
    }

    public Object visitCondition(Condition condition){
        return null;
    }

    public Object visitConditionItem(ConditionItem conditionItem){
        return null;
    }

    public Object visitConditionValue(ConditionValue conditionValue){
        return null;
    }

    public Object visitDeleteField(DeleteField deleteField){
        return null;
    }

    public Object visitGroupByField(GroupByField groupField){
        return null;
    }

    public Object visitGroupCondition(GroupCondition groupCondition){
        return null;
    }

    public Object visitInsertField(InsertField insertField){
        return null;
    }

    public Object visitNotCondition(NotCondition notCondition){
        return null;
    }

    public Object visitOrCondition(OrCondition orCondition){
        return null;
    }

    public Object visitOrderByField(OrderByField orderByField){
        return null;
    }

    public Object visitOrderByItem(OrderByItem orderByItem){
        return null;
    }

    public Object visitQuery(Query query) {
        return null;
    }

    public Object visitQueryFields(QueryFields queryFields){
        return null;
    }

    public Object visitSelectField(SelectField selectField){
        return null;
    }

    public Object visitStringValuePair(StringValuePair stringValuePair){
        return null;
    }

    public Object visitUpdateField(UpdateField updateField){
        return null;
    }

    public Object visitUsingField(UsingField usingField){
        return null;
    }

    public Object visitWhereField(WhereField whereField){
        return null;
    }
}