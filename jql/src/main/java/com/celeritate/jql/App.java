package com.celeritate.jql;

import com.celeritate.jql.lexic.JQLLexer;
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
            
            JQLLexer.enumerateTokens(filePath);
            
            JQLLexer lexer = new JQLLexer(new FileReader(filePath));        
        } catch (Exception e) {
            e.printStackTrace();
        }		
    }
}
