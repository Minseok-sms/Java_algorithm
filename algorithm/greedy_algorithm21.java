package java_tut;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class greedy_algorithm21 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N, K, count = 0;
		int length;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		ArrayList<Integer> array = new ArrayList<>();
		for(int i = 0; i < N; i++)
			array.add(Integer.parseInt(br.readLine()));
		length = array.size();
		
		while(true) {
			if(length - 1 == -1)
				break;
			if(K / array.get(length - 1) == 0) {
				length--;
			}else {
				count += K / array.get(length - 1);
				K = K %  array.get(length - 1);
			}
		}
		System.out.println(count);
	}
}
