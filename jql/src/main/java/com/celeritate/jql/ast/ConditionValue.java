package com.celeritate.jql.ast;

/*
 * 
 */
public class ConditionValue extends AST {
    public String operator;
    public String value;

    public ConditionValue() {
        this.operator = "";
        this.value = "";
    }

    public ConditionValue(String operator, String value) {
        this.operator = operator;
        this.value = value;
    }    
        
	public Object accept(JQLVisitor visitor) {
        return visitor.visitConditionValue(this);
    }
}