/*
(Postfix notation) Postfix notation is a way of writing expressions without
using parentheses. For example, the expression (1 + 2) * 3 would be
written as 1 2 + 3 *. A postfix expression is evaluated using a stack. Scan
a postfix expression from left to right. A variable or constant is pushed into
the stack. When an operator is encountered, apply the operator with the top
two operands in the stack and replace the two operands with the result. The
following diagram shows how to evaluate 1 2 + 3 *.
Write a program to evaluate postfix expressions. Pass the expression as a
command-line argument in one string.
 */

import java.util.Stack;

public class Main {
    public static void main(String[]args){
        if(args.length != 1){
            System.out.println("Usage:java Main 2 + 3");
            System.exit(1);
        }
        System.out.println(evaluateExpression(args[0]));
    }
    public static int evaluateExpression(String expression){
        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        expression = insertBlanks(expression);

        String[]tokens = expression.split(" ");

        for(String token:tokens){
            if(token.length() == 0){
                continue;
            }
            else if(token.charAt(0) == '+' || token.charAt(0) == '-'){
                while (!operatorStack.isEmpty() &&
                         (operatorStack.peek() == '+' ||
                         operatorStack.peek() == '−' ||
                         operatorStack.peek() == '*' ||
                         operatorStack.peek() == '/')) {
                    processAnOperator(operandStack, operatorStack);
                }
                operatorStack.push(token.charAt(0));
            }
            else if(token.charAt(0) == '*' || token.charAt(0) == '/'){
                while (!operatorStack.isEmpty() && (operatorStack.peek() == '*' || operatorStack.peek() == '/')) {
                    processAnOperator(operandStack, operatorStack);
                }
                operatorStack.push(token.charAt(0));
            }
            else if(token.trim().charAt(0) =='(') {
                operatorStack.push('(');
            }
            else if (token.trim().charAt(0) ==')') {
                while (operatorStack.peek() != '(') {
                    processAnOperator(operandStack, operatorStack);
                }
                operatorStack.pop();
            }
            else{
                operandStack.push(new Integer(token));
            }
        }
        while(!operandStack.isEmpty()){
            processAnOperator(operandStack, operatorStack);
        }
        return operandStack.pop();
    }

    public static void processAnOperator(Stack<Integer> operandStack, Stack<Character> operatorStack){
        char op = operatorStack.pop();
        int op1 = operandStack.pop();
        int op2 = operandStack.pop();
        if(op == '+'){
            operandStack.push(op2 + op1);
        }
        else if(op == '-'){
            operandStack.push(op2 - op1);
        }
        else if(op == '*'){
            operandStack.push(op2 * op1);
        }
        else if (op == '/') {
            operandStack.push(op2 / op1);
        }
    }



    public static String insertBlanks(String s){
        String result = "";

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '+' ||
            s.charAt(i) == '-' || s.charAt(i) == '/' || s.charAt(i) == '*'){
                result += " " + s.charAt(i) + " ";
            }
            else{
                result += s.charAt(i);
            }
        }
        return result;
    }
}
