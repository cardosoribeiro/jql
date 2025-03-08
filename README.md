# JQL: JSON-like query Language 

**JQL** is a domain-specific query language designed to provide a flexible and intuitive way to extract, manipulate, and transform data. It aims to simplify the process of querying complex data, offering a SQL-inspired syntax tailored for semi-structured data.

## Description

JQL is built to bridge the gap between traditional SQL and the dynamic nature of JSON-like data. It enables developers and data analysts to:

* **Simplify Data Processing:** Reduce the complexity of data processing tasks by providing a concise and expressive syntax.
* **Integrate with Java Applications:** Embed JQL into Java applications for seamless data manipulation.

## Goals

* **Ease of Use:** Provide a syntax that is familiar to SQL users, minimizing the learning curve.
* **Efficiency:** Implement an efficient lexer and parser to ensure fast query execution.
* **Flexibility:** Support a wide range of data manipulation operations to handle diverse data processing requirements.
* **Extensibility:** Design the language to allow for future extensions and customization.
* **Robust Error Handling:** Provide clear and informative error messages to aid in query development.

## Features

* **SQL-like Syntax:** Familiar `SELECT`, `WHERE`, `GROUP BY`, and `ORDER BY` clauses.
* **Filtering:** Apply complex filtering conditions using logical operators (`AND`, `OR`, `NOT`).
* **Data Transformation:** Support for basic data transformation operations.
* **Lexer:** Implemented using JFlex for efficient tokenization.
* **Parser:** Implemented using CUP for robust syntax analysis.
* **Type Support:** Integer, Float, Double, and String literals.

## Getting Started

### Prerequisites

* Java Development Kit (JDK) 8 or higher
* Maven

### Installation

1.  Clone the repository:

    ```bash
    git clone https://github.com/cardosoribeiro/jql.git
    cd jql
    cd jql
    ```

2.  Build the project using Maven:

    ```bash
    mvn clean package
    ```

3.  Copy the content of ./dependencies folder to ./jql/lib 

    ```bash
    copy ./dependencies/java-cup-11b-runtime.jar ./jql/lib/java-cup-11b-runtime.jar
    copy ./dependencies/java-cup-11b.jar ./jql/lib/java-cup-11b.jar
    copy ./dependencies/jflex-full-1.9.1.jar ./jql/lib/jflex-full-1.9.1.jar
    ```
    or 
    
    ```bat
    copy .\dependencies\java-cup-11b-runtime.jar .\jql\lib\java-cup-11b-runtime.jar
    copy .\dependencies\java-cup-11b.jar .\jql\lib\java-cup-11b.jar
    copy .\dependencies\jflex-full-1.9.1.jar .\jql\lib\jflex-full-1.9.1.jar
    ```

### Example


```json
{
    "using": { "tables": ["users"] },
    "select": ["name", "email"],
    "where": { "name": "torvalds" }
}
```
