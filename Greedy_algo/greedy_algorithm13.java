//package java_tut;
///*
// * 백준 : 2839
// * 11-22
// * 다시
// */
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class greedy_algorithm13 {
//
//	public static void main(String[] args) throws Exception, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int num = Integer.parseInt(br.readLine());
//		int result = 0;
//		while(true) {
//			if(num % 5 == 0) {
//				System.out.println(num/5 + result);
//				break;
//			}
//			else if(num < -1) {
//				System.out.println("-1");
//				break;
//			}
//				
//			num = num - 3;
//			result++;
//		}
//		
//	}
//
//}
