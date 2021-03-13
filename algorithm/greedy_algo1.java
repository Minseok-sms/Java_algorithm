package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class greedy_algo1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		Long K = Long.parseLong(st.nextToken());
		
		
		int[] cash = new int[N];
		for(int i = 0; i < N; i++) {
			cash[i] = Integer.parseInt(br.readLine());
		}
		int count = 0 ;
		for(int i = N-1 ; i >= 0; i--) {
			if((K / cash[i]) != 0) {
				count += K / cash[i];
				K = K % cash[i];
			}
		}
		System.out.println(count);
		
	}

}
