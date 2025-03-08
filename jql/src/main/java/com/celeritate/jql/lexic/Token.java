package com.celeritate.jql.lexic;

import java_cup.runtime.Symbol;

public class Token extends Symbol { 
    public int type;
    public SourcePosition pos;
    public Object content;	
	
    public String name(){
    	return IJQLSymbols.terminalNames[this.type];
    }
    
    public Token(int type, int line, int column, Object content) {
    	super(type, content);
        this.type = type;
        this.pos = new SourcePosition(line, column);
        this.content = content;
    }

    public String toString() {
        return "Token: " + (this.content == null ? this.name()  : this.content ) + " , " + "Type: " + this.name() + " , " + "Pos: " + this.pos;
    }    

}