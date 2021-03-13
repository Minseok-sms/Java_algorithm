package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class search_algorithm10 {

	public static void main(String[] args) throws Exception, Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		list.add(0);
		
		for(int i = 0 ; i < N; i++) {
			int value = array[i] = Integer.parseInt(st.nextToken());
			if(value > list.get(list.size() - 1)) {
				list.add(value);
			}else {
				int left = 0;
				int right = list.size() - 1;
				while(left < right) {
					int mid = (left + right)/ 2;
					if(list.get(mid) >= value)
						right = mid;
					else
						left = mid + 1;
				}
				
				list.set(right, value);
			}
		}
		System.out.println(list.size() - 1);
		
	}
}
