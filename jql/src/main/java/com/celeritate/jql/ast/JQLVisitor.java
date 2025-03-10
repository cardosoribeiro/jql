package com.celeritate.jql.ast;

public interface JQLVisitor {
    public Object visitAndCondition(AndCondition andCondition);
    public Object visitAtomicCondition(AtomicCondition atomicCondition);
    public Object visitCondition(Condition condition);
    public Object visitConditionItem(ConditionItem conditionItem);
    public Object visitConditionValue(ConditionValue conditionValue);
    public Object visitDeleteField(DeleteField deleteField);
    public Object visitGroupByField(GroupByField groupField);
    public Object visitGroupCondition(GroupCondition groupCondition);
    public Object visitInsertField(InsertField insertField);
    public Object visitNotCondition(NotCondition notCondition);
    public Object visitOrCondition(OrCondition orCondition);
    public Object visitOrderByField(OrderByField orderByField);
    public Object visitOrderByItem(OrderByItem orderByItem);
    public Object visitQuery(Query query);
    public Object visitQueryFields(QueryFields queryFields);
    public Object visitSelectField(SelectField selectField);
    public Object visitStringValuePair(StringValuePair stringValuePair);
    public Object visitUpdateField(UpdateField updateField);
    public Object visitUsingField(UsingField usingField);
    public Object visitWhereField(WhereField whereField);
}