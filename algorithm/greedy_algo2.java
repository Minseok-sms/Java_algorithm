package algorithm;

import java.io.*;
import java.util.StringTokenizer;
public class greedy_algo2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int count = 0;
		while(N > 1) {
			
			if((N % K) != 0){
				N--;
				count++;
			}else {
				N = N / K;
				count++;
			}
		}
		System.out.println(count);
	}

}
