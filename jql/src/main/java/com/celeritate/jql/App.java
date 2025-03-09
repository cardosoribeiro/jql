package com.celeritate.jql;

import com.celeritate.jql.lexic.JQLLexer;
import com.celeritate.jql.syntactic.JQLParser;
import java.io.FileReader;

import com.celeritate.jql.ast.Query;
/**
 * JQL Tradutor
 * @author J. Eurique Cardoso Ribeiro Junior
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        try {        
            //Class.forName("java_cup.runtime.Scanner");    
            String filePath = ".\\query.jql";
            
            JQLLexer.enumerateTokens(filePath);
            
            JQLLexer lexer = new JQLLexer(new FileReader(filePath));        
            JQLParser parser = new JQLParser(lexer);

            Query qry = (Query) parser.parse().value;   

            System.out.println("I am parsing JQL!");

        } catch (Exception e) {
            e.printStackTrace();
        }		
    }
}
