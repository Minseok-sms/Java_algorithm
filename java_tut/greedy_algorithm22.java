package java_tut;
import java.io.*;
import java.util.StringTokenizer;



public class greedy_algorithm22 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N, M, K;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		int max = N/2 < M ? N/2 : M;
		K -= N + M - max * 3;
		
		while(K > 0) {
			K -= 3;
			max--;
		}
		System.out.println(max);
	
	}

}
