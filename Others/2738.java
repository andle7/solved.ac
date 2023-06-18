import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input[] = br.readLine().split(" ");
        int col = Integer.parseInt(input[0]);
        int row = Integer.parseInt(input[1]);

        int[][] pro = new int[col][row];
        int[][] pro2 = new int[col][row];
        int[][] sum = new int[col][row];

        for (int i = 0; i < col; i++) {
            input = br.readLine().split(" ");
            for (int j = 0; j < row; j++) {
                pro[i][j] = Integer.parseInt(input[j]);
            }
        }

        for (int i = 0; i < col; i++) {
            input = br.readLine().split(" ");
            for (int j = 0; j < row; j++) {
                pro2[i][j] = Integer.parseInt(input[j]);
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                sum[i][j] = pro[i][j] + pro2[i][j];
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
