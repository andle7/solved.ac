import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = sc.nextInt();
		
		while(true) {
			String let = sc.nextLine();
			if(let.equals("="))
				break;
			switch(let) {
				case "+":
					sum += sc.nextInt();
					break;
				case "-":
					sum -= sc.nextInt();
					break;
				case "*":
					sum *= sc.nextInt();
					break;
				case "/":
					sum /= sc.nextInt();
					break;
				default:
					break;
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}
