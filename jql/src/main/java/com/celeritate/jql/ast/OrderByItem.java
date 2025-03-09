package com.celeritate.jql.ast;

/*
 * 
 */
public class OrderByItem extends AST {
    public String name;
    public String asc_desc;

    public OrderByItem() {
        this.name = "";
        this.asc_desc = "";
    }

    public OrderByItem(String name, String asc_desc) {
        this.name = name;
        this.asc_desc = asc_desc;
    }    
        
	//public Object accept(JQLVisitor visitor);
}