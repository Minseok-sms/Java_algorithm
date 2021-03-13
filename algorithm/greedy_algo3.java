package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class greedy_algo3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int result = 0;
		for(int i = 0 ; i < str.length(); i++) {
			if(str.charAt(i) == '0' || str.charAt(i) == '1') {
				result += Integer.parseInt(String.valueOf(str.charAt(i)));
			}
			else {
				if(result == 0 || result == 1) {
					result += Integer.parseInt(String.valueOf(str.charAt(i)));
				}
				else
					result *= Integer.parseInt(String.valueOf(str.charAt(i)));
			}
		}
		System.out.println(result);
	

	}

}
