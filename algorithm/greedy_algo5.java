package algorithm;

import java.io.*;
import java.util.*;

public class greedy_algo5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] map = new int[N+1][N+1];
		String way = "";
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		while(st.hasMoreTokens()) {
			way += st.nextToken();
		}
		int x = 1, y = 1;
		
		for(int i = 1; i <= way.length(); i++) {
			if(way.charAt(i-1) == 'R') {
				if(y + 1 <= N) {
					y++;
				}
			}
			else if(way.charAt(i-1) == 'U') {
				if(x -1 >= 1)
					x--;
			}
			else if(way.charAt(i-1) == 'L') {
				if(y - 1 >= 1)
					y--;
			}
			else if(way.charAt(i-1) == 'D') {
				if(x + 1 <= N)
					x++;
			}
			
		}
		System.out.println(x + " " + y);

	}

}
