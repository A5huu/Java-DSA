//24. Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.Scanner;
public class SumInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers : ");
        int i=1, sum =0;
        while(i != 0){
            i = sc.nextInt();
            sum = sum + i;
        }
        System.out.println("The Sum of all numbers entered is : "+ sum);
    }
}