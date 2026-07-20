import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Roll No. :");
        int rollno = input.nextInt();
        System.out.print("Enter Your Name :");
        String name = input.next();
        System.out.print("Enter Your Marks :");
        float marks = input.nextFloat();
        System.out.println("Your Roll no is :" + rollno);
        System.out.println("Your Name is :" + name);
        System.out.println("Your Marks :" + marks);
    }
}
