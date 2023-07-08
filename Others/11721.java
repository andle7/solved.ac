import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i += 10) {
            if (i + 10 <= word.length()) {
                System.out.println(word.substring(i, i + 10));
            } else {
                System.out.println(word.substring(i));
            }
        }
    }
}
