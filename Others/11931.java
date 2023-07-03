import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        Integer[] N = new Integer[number];
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < number; i++) {
            int num = Integer.parseInt(br.readLine());
            set.add(num);
        }

        set.toArray(N);
        Arrays.sort(N, (a, b) -> b - a);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int num : N) {
            bw.write(num + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
