/*
(Postfix notation) Postfix notation is a way of writing expressions without
using parentheses. For example, the expression (1 + 2) * 3 would be
written as 1 2 + 3 *. A postfix expression is evaluated using a stack. Scan
a postfix expression from left to right. A variable or constant is pushed into
the stack. When an operator is encountered, apply the operator with the top
two operands in the stack and replace the two operands with the result. The
following diagram shows how to evaluate 1 2 + 3 *

Write a program to evaluate postfix expressions. Pass the expression as a
command-line argument in one string.
*/
import java.util.Stack;


public class Exercise20_14{
    private static int start = 0;
    public static void main(String[]args){
        if(args.length != 1){
            System.out.print("Usage: java Exercise20_13 \"2 3 +\"");
            System.exit(1);
        }
        Stack<Integer> operand = new Stack<>();
        String task = args[0].trim();
        while(task.length() != 0){
            String oo = insert(task);
            if(oo == null){
                break;
            }
            if(start >= task.length()){
                task = task.substring(task.length());
            }
            else{
                task = task.substring(start);
            }
            if(oo.equals("+") || oo.equals("-") || oo.equals("*") || oo.equals("/")){
                int num2 = operand.pop();
                int num1 = operand.pop();
                switch (oo) {
                    case "+":
                        operand.push(num1 + num2);
                        break;
                    case "-":
                        operand.push(num1 - num2);
                        break;
                    case "*":
                        operand.push(num1 * num2);
                        break;
                    default:
                        operand.push(num1 / num2);
                        break;
                }
            }
            else{
                operand.push(Integer.parseInt(oo));
            }
        }
        System.out.print("The result is " + operand.pop());
    }



    public static String insert(String task){
        StringBuilder t = new StringBuilder();
        boolean num = false;
        for(int i = 0; i < task.length(); i++){
            if(task.charAt(i) >= '0' && task.charAt(i) <= '9'){
                t.append(task.charAt(i));
                num = true;
            }
            else if((task.charAt(i) == '+' || task.charAt(i) == '-' || task.charAt(i) == '*' || task.charAt(i) == '/') && t.length() == 0){
                start = i + 1;
                return task.charAt(i) + "";
            }
            else if(task.charAt(i) == ' ' && num){
                start = i + 1;
                return t.toString().trim();
            }
        }
        return null;
    }
}