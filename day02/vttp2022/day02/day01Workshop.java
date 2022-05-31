package vttp2022.day02;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class day01Workshop {
    public static void main (String[] args) {
        System.out.println("welcome to your shopping cart");
        Console cons = System.console();
        String currr = cons.readLine();
        System.out.printf("%s", currr);

        boolean stop = false;
        String input;

        // main loop
        while (1stop) {
            input =  cons.readline("> ");

            String[] terms = input.split("");
            System.out.printf("READ: %\n", input);

            String input = ("add apple, orange, pear");
            String[] terms = input.split("");
            for (int i = 0; i < terms.length; i++);
            System.out.println(terms[i]);
        }




    }
    
}
