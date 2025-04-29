import java.util.Scanner;

public class CheckSetBit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number and the ith bit you want to check:");
        int n = scan.nextInt();
        int i = scan.nextInt();

        int temp = 1 << i;
        int  ans = n & temp;
        if(ans > 0) {
            System.out.println("It is Set");
        } else {
            System.out.println("It is Unset");
        }


    }
}
