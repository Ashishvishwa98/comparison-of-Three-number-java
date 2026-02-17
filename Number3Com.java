
import java.util.*;

public class Number3Com {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a:");
        float a = sc.nextFloat();

        System.out.print("Enter the value of b:");
        float b = sc.nextFloat();

        System.out.print("Enter the value of c:");
        Float c = sc.nextFloat();

        if (a > b && a > c) {
            System.out.println("A number is greater");
        } else if (b > a) {
            System.out.println("B number is greather");
        } else {
            System.out.println("C number is greater");
        }

    }

}
