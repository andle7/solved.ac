import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int let[] = new int[N];
		int cnt = 0;
		
		
		String input[] = br.readLine().split(" ");
		
		for (int i = 0; i < let.length; i++) {
			
			
			let [i] = Integer.parseInt(input[i]);
			
		}
		
		
		
		for (int i = 0; i < let.length; i++) {
			boolean decimal = sosu(let[i]);
		        
		        if (decimal) {
		        	cnt++;
		           
		        } 
		        
		}
		
		 
	      System.out.println(cnt); 
		
		
		
		
		
	}
	
	
    public static boolean sosu(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
	
	
}
