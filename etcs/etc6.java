package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class etc6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		String str = br.readLine();
		for(int i = 0; i < N; i++) {
			result += str.charAt(i) - 48;
		}
		System.out.println(result);
	}

}
