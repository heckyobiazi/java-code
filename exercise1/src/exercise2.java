import java.util.Scanner;
import javax.swing.*;



public class exercise2 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

   System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your cgpa: ");
       double cgpa = sc.nextDouble();

    System.out.println("Your name is " + name + " and you are " + age + " and you hvae a cgpa of " + cgpa );

    }

}
