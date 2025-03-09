# ./main/java/com/celeritate/jql/ast/
```java
package com.celeritate.jql.ast;

import java.util.List;
import java.util.ArrayList;
/*
 * 
 */
public class AndCondition extends LogicalExpression {
    public List<LogicalExpression> logicalExpressionList;

    public AndCondition() {
        this.logicalExpressionList = new ArrayList<LogicalExpression>();
    }

    public AndCondition(List<LogicalExpression> logicalExpressionList) {
        this.logicalExpressionList = logicalExpressionList;
    }    
        
	//public Object accept(JQLVisitor visitor);
}
```
# ./main/java/com/celeritate/jql/ast/
```java
package com.celeritate.jql.ast;

/*
 * Class that represents the root of Abstract Syntax Tree
 */
public abstract class AST {
	//public abstract Object accept(JQLVisitor visitor);
}
```
# ./main/java/com/celeritate/jql/ast/
```java
package com.celeritate.jql.ast;

/*
 * 
 */
public class AtomicCondition extends LogicalExpression {
    public ConditionItem conditionItem;

    public AtomicCondition() {
        this.conditionItem = new ConditionItem();
    }

    public AtomicCondition(ConditionItem conditionItem) {
        this.conditionItem = conditionItem;        
    }    
        
	//public Object accept(JQLVisitor visitor);
}
```
# ./main/java/com/celeritate/jql/ast/
```java
package com.celeritate.jql.ast;

/*
 * 
 */
public class Condition extends AST {
    public LogicalExpression logicalExpression;

    public Condition() {
        this.logicalExpression = null;        
    }

    public Condition(LogicalExpression logicalExpression) {
        this.logicalExpression = logicalExpression;
    }    
        
	//public Object accept(JQLVisitor visitor);
}
```
# ./main/java/com/celeritate/jql/ast/
```java
package com.celeritate.jql.ast;

/*
 * 
 */
public class ConditionItem extends AST {
    public String name;
    public ConditionValue value;

    public ConditionItem() {
        this.name = "";
        this.value = new ConditionValue();
    }

    public ConditionItem(String name, ConditionValue value) {
        this.name = name;
        this.value = value;
    }    
        
	//public Object accept(JQLVisitor visitor);
}
```
# ./main/java/com/celeritate/jql/ast/
```java
package com.celeritate.jql.ast;

/*
 * 
 */
public class ConditionValue extends AST {
    public String operator;
    public String value;

    public ConditionValue() {
        this.operator = "";
        this.value = "";
    }

    public ConditionValue(String operator, String value) {
        this.operator = operator;
        this.value = value;
    }    
        
	//public Object accept(JQLVisitor visitor);
}
```
# ./main/java/com/celeritate/jql/ast/
```java
package com.celeritate.jql.ast;

/*
 * 
 */
public class DeleteField extends QueryField {
    public Condition condition;

    public DeleteField() {
        this.condition = new Condition();
    }

    public DeleteField(Condition condition) {
        this.condition = condition;
    }    
        
	//public Object accept(JQLVisitor visitor);
}
```
# ./main/java/com/celeritate/jql/ast/
```java
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
        
	//public Object accept(JQLVisitor visitor);
}
```
# ./main/java/com/celeritate/jql/ast/
```java
package com.celeritate.jql.ast;

/*
 * 
 */
public class GroupCondition extends LogicalExpression {
    public LogicalExpression logicalExpression;

    public GroupCondition() {
        this.logicalExpression = null;
    }

    public GroupCondition(LogicalExpression logicalExpression) {
        this.logicalExpression = logicalExpression;
    }    
        
	//public Object accept(JQLVisitor visitor);
}
```
# ./main/java/com/celeritate/jql/ast/
```java
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
        
	//public Object accept(JQLVisitor visitor);
}
```
# ./main/java/com/celeritate/jql/ast/
```java
package com.celeritate.jql.ast;

/*
 * 
 */
public abstract class LogicalExpression extends AST {        
	//public abstract Object accept(JQLVisitor visitor);
}
```
# ./main/java/com/celeritate/jql/ast/
```java
package com.celeritate.jql.ast;

/*
 * 
 */
public class NotCondition extends LogicalExpression {
    public LogicalExpression logicalExpression;

    public NotCondition() {
        this.logicalExpression = null;
    }

    public NotCondition(LogicalExpression logicalExpression) {
        this.logicalExpression = logicalExpression;
    }    
        
	//public Object accept(JQLVisitor visitor);
}
```
# ./main/java/com/celeritate/jql/ast/
```java
package com.celeritate.jql.ast;

import java.util.List;
import java.util.ArrayList;
/*
 * 
 */
public class OrCondition extends LogicalExpression {
    public List<LogicalExpression> logicalExpressionList;

    public OrCondition() {
        this.logicalExpressionList = new ArrayList<LogicalExpression>();
    }

    public OrCondition(List<LogicalExpression> logicalExpressionList) {
        this.logicalExpressionList = logicalExpressionList;
    }    
        
	//public Object accept(JQLVisitor visitor);
}
```
# ./main/java/com/celeritate/jql/ast/
```java
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
        
	//public Object accept(JQLVisitor visitor);
}
```
# ./main/java/com/celeritate/jql/ast/
```java
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
```
# ./main/java/com/celeritate/jql/ast/
```java
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
```
# ./main/java/com/celeritate/jql/ast/
```java
package com.celeritate.jql.ast;

/*
 * 
 */
public abstract class QueryField extends AST {            
	//public Object accept(JQLVisitor visitor);
}
```
# ./main/java/com/celeritate/jql/ast/
```java
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

	//public Object accept(JQLVisitor visitor);
}
```
# ./main/java/com/celeritate/jql/ast/
```java
package com.celeritate.jql.ast;

import java.util.ArrayList;
import java.util.List;
/*
 * 
 */
public class SelectField extends QueryField {
    public List<String> stringList;

    public SelectField() {
        this.stringList = new ArrayList<String>();
    }

    public SelectField(List<String> stringList) {
        this.stringList = stringList;
    }    
        
	//public Object accept(JQLVisitor visitor);
}
```
# ./main/java/com/celeritate/jql/ast/
```java
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
```
# ./main/java/com/celeritate/jql/ast/
```java
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
```
# ./main/java/com/celeritate/jql/ast/
```java
package com.celeritate.jql.ast;

import java.util.ArrayList;
import java.util.List;
/*
 * 
 */
public class UsingField extends QueryField {
    public List<String> stringList;

    public UsingField() {
        this.stringList = new ArrayList<String>();
    }

    public UsingField(List<String> stringList) {
        this.stringList = stringList;
    }    
        
	//public Object accept(JQLVisitor visitor);
}
```
# ./main/java/com/celeritate/jql/ast/
```java
package com.celeritate.jql.ast;

/*
 * 
 */
public class WhereField extends QueryField {
    public Condition condition;

    public WhereField() {
        this.condition = new Condition();
    }

    public WhereField(Condition condition) {
        this.condition = condition;
    }    
        
	//public Object accept(JQLVisitor visitor);
}
```