import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String let = "";

        let = in.nextLine();
        let = let.toLowerCase();

        int[] alpha_cnt = new int[26];

        for (int i = 0; i < let.length(); i++) {
            char ch = let.charAt(i);
            if (ch >= 'a' && ch <= 'z') { 
                int index = ch - 'a';
                alpha_cnt[index]++;
            }
        }

        for (int i = 0; i < alpha_cnt.length; i++) {
            System.out.print(alpha_cnt[i] + " ");
        }
    }
}
