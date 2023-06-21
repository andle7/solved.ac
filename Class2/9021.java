import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }

        for (String str : list) {
            int count = 0;
            boolean isValid = true;

            for (char ch : str.toCharArray()) {
                if (ch == '(') {
                    count++;
                } else if (ch == ')') {
                    count--;
                    if (count < 0) {
                        isValid = false;
                        break;
                    }
                }
            }

            if (count == 0 && isValid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
