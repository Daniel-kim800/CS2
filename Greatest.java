import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {

        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a:");
        a = s.nextInt();
        System.out.print("Enter b:");
        b = s.nextInt();
        System.out.print("Enter c:");
        c = s.nextInt();
        if (a > b && a > c) {
            System.out.println("Largest number is a which is " +a);
        } else if (b > c) {
            System.out.println("Largest number is b which is " +b);
        } else {
            System.out.println("Largest number is c which is " +c);
        }

    }
}
