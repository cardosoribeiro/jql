package com.celeritate.jql.ast;

import java.util.List;
import java.util.ArrayList;
/*
 * 
 */
public class OrCondition extends LogicalExpression {
    public List<LogicalExpression> logicalExpressionList;

    public OrCondition() {
        this.logicalExpressionList = new ArrayList<LogicalExpression>();
    }

    public OrCondition(List<LogicalExpression> logicalExpressionList) {
        this.logicalExpressionList = logicalExpressionList;
    }    
        
	public Object accept(JQLVisitor visitor) {
        return visitor.visitOrCondition(this);
    }
}