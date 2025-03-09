package com.celeritate.jql.ast;

/*
 * 
 */
public class WhereField extends QueryField {
    public Condition condition;

    public WhereField() {
        this.condition = new Condition();
    }

    public WhereField(Condition condition) {
        this.condition = condition;
    }    
        
	//public Object accept(JQLVisitor visitor);
}