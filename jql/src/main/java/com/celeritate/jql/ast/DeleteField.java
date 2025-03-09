package com.celeritate.jql.ast;

/*
 * 
 */
public class DeleteField extends QueryField {
    public Condition condition;

    public DeleteField() {
        this.condition = new Condition();
    }

    public DeleteField(Condition condition) {
        this.condition = condition;
    }    
        
	//public Object accept(JQLVisitor visitor);
}