import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";

        while (true) {
            input = in.nextLine();
            if (input.length() <= 1000000) {
                break;
            }
        }

        input = input.trim();

        if (input.isEmpty()) {
            System.out.println("0");
        } else {
          
            String[] words = input.split("\\s+");
            int count = words.length;
            System.out.println(count);
        }
    }
}