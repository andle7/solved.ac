import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
		int N = Integer.parseInt(br.readLine());
		int[] let = new int[N];
        
		for(int i = 0; i < N; i++){
			let[i] = Integer.parseInt(br.readLine());
		}
        
		Arrays.sort(let);
        
		for(int i = 0; i < N; i++){
			sb.append(let[i]).append('\n');
		}
 
		System.out.println(sb);
	}
}