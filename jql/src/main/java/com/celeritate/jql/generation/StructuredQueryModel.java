package com.celeritate.jql.generation;

import com.celeritate.jql.ast.OrderByItem;
import com.celeritate.jql.ast.StringValuePair;
import java.util.ArrayList;
import java.util.List;

public class StructuredQueryModel {

    private String operation; // SELECT, INSERT, UPDATE, DELETE
    private List<String> selectFields;
    private List<String> tables;
    private String whereClause;
    private List<String> groupBy;
    private List<OrderByItem> orderBy;
    private List<StringValuePair> insertValues;
    private List<StringValuePair> updateValues;
    private String currentConditionPart;

    public StructuredQueryModel() {
        this.selectFields = new ArrayList<>();
        this.tables = new ArrayList<>();
        this.groupBy = new ArrayList<>();
        this.orderBy = new ArrayList<>();
        this.insertValues = new ArrayList<>();
        this.updateValues = new ArrayList<>();
        this.whereClause = "";
        this.currentConditionPart = "";
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public List<String> getSelectFields() {
        return selectFields;
    }

    public void setSelectFields(List<String> selectFields) {
        this.selectFields = selectFields;
    }

    public List<String> getTables() {
        return tables;
    }

    public void setTables(List<String> tables) {
        this.tables = tables;
    }

    public String getWhereClause() {
        return whereClause;
    }

    public void setWhereClause(String whereClause) {
        this.whereClause = whereClause;
    }

    public List<String> getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(List<String> groupBy) {
        this.groupBy = groupBy;
    }

    public List<OrderByItem> getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(List<OrderByItem> orderBy) {
        this.orderBy = orderBy;
    }

    public List<StringValuePair> getInsertValues() {
        return insertValues;
    }

    public void setInsertValues(List<StringValuePair> insertValues) {
        this.insertValues = insertValues;
    }

    public List<StringValuePair> getUpdateValues() {
        return updateValues;
    }

    public void setUpdateValues(List<StringValuePair> updateValues) {
        this.updateValues = updateValues;
    }

    public String getCurrentConditionPart() {
        return currentConditionPart;
    }

    public void setCurrentConditionPart(String currentConditionPart) {
        this.currentConditionPart = currentConditionPart;
    }

    public String generateSQL() {
        if (operation == null || operation.isEmpty()) {
            return ""; // No operation specified
        }

        switch (operation.toUpperCase()) {
            case "SELECT":
                return generateSelectSQL();
            case "INSERT":
                return generateInsertSQL();
            case "UPDATE":
                return generateUpdateSQL();
            case "DELETE":
                return generateDeleteSQL();
            default:
                return ""; // Unsupported operation
        }
    }
 
    private String generateSelectSQL() {
        StringBuilder sql = new StringBuilder("SELECT ");
        if (selectFields.isEmpty()) {
            sql.append("*"); // Select all if no fields specified
        } else {
            for (int i = 0; i < selectFields.size(); i++) {
                sql.append(selectFields.get(i));
                if (i < selectFields.size() - 1) {
                    sql.append(", ");
                }
            }
        }

        sql.append(" FROM ");
        for (int i = 0; i < tables.size(); i++) {
            sql.append(tables.get(i));
            if (i < tables.size() - 1) {
                sql.append(", ");
            }
        }

        if (whereClause != null && !whereClause.isEmpty()) {
            sql.append(" WHERE ").append(whereClause);
        }

        if (!groupBy.isEmpty()) {
            sql.append(" GROUP BY ");
            for (int i = 0; i < groupBy.size(); i++) {
                sql.append(groupBy.get(i));
                if (i < groupBy.size() - 1) {
                    sql.append(", ");
                }
            }
        }

        if (!orderBy.isEmpty()) {
            sql.append(" ORDER BY ");
            for (int i = 0; i < orderBy.size(); i++) {
                sql.append(orderBy.get(i).name).append(" ").append(orderBy.get(i).asc_desc);
                if (i < orderBy.size() - 1) {
                    sql.append(", ");
                }
            }
        }

        return sql.toString();
    }

    private String generateInsertSQL() {
        if (tables.isEmpty() || insertValues.isEmpty()) {
            return ""; // Insufficient data
        }

        StringBuilder sql = new StringBuilder("INSERT INTO ");
        sql.append(tables.get(0)).append(" ("); // Assuming single table for INSERT

        for (int i = 0; i < insertValues.size(); i++) {
            sql.append(insertValues.get(i).name);
            if (i < insertValues.size() - 1) {
                sql.append(", ");
            }
        }

        sql.append(") VALUES (");

        for (int i = 0; i < insertValues.size(); i++) {
            sql.append("'").append(insertValues.get(i).value).append("'");
            if (i < insertValues.size() - 1) {
                sql.append(", ");
            }
        }

        sql.append(")");
        return sql.toString();
    }

    private String generateUpdateSQL() {
        if (tables.isEmpty() || updateValues.isEmpty()) {
            return ""; // Insufficient data
        }

        StringBuilder sql = new StringBuilder("UPDATE ");
        sql.append(tables.get(0)).append(" SET "); // Assuming single table for UPDATE

        for (int i = 0; i < updateValues.size(); i++) {
            sql.append(updateValues.get(i).name).append(" = '").append(updateValues.get(i).value).append("'");
            if (i < updateValues.size() - 1) {
                sql.append(", ");
            }
        }

        if (whereClause != null && !whereClause.isEmpty()) {
            sql.append(" WHERE ").append(whereClause);
        }

        return sql.toString();
    }

    private String generateDeleteSQL() {
        if (tables.isEmpty()) {
            return ""; // Insufficient data
        }

        StringBuilder sql = new StringBuilder("DELETE FROM ");
        sql.append(tables.get(0)); // Assuming single table for DELETE

        if (whereClause != null && !whereClause.isEmpty()) {
            sql.append(" WHERE ").append(whereClause);
        }

        return sql.toString();
    }    

    @Override
    public String toString() {
        return "StructuredQueryModel{" +
                "operation='" + operation + '\'' +
                ", selectFields=" + selectFields +
                ", tables=" + tables +
                ", whereClause='" + whereClause + '\'' +
                ", groupBy=" + groupBy +
                ", orderBy=" + orderBy +
                ", insertValues=" + insertValues +
                ", updateValues=" + updateValues +
                '}';
    }
}