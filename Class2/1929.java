import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String input[] = br.readLine().split(" ");
		int s = Integer.parseInt(input[0]);
		int e = Integer.parseInt(input[1]);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		

		
		for (int i = s; i <= e; i++) {
			boolean decimal = sosu(i);
		    
		        if (decimal) {
		        	
		        	list.add(i);

		        } 
		       
		}
		
		
		list.forEach(System.out::println);
		
		
		
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
