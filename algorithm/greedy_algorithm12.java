//package java_tut;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.StringTokenizer;
//
///* น้มุ : 1541
// * 11 -15
// */
//
//public class greedy_algorithm12 {
//	static int min = 0;
//
//	public static void main(String[] args) throws IOException {
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		String str = br.readLine();
//		StringTokenizer st = new StringTokenizer(str);
//		
//		String[] array = str.split("-");
//		min += sum(array[0].split("[+]"));
//		
//		
//		
//		for(int i = 1; i < array.length;i++) {
//			min -= sum(array[i].split("[+]"));
//		}
//		br.close();
//		System.out.println(min);
//		
//	}
//	static int sum(String[] input) {
//		int result = 0;
//		for (String num : input) {
//			result += Integer.parseInt(num);
//		}
//		return result;
//	}
//
//}
