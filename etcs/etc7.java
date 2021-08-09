package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class etc7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int k = 0;
		for(int i = 0; i < str.length(); i++) {
			if(k == 10) {
				k = 0;
				sb.append("\n");
			}
			sb.append(str.charAt(i));
			k++;
		}
		System.out.println(sb);
	}
}
