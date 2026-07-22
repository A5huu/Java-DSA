//### Intermediate Java Programs
//1. Factorial Program In Java

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        System.out.print("Enter any number : ");
        Scanner input = new Scanner(System.in);
        int fact=1;
        int n = input.nextInt();
        if(n==0 || n==1){
            return;} else{
                for(int i = 1; i<=n; i++){
                    fact=fact*i;
                }
            }
        System.out.println("The factorial = " + fact);
    }
}
