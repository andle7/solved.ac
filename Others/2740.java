import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int let[][] = new int[N][M];

        for (int i = 0; i < N; i++) {
            input = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                let[i][j] = Integer.parseInt(input[j]);
            }
        }

        input = br.readLine().split(" ");

        int m = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int let2[][] = new int[m][k];

        for (int i = 0; i < m; i++) {
            input = br.readLine().split(" ");
            for (int j = 0; j < k; j++) {
                let2[i][j] = Integer.parseInt(input[j]);
            }
        }

        int let3[][] = new int[N][k];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < k; j++) {
                int sum = 0;
                for (int x = 0; x < M; x++) {
                    sum += let[i][x] * let2[x][j];
                }
                let3[i][j] = sum;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(let3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
