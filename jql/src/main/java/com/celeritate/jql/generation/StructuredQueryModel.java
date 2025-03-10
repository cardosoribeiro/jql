package com.celeritate.jql.generation;

import java.util.List;
import java.util.HashMap;

public class StructuredQueryModel {
    private List<String> tables;
    private String command;
    private HashMap<String, String> fields;
    private String condition;

    public StructuredQueryModel() {
        this.command = "select";
    }

    public List<String> getTables() {return this.tables;}
    public String getCommand() {return this.command;}
    public HashMap<String, String> getFields() {return this.fields;}
    public String getCondition() {return this.condition;}

    public void setTables(List<String> tables) {this.tables = tables;}
    public void setCommand(String command) {this.command = command;}
    public void setFields(HashMap<String, String> fields) {this.fields = fields;}
    public void setCondition(String condition) {this.condition = condition;}    

    private String getInserString() {
        return "INSERT INTO table(field1, field2) VALUES (value1, value2);";
    }
    private String getUpdateString() {
        return "UPDATA table SET field1=value1, field2=value2 WHERE condition=true;";
    }
    private String getDeleteString() {
        return "DELETE FROM table WHERE condition=true;";
    }
    private String getSelectString() {
        return "SELECT field1, field2 FROM table WHERE condition=true;";
    }
    public String generateSQL() {
        if (this.command.equals("select"))
            return this.getSelectString();
        return null;            
    }

}
