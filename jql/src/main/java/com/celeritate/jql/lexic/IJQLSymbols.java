package com.celeritate.jql.lexic;

public interface IJQLSymbols {
    // Token Constants
    public static final int USING = 0;
    public static final int SELECT = 1;
    public static final int INSERT = 2;
    public static final int UPDATE = 3;
    public static final int DELETE = 4;
    public static final int WHERE = 5;
    public static final int GROUPBY = 6;
    public static final int ORDERBY = 7;
    public static final int ASC = 8;
    public static final int DESC = 9;
    public static final int EQ = 10;
    public static final int NE = 11;
    public static final int LT = 12;
    public static final int GT = 13;
    public static final int LTE = 14;
    public static final int GTE = 15;
    public static final int LBRACE = 16;
    public static final int RBRACE = 17;
    public static final int COLON = 18;
    public static final int AND = 19;
    public static final int OR = 20;
    public static final int NOT = 21;
    public static final int GROUP = 22;
    public static final int IDENTIFIER = 23;
    public static final int INTEGER_LITERAL = 24;
    public static final int FLOAT_LITERAL = 25;
    public static final int DOUBLE_LITERAL = 26;
    public static final int STRING_LITERAL = 27;
    public static final int EOF = 28;
    public static final int LPAREN = 29;
    public static final int RPAREN = 30;
    public static final int COMMA = 31;
    public static final int LSQBRACE = 32;
    public static final int RSQBRACE = 33;

    // Terminal Names (for debugging/error reporting)
    public static final String[] terminalNames = new String[] {
            "USING", "SELECT", "INSERT", "UPDATE", "DELETE", "WHERE", "GROUPBY",
            "ORDERBY", "ASC", "DESC", "EQ", "NE", "LT", "GT", "LTE", "GTE",
            "LBRACE", "RBRACE", "COLON", "AND", "OR", "NOT", "GROUP", "IDENTIFIER",
            "INTEGER_LITERAL", "FLOAT_LITERAL", "DOUBLE_LITERAL", "STRING_LITERAL", "EOF",
            "LPAREN", "RPAREN", "COMMA", "LSQBRACE", "RSQBRACE"
    };
}