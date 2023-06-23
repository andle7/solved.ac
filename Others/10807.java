import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int let[] = new int[N];			
        int cnt = 0;						
        	

        for(int i = 0; i < N; i++) {
            let[i] = sc.nextInt();			
        }
        int v = sc.nextInt();				

        for(int j = 0; j < let.length; j++){ 
            if(v == let[j]){				
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}