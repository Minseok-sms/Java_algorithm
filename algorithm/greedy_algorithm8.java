//package java_tut;
//import java.util.Scanner;
//
//public class greedy_algorithm8 {
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		String str = input.nextLine();
//		int i,j,indexCount = 0, result = 0;
//		char max;
//		char[] array;
//		array = new char[str.length()];
//		
//		for(i = 0;i < str.length(); i++) {
//			array[i] = str.charAt(i);
//		}
//		for(i=0;i<str.length();i++) {
//			for(j=i+1;j < str.length(); j++) {
//				if(array[i] > array[j]) {
//					max = array[i];
//					array[i] = array[j];
//					array[j] = max;
//					
//				}
//				
//			}
//		}
//		for(i= 0 ; i < str.length(); i++) {
//			if(array[i] < 'A') {
//				indexCount++;
//				result += array[i] - '0';
//			}
//		}
//	
//		for(i =0; i < str.length() - indexCount;i++) {
//			array[i] = array[indexCount + i];
//		}
//	
//		
//	
//		
//		for(i =0; i < str.length() - indexCount;i++) {
//			System.out.print(array[i]);
//		}
//		System.out.println(result);
//		
//		
//	
//		
//
//	}
//
//}
