import java.util.*;

public class SwapNumbers {
    public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Numbers before swap :");
        System.out.println("a = " + a + "\tb = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Numbers after swap :");
        System.out.println("a = " + a + "\tb = " + b);
    }

}
