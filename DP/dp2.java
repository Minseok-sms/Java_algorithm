package DP;
import java.io.*;
import java.util.StringTokenizer;
public class dp2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[1000];
		int N = Integer.parseInt(br.readLine());
		int[] k = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			k[i] = array[i];
		}
		for(int i = 2; i < N ; i++) {
			array[i] = Math.max(array[i-1], array[i-2] + k[i]);
		}
		System.out.println(array[N-1]);
		
	}
}
