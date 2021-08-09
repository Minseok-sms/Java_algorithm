package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class etc2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;
		StringBuilder sb = new StringBuilder();
		while(true) {
			str = br.readLine();
			st = new StringTokenizer(str, " ");
			int result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			if(result == 0)
				break;
			else
				sb.append(result).append("\n");
			
		}
		System.out.println(sb);
	}

}
