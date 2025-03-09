package com.celeritate.jql.ast;

/*
 * Class that represents the root of Abstract Syntax Tree
 */
public abstract class AST {
	public abstract Object accept(JQLVisitor visitor);
}