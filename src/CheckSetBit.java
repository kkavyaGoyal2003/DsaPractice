public class CheckSetBit {
    public static void main(String[] args) {
        int n = 13;
        int i = 1;

        String str = covertToBinary1(n);
        int len = str.length();

        if(str.charAt(len - i -1) == '1') System.out.println("it has a set bit");
        else System.out.println("not a set bit");
    }

    public static String covertToBinary1(int n) {
        StringBuilder str = new StringBuilder();

        while(n > 2) {
            int rem = n % 2;
            str.append(rem);
            n /= 2;
        }

        str.append(n);
        return str.reverse().toString();
    }

}
