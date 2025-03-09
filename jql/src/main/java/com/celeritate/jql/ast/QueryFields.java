package com.celeritate.jql.ast;

import java.util.ArrayList;
import java.util.List;
/*
 * 
 */
public class QueryFields extends AST {
    public UsingField usingField;
    public List<QueryField> queryFieldList;
    
    public QueryFields(){
        this.usingField = new UsingField();
		this.queryFieldList = new ArrayList<QueryField>();
	}
    
    public QueryFields(UsingField usingField, List<QueryField> queryFieldList){
        this.usingField = usingField;
		this.queryFieldList = queryFieldList;
	}

	public Object accept(JQLVisitor visitor) {
        return visitor.visitQueryFields(this);
    }
}