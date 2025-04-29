import java.util.Scanner;

public class AllBitsSet {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = scan.nextInt();

        int set = n & (n + 1) ;

        if(set == 0) System.out.println("All bits are set");
        else System.out.println("All bits are not set");
    }
}
