package com.celeritate.jql.ast;

/*
 * 
 */
public class StringValuePair extends AST {
    public String name;
    public String value;

    public StringValuePair() {
        this.name = "";
        this.value = "";
    }

    public StringValuePair(String name, String value) {
        this.name = name;
        this.value = value;
    }    
        
	//public Object accept(JQLVisitor visitor);
}