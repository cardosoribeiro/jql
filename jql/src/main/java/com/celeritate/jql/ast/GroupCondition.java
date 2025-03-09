package com.celeritate.jql.ast;

/*
 * 
 */
public class GroupCondition extends LogicalExpression {
    public LogicalExpression logicalExpression;

    public GroupCondition() {
        this.logicalExpression = null;
    }

    public GroupCondition(LogicalExpression logicalExpression) {
        this.logicalExpression = logicalExpression;
    }    
        
	//public Object accept(JQLVisitor visitor);
}