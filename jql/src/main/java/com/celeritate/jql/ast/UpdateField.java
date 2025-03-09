package com.celeritate.jql.ast;

import java.util.ArrayList;
import java.util.List;
/*
 * 
 */
public class UpdateField extends QueryField {
    public List<StringValuePair> keyValuePairs;

    public UpdateField() {
        this.keyValuePairs = new ArrayList<StringValuePair>();
    }

    public UpdateField(List<StringValuePair> keyValuePairs) {
        this.keyValuePairs = keyValuePairs;
    }    
        
	//public Object accept(JQLVisitor visitor);
}