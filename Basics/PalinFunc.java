// 10. [Write a function to find if a number is a palindrome or not. Take number as parameter.]
// (https://www.geeksforgeeks.org/check-if-a-number-is-palindrome/)

import java.util.Scanner;
public class PalinFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to check pelindrome : ");
        int num = sc.nextInt();
        palindrome(num);
    }
    public static void palindrome(int n){
        int rev=0,rem=0,org=n;
        while(n!=0){
            rem = n%10;
            rev = (rev*10)+rem;
            n/=10;
        }
        if(rev == org){
            System.out.printf("The number %d is a palindrome.", org);
        } else{
            System.out.printf("The number %d is not a palindrome.", org);
        }
    }
}
