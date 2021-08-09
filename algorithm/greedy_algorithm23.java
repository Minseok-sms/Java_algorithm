//package java_tut;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class greedy_algorithm23 {
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String number = br.readLine();
//		String charToString;
//		int num;
//		ArrayList<Character> arr = new ArrayList<>();
//		char[] myChar = new char[number.length()];
//		int numberLast = number.length();
//		for(int i = 0; i < numberLast; i++)
//			arr.add(number.charAt(i));
//		Collections.sort(arr,Collections.reverseOrder());
//		for(int i = 0; i < numberLast;i++)
//			myChar[i] = arr.get(i);
//		charToString = String.copyValueOf(myChar);
//		num = Integer.parseInt(charToString);
//		if(num % 30 == 0)
//			System.out.println(num);
//		else
//			System.out.println(-1);
//	}
//
//}
/*
 * น้มุ : 10610
 */
package java_tut;

import java.io.*;
import java.util.Arrays;

public class greedy_algorithm23 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String number = br.readLine();
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		char[] temp = number.toCharArray();
		Arrays.sort(temp);
		for(int i = temp.length-1; i >= 0; i--) {
			int num = temp[i] - '0';
			sum += num;
			sb.append(num);
		}
		if(temp[0] != '0' || sum % 3 != 0) {
			System.out.println(-1);
		}else
			System.out.println(sb);

	
	}

}