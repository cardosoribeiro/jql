package com.celeritate.jql.ast;

/*
 * 
 */
public abstract class QueryField extends AST {            
	public abstract Object accept(JQLVisitor visitor);
}