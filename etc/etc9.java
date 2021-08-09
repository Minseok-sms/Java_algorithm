package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class etc9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> array = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < N ; i++)
			array.add(Integer.parseInt(st.nextToken()));
		Collections.sort(array);
		sb.append(array.get(0) + " ").append(array.get(N-1)).append("\n");
		System.out.println(sb);
			
	}
}
