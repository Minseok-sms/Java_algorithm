//package java_tut;
//import java.util.Scanner;
//
//public class greedy_algorithm3 {
//	public static void main(String[] args) {
//		
//		int i,j;
//		int addcount = 0;
//		char[] str2 = {0,};
//		int[] array;
//		Scanner input = new Scanner(System.in);
//		System.out.println("string input : ");
//		String str = input.nextLine();
//		str2 = str.toCharArray();
//		
//		array = new int[str2.length];
//		for(i=0 ;i <str2.length;i++) {
//			array[i] = str2[i] - '0';
//		}
//		
//		addcount = array[0];
//		for(i = 0; i < array.length;i++) {
//			j = i + 1;
//			if(j == array.length) {
//				break;
//			}
//			if(array[i] * array[j] == array[i]) {
//				addcount += array[j];
//			}
//			else if( array[i] * array[j] == 0) {
//				addcount += array[j];
//			}
//			else {
//				addcount *= array[j];
//			}
//		}
//		System.out.println(addcount);
//		
//	}
//}
