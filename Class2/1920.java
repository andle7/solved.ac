import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        HashSet<Integer> letSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            letSet.add(Integer.parseInt(input[i]));
        }

        int M = Integer.parseInt(br.readLine());
        input = br.readLine().split(" ");
        int[] let2 = new int[M];
        for (int i = 0; i < M; i++) {
            let2[i] = Integer.parseInt(input[i]);
        }

        int[] result = new int[M];
        for (int i = 0; i < M; i++) {
            if (letSet.contains(let2[i])) {
                result[i] = 1;
            }
        }

        for (int i = 0; i < M; i++) {
            System.out.println(result[i]);
        }
    }
}