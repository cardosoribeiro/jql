package com.celeritate.jql.ast;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 */
public class OrderByField extends QueryField {
    public List<OrderByItem> orderByList;

    public OrderByField() {
        this.orderByList = new ArrayList<OrderByItem>();
    }

    public OrderByField(List<OrderByItem> orderByList) {
        this.orderByList = orderByList;
    }    
        
	public Object accept(JQLVisitor visitor) {
        return visitor.visitOrderByField(this);
    }
}