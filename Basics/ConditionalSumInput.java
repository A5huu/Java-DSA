// 26. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.


import java.util.Scanner;
public class ConditionalSumInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1,sumneg=0,sumeven=0,sumodd=0;
        System.out.print("Enter the List : ");
        while(i != 0){
            i = sc.nextInt();
            if(i<0){
                sumneg= i+sumneg;
            }
            if(i>0){
                if(i%2==0){
                    sumeven+=i;
                } else {
                    sumodd += i;
                }
            }
        }
        if(sumneg != 0){
            System.out.println("The Sum of all Negative numbers from list is Sum = -" + sumneg);
        }
        if(sumeven != 0){
            System.out.println("The Sum of all even numbers from list is Sum = " + sumeven);
        }
        if(sumodd != 0){
            System.out.println("The Sum of all odd numbers from list is Sum = " + sumodd);
        }
    }
}
