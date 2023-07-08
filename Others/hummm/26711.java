import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        String result = addBigIntegers(a, b);
        System.out.println(result);
    }

    public static String addBigIntegers(String a, String b) {
        StringBuilder sum = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = i >= 0 ? a.charAt(i) - '0' : 0;
            int digitB = j >= 0 ? b.charAt(j) - '0' : 0;

            int digitSum = digitA + digitB + carry;
            carry = digitSum / 10;
            int remainder = digitSum % 10;

            sum.insert(0, remainder);

            i--;
            j--;
        }

        return sum.toString();
    }
}
