// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
// (Use if conditions)

import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        int result=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any two numbers :");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.print("Enter any operator : (+,-,*,/) : ");
        char op = input.next().charAt(0);
        if(op == '+' || op == '-' || op == '*' || op == '/'){
            if(op == '+'){
                result=a+b;
            }
            else if(op == '-'){
                result= a-b;
            }
            else if(op == '*'){
                result=a*b;
            }
            else{
                result= a/b;
            }
            System.out.println("Result = " +result);
        }
        else {
            System.out.println("Invalid Operator, Exiting Program !");
        }
    }
}
