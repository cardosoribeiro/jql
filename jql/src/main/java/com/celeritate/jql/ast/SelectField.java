package com.celeritate.jql.ast;

import java.util.ArrayList;
import java.util.List;
/*
 * 
 */
public class SelectField extends QueryField {
    public List<String> stringList;

    public SelectField() {
        this.stringList = new ArrayList<String>();
    }

    public SelectField(List<String> stringList) {
        this.stringList = stringList;
    }    
        
	//public Object accept(JQLVisitor visitor);
}