//package java_tut;
//import java.util.Scanner;
//
//public class greedy_algorithm5 {
//
//	public static void main(String[] args) {
//		//int[][] arr;
//		int x,y;
//		char[] movearr = new char[100];
//		String str,dummy;
//		int num,i;
//		Scanner input = new Scanner(System.in);
//		num = input.nextInt();
//		dummy = input.nextLine();
//		str = input.nextLine();
//		//arr = new int[num+1][num+1];  // 6x6 
//		x = 1;
//		y = 1;
//		
//		
//		
//		
//		for(i= 0;i < str.length();i++) {
//			movearr[i] = str.charAt(i);
//		}
//		
//		for(i = 0; i < str.length();i++) {
//			if(movearr[i] == 'R') {
//				if(x < num) {
//					x += 1;
//				}
//			}
//			else if(movearr[i] == 'L') {
//				if(x >= 2) {
//					x -= 1;
//				}
//			}
//			else if(movearr[i] == 'U') {
//				if(y >= 2) {
//					y -= 1;
//				}
//			}
//			else {
//				if(y < num ){
//					y += 1;
//				}
//			}
//		}
//		System.out.println(y + " " + x);
//		
//	
//	}
//
//}
