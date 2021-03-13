package algorithm;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
public class greedy_algo4 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[N];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int count  = 0;
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i = 0 ; i < N ; i++ ) {
			i += arr[i] -1;
			count++;
		}
		System.out.println(count);
	}

}
