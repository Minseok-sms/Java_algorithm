//package java_tut;
//import java.util.Scanner;
//
//public class greedy_algorithm4 {
//
//	public static void main(String[] args) {
//		
//		int[] array;
//		Scanner input = new Scanner(System.in);
//		System.out.print("string input : ");
//		String str = input.nextLine();
//		int i,j,n,result = 0;
//		int count = 0;
//		array = new int[str.length()];
//		for(i = 0 ;i< str.length();i++) {
//			array[i] = str.charAt(i) - '0';
//		}
//		
//		for(i=0; i < array.length; i++) {
//			for(j= i + 1; j< array.length; j++) {
//				if(array[i] > array[j]) {
//					n = array[i];
//					array[i] = array[j];
//					array[j] = n;
//				}
//			}
//		}
//		
//		for(i = 0; i < array.length; i++) {
//			count++;
//			if(count >= array[i]) {
//				result++;
//				count= 0;
//			}
//			
//		}
//		
//		
//		System.out.println(result);
//	}
//
//}
