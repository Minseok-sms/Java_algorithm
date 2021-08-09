package java_tut;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class greedy_algorithm24 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		int result = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0 ; i < N ; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(array);
		for(int i = 0; i < N; i++) {
			for(int j = 0 ; j <= i ; j++) {
				result += array[j];
			}
		}
		System.out.println(result);
	}

}
