// How to test the parser?
package com.celeritate.jql;

import com.celeritate.jql.lexic.JQLLexer;
import com.celeritate.jql.syntactic.JQLParser;
import java.io.FileReader;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        try {        
            //Class.forName("java_cup.runtime.Scanner");    
            String filePath = ".\\query.jql";
            
            //JQLLexer.enumerateTokens(filePath);
            
            JQLLexer lexer = new JQLLexer(new FileReader(filePath));        
            JQLParser parser = new JQLParser(lexer);

            parser.parse();

            System.out.println("I am parsing JQL!");

        } catch (Exception e) {
            e.printStackTrace();
        }		
    }
}
