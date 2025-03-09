package com.celeritate.jql.ast;

import java.util.ArrayList;
import java.util.List;
/*
 * 
 */
public class InsertField extends QueryField {
    public List<StringValuePair> keyValuePairs;

    public InsertField() {
        this.keyValuePairs = new ArrayList<StringValuePair>();
    }

    public InsertField(List<StringValuePair> keyValuePairs) {
        this.keyValuePairs = keyValuePairs;
    }    
        
	public Object accept(JQLVisitor visitor) {
        return visitor.visitInsertField(this);
    }
}