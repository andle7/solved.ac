import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = 0;
		String let[];
		ArrayList<Integer> list = new ArrayList<>();
		int data;
		
		N = in.nextInt();
		
		let = new String[N];
		
		
		for (int i = 0; i < let.length; i++) {
			
			let[i] =  in.next();

			if(let[i].equals("push")) {
				data = in.nextInt();
				list.add(data);
				
			}else if(let[i].equals("pop")) {
				
				if(list.size() == 0) {
					System.out.println("-1");
				}else {
					System.out.println(list.get(list.size()-1));
					list.remove(list.size() -1);
				}
				
			}
			else if(let[i].equals("top")) {
				if(list.size() == 0) {
					System.out.println(-1);
				}else {
					System.out.println(list.get(list.size()-1));
				}
			} else if(let[i].equals("size")) {
				System.out.println(list.size());
			} else if(let[i].equals("empty")) {
				if(list.size() == 0) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}

		}		
	}
}
