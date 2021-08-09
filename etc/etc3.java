package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class etc3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N ; i++) {
			str = br.readLine();
			st = new StringTokenizer(str, " ");
			int temp1 = Integer.parseInt(st.nextToken());
			int temp2 = Integer.parseInt(st.nextToken());
			sb.append("Case #" + (i+1) + ": ").append(temp1).append(" + ").append(temp2).append(" = ").append(temp1+temp2).append("\n");
		}
		System.out.println(sb);
	}

}
