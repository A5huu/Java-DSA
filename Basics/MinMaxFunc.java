// 1. [Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.]
// (https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html)

import java.util.Scanner;
public class MinMaxFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int largest = largest(first, second, third); 
        int smallest = smallest(first, second, third);
        System.out.printf("The largest among the three number %d %d %d is : %d %n", first,second,third,largest);
        System.out.printf("The smallest among the three number %d %d %d is : %d %n", first,second,third,smallest);
    }
    public static int largest(int first, int second, int third){
        int max = first;
        if(second > max){
            max = second;}
        if(third > max){
            max = third;
            }
        return max;
        }
    public static int smallest(int first, int second, int third){
        int min = first;
        if(second < min){
            min = second;
        }
        if(third < min){
            min = third;
        }
        return min;
    }
}

