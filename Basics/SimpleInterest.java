// 3. Write a program to input principal, time, and rate (P, T, R) from the user and
// find Simple Interest.

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principle Time and Rate: ");
        float p = input.nextFloat();
        float t = input.nextFloat();
        float r = input.nextFloat();
        float si = (p*t*r)/100;
        System.out.print("The simple interest is : " + si);
    }

}
