//2. Take name as input and print a greeting message for that particular name.

import java.util.Scanner;
public class Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = input.next();
        // System.out.print("Hello " + name);
        // System.out.print(", Have a Good day");
        System.out.println("Hello " + name + ", Have a good day");
    }
}
