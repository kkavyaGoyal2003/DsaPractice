import java.util.*;

public class Conversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        System.out.println("Binary Number: " + covertToBinary(num));

        System.out.println("Decimal Number: " + convertToDecimal(covertToBinary(num)));

    }

    public static String covertToBinary(int n) {
        StringBuilder str = new StringBuilder();

        while(n > 2) {
            int rem = n % 2;
            str.append(rem);
            n /= 2;
        }

        str.append(n);
        return str.reverse().toString();
    }

    public static int convertToDecimal(String num) {
        int n = 0;
        int pow = 1;

        for(int i = num.length() - 1; i >= 0; i--) {
            if(num.charAt(i) == '1') n += ((num.charAt(i) - '0') * pow);
            pow *= 2;
        }
        return n;
    }
}