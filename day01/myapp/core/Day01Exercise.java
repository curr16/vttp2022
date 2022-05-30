//hahahaahhahhahah

package myapp.core;

import java.io.Console;

public class Day01Exercise {
    public static void main(String[]args) {
       // get the console
       Console cons = System.console(); 

       String operand1 = cons.readLine("Operand1 (number)");
       
       String operand2 = cons.readLine("Operand2 (number)");
       //System.out.printf("Operand2 (number) %s", operand2);
       
       String operator = cons.readLine("Operator (add, div, sub, mul)");
       //System.out.printf("Operator (add, div, sub, mul) %s", add);

       int result = 0;
        if (operator.equals("add")){
            result = Integer.parseInt(operand1) + Integer.parseInt(operand2);

        } else if (operator.equals("sub")){
            result = Integer.parseInt(operand1) - Integer.parseInt(operand2);

        } else if (operator.equals("div")){
            result = Integer.parseInt(operand1) / Integer.parseInt(operand2);

        }  else if (operator.equals("mul")){
            result = Integer.parseInt(operand1) * Integer.parseInt(operand2);

        }
        System.out.printf("the result is %d", result);
    }
}