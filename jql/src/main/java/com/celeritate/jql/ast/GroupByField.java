package com.celeritate.jql.ast;

import java.util.ArrayList;
import java.util.List;
/*
 * 
 */
public class GroupByField extends QueryField {
    public List<String> stringList;

    public GroupByField() {
        this.stringList = new ArrayList<String>();
    }

    public GroupByField(List<String> stringList) {
        this.stringList = stringList;
    }    
        
	public Object accept(JQLVisitor visitor) {
        return visitor.visitGroupByField(this);
    }
}