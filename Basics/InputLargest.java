// 25. Take integer inputs till the user enters 0 and print the largest number from
// all.

import java.util.Scanner;
public class InputLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int i=1,largest=0;
        while(i != 0){
            i = sc.nextInt();
            if(i > largest){
                largest = i;
            }
        }
        System.out.print("The largest number is : "+ largest);
    }
}
