package com.celeritate.jql.ast;

/*
 * 
 */
public class NotCondition extends LogicalExpression {
    public LogicalExpression logicalExpression;

    public NotCondition() {
        this.logicalExpression = null;
    }

    public NotCondition(LogicalExpression logicalExpression) {
        this.logicalExpression = logicalExpression;
    }    
        
	//public Object accept(JQLVisitor visitor);
}