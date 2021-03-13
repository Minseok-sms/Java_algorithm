/* 백준 : 11399
 * 11 -15
 * 합
 */

//
//package java_tut;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStream;
//import java.io.OutputStreamWriter;
//import java.util.StringTokenizer;
//
//public class greedy_algorithm11 {
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int i,j;
//		int num = Integer.parseInt(bf.readLine()); // 전체 N값
//		int[] array = new int[num];
//		StringTokenizer st = new StringTokenizer(bf.readLine());
//		
//		
//		for(i = 0; i < num ; i++) {
//			array[i] = Integer.parseInt(st.nextToken());
//		}
//		for(i = 0; i < num; i++) {
//			for(j = i+1 ; j < num; j++) {
//				if(array[i] > array[j]) {
//					int max = array[i];
//					array[i] = array[j];
//					array[j] = max;
//				}
//			}
//		}
//		int result = 0;
//		int sum = 0;
//		for(i = 0 ; i < num; i++) {
//			for(j = 0; j <= i ; j ++) {
//				sum += array[j];
//			}
//			result += sum;
//			sum = 0;
//		}
//		bw.write(String.valueOf(result));
//		bw.flush();
//		bw.close();
//		bf.close();
//		
//		
//	}
//
//}
