package com.celeritate.jql.ast;

/*
 * 
 */
public class AtomicCondition extends LogicalExpression {
    public ConditionItem conditionItem;

    public AtomicCondition() {
        this.conditionItem = new ConditionItem();
    }

    public AtomicCondition(ConditionItem conditionItem) {
        this.conditionItem = conditionItem;        
    }    
        
	//public Object accept(JQLVisitor visitor);
}