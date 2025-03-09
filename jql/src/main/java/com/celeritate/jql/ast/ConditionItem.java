package com.celeritate.jql.ast;

/*
 * 
 */
public class ConditionItem extends AST {
    public String name;
    public ConditionValue value;

    public ConditionItem() {
        this.name = "";
        this.value = new ConditionValue();
    }

    public ConditionItem(String name, ConditionValue value) {
        this.name = name;
        this.value = value;
    }    
        
	//public Object accept(JQLVisitor visitor);
}