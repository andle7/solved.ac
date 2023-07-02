import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] let = br.readLine().split(" ");
        int N = Integer.parseInt(let[0]);
        int M = Integer.parseInt(let[1]);

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

/*
        for(int i = 0; i< N; i++) {
        	for (int j = 0; j < M; j++) {
				System.out.print(board[i][j]);
			}
        	System.out.println();
        }
*/       
        
        
        int minCount = Integer.MAX_VALUE;
        
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
            	
                int count = 0;
                
                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {
                    	
                        if ((x + y) % 2 == 0) {
                            if (board[x][y] != 'W') {
                                count++;
                            }
                        } else {
                            if (board[x][y] != 'B') {
                                count++;
                            }
                        }
                        
                    }
                }
                minCount = Math.min(minCount, count);
                minCount = Math.min(minCount, 64 - count);
            }
        }

        System.out.println(minCount);
    }
}
