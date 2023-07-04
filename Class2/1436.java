import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int count = 0;
        int num = 666;
        
        while (count < N) {
            if (contains666(num)) {
                count++;
            }
            num++;
        }

        System.out.println(num - 1);
    }

   
    private static boolean contains666(int num) {
        String let = Integer.toString(num);
        return let.contains("666");
    }
}
