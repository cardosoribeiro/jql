package com.celeritate.jql.lexic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java_cup.runtime.Scanner;

%%
%public
%class JQLLexer
%type Token
%implements IJQLSymbols
%cup
%line
%column
%unicode
%ignorecase

%{
    private Token token(int type) {
        return new Token(type, yyline + 1, yycolumn + 1, null);
    }

    private Token token(int type, Object valor) {
        return new Token(type, yyline + 1, yycolumn + 1, valor);
    }

    public static void enumerateTokens(String fileName) {
        try {
            JQLLexer lex = new JQLLexer(new FileReader(fileName));
            while (true) {
                try {
                    Token t = lex.next_token();
                    if (t == null) 
                        break;
                    if (t.type == IJQLSymbols.EOF)                         
                        break;
                                        
                    System.out.println(t.toString());
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (FileNotFoundException e1) {
            System.out.println(e1.getMessage());
        }
    }
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace = {LineTerminator} | [ \t\f]

Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
TraditionalComment = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/*" "*"+ [^/*] ~"*/"

DecIntegerLiteral = 0 | [1-9][0-9]*

FloatLiteral  = ({FLit1}|{FLit2}|{FLit3}) {Exponent}? [fF]
DoubleLiteral = ({FLit1}|{FLit2}|{FLit3}) {Exponent}?

FLit1    = [0-9]+ \. [0-9]* 
FLit2    = \. [0-9]+ 
FLit3    = [0-9]+ 
Exponent = [eE] [+-]? [0-9]+


Identifier = [:jletter:][:jletterdigit:]*
StringLiteral = \"[^\"]*\" | \'[^\']*\'

%%

<YYINITIAL> {

    "using"          { return token(USING); }
    "select"         { return token(SELECT); }
    "insert"         { return token(INSERT); }
    "update"         { return token(UPDATE); }
    "delete"         { return token(DELETE); }
    "where"          { return token(WHERE); }
    "groupBy"        { return token(GROUPBY); }
    "orderBy"        { return token(ORDERBY); }
    "ASC"            { return token(ASC); }
    "DESC"           { return token(DESC); }


    "="   { return token(EQ); }
    "!="  { return token(NE); }
    "<"   { return token(LT); }
    ">"   { return token(GT); }
    "<="  { return token(LTE); }
    ">="  { return token(GTE); }
    
    "{"         { return token(LBRACE); }
    "}"         { return token(RBRACE); }
    "["         { return token(LSQBRACE); }        
    "]"         { return token(RSQBRACE); }        
    ":"         { return token(COLON); } 
    ","         { return token(COMMA); }


    "AND"   { return token(AND); }
    "OR"    { return token(OR); }
    "NOT"   { return token(NOT); }
    "GROUP" { return token(GROUP); }

    {WhiteSpace} { /* Ignore whitespace */ }
    {Comment} { /* Ignore comments */ }

    {Identifier} { return token(IDENTIFIER, yytext()); }
    
    {DecIntegerLiteral}      { return token(INTEGER_LITERAL, Integer.parseInt(yytext())); }
    {FloatLiteral}           { return token(FLOAT_LITERAL, Float.parseFloat(yytext().replaceAll("[fF]$", ""))); }
    {DoubleLiteral}          { return token(DOUBLE_LITERAL, Double.parseDouble(yytext())); }    
    {DoubleLiteral}[dD]      { return token(DOUBLE_LITERAL, Double.parseDouble(yytext().replaceAll("[dD]$", ""))); }
    
    {StringLiteral} { return token(STRING_LITERAL, yytext().substring(1, yytext().length() - 1)); }

}

[^] { throw new RuntimeException("Illegal character \"" + yytext() + "\" at line " + yyline + ", column " + yycolumn); }
<<EOF>> { return token(EOF); }


