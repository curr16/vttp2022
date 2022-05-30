package myapp.core;

import java.io.Console;

public class Greetings {    

    // write the entry point
    public static void main(String[]args) {
        // get the console
        Console cons = System.console(); 
        
        // read the input
        String name = cons.readLine("What is your name?");
        System.out.printf("hello %s. Nice to meet you.\n", name.toUpperCase());
    
    }

    
   
}
