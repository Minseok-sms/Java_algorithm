package DP;

import java.io.*;
public class dp1 {

	public static void main(String[] args) throws Throwable, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Num = Integer.parseInt(br.readLine());
		int count = 0;
		while(true) {
			
			if(Num / 2 == 1) {
				count++;
				break;
			}
			
			
			
			
			
			
			
			
			if(Num % 2 == 0) {
				Num = Num / 2;
				count++;
			}
			else if(Num % 3 == 0) {
				Num = Num / 3;
				count++;
			}
			else {
				Num = Num - 1;
				count++;
			}
			
		}
	}
}
