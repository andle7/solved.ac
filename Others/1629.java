import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        BigInteger[] numbers = new BigInteger[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new BigInteger(input[i]);
        }

        BigInteger result = modularExponentiation(numbers[0], numbers[1], numbers[2]);

        System.out.println(result);
    }

    private static BigInteger modularExponentiation(BigInteger base, BigInteger exponent, BigInteger modulus) {
        BigInteger result = BigInteger.ONE;

        base = base.mod(modulus);

        while (exponent.compareTo(BigInteger.ZERO) > 0) {
            if (exponent.testBit(0)) {
                result = result.multiply(base).mod(modulus);
            }
            base = base.multiply(base).mod(modulus);
            exponent = exponent.shiftRight(1);
        }

        return result;
    }
}