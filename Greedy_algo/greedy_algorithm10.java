/*
 * 백준 : 1931
 * 11-15
 * 시간초과
 * 
 * 	배열 정렬
 */


//package java_tut;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//public class Main {
//
//	public static void main(String[] args) throws Exception, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		//Scanner input = new Scanner(System.in);
//		//int num = input.nextInt();
//		int num = Integer.parseInt(br.readLine());
//		
//		int[] array1 = new int[num];
//		int[] array2 = new int[num];
//		int i,j;
//		for( i = 0; i < num ; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			array1[i] = Integer.parseInt(st.nextToken());
//			array2[i] = Integer.parseInt(st.nextToken());
//		}
//		int temp;
//		for( i = 0 ; i < num; i++) {
//			for(j = i + 1; j < num; j++) {
//				if(array1[i] > array1[j]) {
//					temp = array1[i];
//					array1[i] = array1[j];
//					array1[j] = temp;
//					
//					temp = array2[i];
//					array2[i] = array2[j];
//					array2[j] = temp;
//				}
//			}
//		}
//
//		int k,l;
//		int count;
//		int counttemp= 0;
//		
//		int tempnum = 0;
//		
//		int index = 0;
//		int counting = 0;
//		for( i = 0; i < num ; i++) {
//			temp = array2[i];
//			count = 1;
//			for(j = i + 1; j < num; j++) {
//				if(array1[j] >= temp) {
//					tempnum = array1[j];
//					counting = 0;
//					for(k = j ; k < num ; k++) {
//						if(tempnum == array1[k])
//							counting++;
//					}
//					
//					int max = 0;
//					for(k = j; k < j + counting; k++ ) {
//						for(l = k+1; l < j+ counting; l++) {
//							if(array2[k] > array2[l]) {
//								max = array2[k];
//								array2[k] = array2[l];
//								array2[l] = max;
//							}
//						}
//					}
//					
//					count++;
//					temp = array2[j];
//				}
//			}
//			if( i == 0) 
//				counttemp = count;
//			if(counttemp < count)
//				counttemp = count;
//		}
//		bw.write(String.valueOf(counttemp));
//		bw.flush();
//		bw.close();
//		br.close();
//		
//		
//	}
//
//}
