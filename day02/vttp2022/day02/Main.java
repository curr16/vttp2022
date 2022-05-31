package vttp2022.day02;

public class Main {
    public static void main (String[]args) {
        System.out.println("good morning");
        
        String [] todos = new String[5];
        todos[0] = "learn git";
        todos[1] = "learn java";
        todos[2] = "revise my work";
        todos[3] = "watch a movie";
        System.out.printf("Index: %d: value = %s\n", 0, todos[0]);
        System.out.printf("Index: %d: value = %s\n", 0, todos[1]);
        System.out.printf("Index: %d: value = %s\n", 0, todos[2]);

        //every array has a property called length
        System.out.printf("Size of array %d\n", todos.length);

        //size of args
        System.out.printf("Size of args %d\n", args.length);
        System.out.printf("Index: %d: value = %s\n", 0, args[0]);
        System.out.printf("Index: %d: value = %s\n", 0, args[1]);
        

        //for loop
        for (int idx = 0; idx < args.length; idx++) {
            System.out.printf("idx = %d\n", idx);
        }
        
    }
}