//package java_tut;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class greedy_algorithm17 {
//
//	public static void main(String[] args) throws Exception, IOException {
//		int[] alpArray = new int[26];
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int num = Integer.parseInt(br.readLine());
//		String[] array = new String[num];
//		for(int i = 0; i < num; i++) {
//			array[i] = br.readLine();
//		}
//		for(int i = 0; i < num; i++) {
//			for(int j = i; j < num; j++) {
//				if(array[i].length() < array[j].length()) {
//					String temp = array[i];
//					array[i] = array[j];
//					array[j] = temp;
//				}
//				
//			}
//		}
//		int maximum = 9;
//
//	}
//
//}
