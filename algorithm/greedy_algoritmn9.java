//package java_tut;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class greedy_algoritmn9 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ArrayList<Integer> array = new ArrayList<>();
//		Scanner input = new Scanner(System.in);
//		int num, price;
//		int temp,index = 0;
//		num = input.nextInt();
//		price = input.nextInt();
//		
//		for(int i=0; i< num; i++) {
//			temp = input.nextInt();
//			array.add(temp);
//		}
//		
//		for(int i = num - 1; i >= 0 ;i--) {
//			if(array.get(i) < price) {
//				index = i;
//				break;
//			}
//		}
//	
//		int result = 0;
//		for(int i = index; i >= 0; i--) {
//			result += price / array.get(i);
//			price = price % array.get(i);
//			
//		}
//		System.out.println(result);
//		
//		
//		
//		
//	}
//
//}
