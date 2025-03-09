package com.celeritate.jql.ast;

/*
 * 
 */
public class Query extends AST {
    public QueryFields queryFields;
    
    public Query(){
		this.queryFields = new QueryFields();
	}
    
    public Query(QueryFields queryFields){
		this.queryFields = queryFields;
	}

	//public Object accept(JQLVisitor visitor);
}