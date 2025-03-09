package com.celeritate.jql.ast;

import java.util.List;
import java.util.ArrayList;
/*
 * 
 */
public class AndCondition extends LogicalExpression {
    public List<LogicalExpression> logicalExpressionList;

    public AndCondition() {
        this.logicalExpressionList = new ArrayList<LogicalExpression>();
    }

    public AndCondition(List<LogicalExpression> logicalExpressionList) {
        this.logicalExpressionList = logicalExpressionList;
    }    
        
	public Object accept(JQLVisitor visitor) {
        return visitor.visitAndCondition(this);
    }
}