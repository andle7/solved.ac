import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (true) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            
            if (x == 0 && y == 0 && z == 0) break;
            
            boolean isRightTriangle = checkRightTriangle(x, y, z);
            
            if (isRightTriangle) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
    
    private static boolean checkRightTriangle(int x, int y, int z) {
        int max = Math.max(Math.max(x, y), z);
        
        if (max == x) {
            return x * x == y * y + z * z;
        } else if (max == y) {
            return y * y == x * x + z * z;
        } else {
            return z * z == x * x + y * y;
        }
    }
}