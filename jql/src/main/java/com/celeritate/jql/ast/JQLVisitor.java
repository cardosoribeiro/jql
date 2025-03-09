package com.celeritate.jql.ast;

public interface JQLVisitor {
    Object visitAndCondition(AndCondition andCondition);
    Object visitAtomicCondition(AtomicCondition atomicCondition);
    Object visitCondition(Condition condition);
    Object visitConditionItem(ConditionItem conditionItem);
    Object visitConditionValue(ConditionValue conditionValue);
    Object visitDeleteField(DeleteField deleteField);
    Object visitGroupByField(GroupByField groupField);
    Object visitGroupCondition(GroupCondition groupCondition);
    Object visitInsertField(InsertField insertField);
    Object visitNotCondition(NotCondition notCondition);
    Object visitOrCondition(OrCondition orCondition);
    Object visitOrderByField(OrderByField orderByField);
    Object visitOrderByItem(OrderByItem orderByItem);
    Object visitQuery(Query query);
    Object visitQueryFields(QueryFields queryFields);
    Object visitSelectField(SelectField selectField);
    Object visitStringValuePair(StringValuePair stringValuePair);
    Object visitUpdateField(UpdateField updateField);
    Object visitUsingField(UsingField usingField);
    Object visitWhereField(WhereField whereField);
}