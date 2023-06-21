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
		
		for (int i = 0; i < N; i++) {
			System.out.println(list.get(i).charAt(0) + ""+ list.get(i).charAt(list.get(i).length()-1));
		}
		
	}
}
