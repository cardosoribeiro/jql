package com.celeritate.jql.ast;

import java.util.ArrayList;
import java.util.List;
/*
 * 
 */
public class UsingField extends QueryField {
    public List<String> stringList;

    public UsingField() {
        this.stringList = new ArrayList<String>();
    }

    public UsingField(List<String> stringList) {
        this.stringList = stringList;
    }    
        
	public Object accept(JQLVisitor visitor) {
        return visitor.visitUsingField(this);
    }
}