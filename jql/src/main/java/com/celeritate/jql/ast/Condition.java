package com.celeritate.jql.ast;

/*
 * 
 */
public class Condition extends AST {
    public LogicalExpression logicalExpression;

    public Condition() {
        this.logicalExpression = null;        
    }

    public Condition(LogicalExpression logicalExpression) {
        this.logicalExpression = logicalExpression;
    }    
        
	public Object accept(JQLVisitor visitor) {
        return visitor.visitCondition(this);
    }
}