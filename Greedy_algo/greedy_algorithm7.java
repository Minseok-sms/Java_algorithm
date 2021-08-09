//package java_tut;
//import java.util.Scanner;
//
//public class greedy_algorithm7 {
//
//	public static void main(String[] args) {
//		String str;
//		char[] array = new char[2];
//		Scanner input = new Scanner(System.in);
//		str = input.nextLine();
//		array[0] = str.charAt(0);
//		array[1] = str.charAt(1);
//		
//		int x,y,count;    // c2   3,2
//		x = array[0] - 'a' + 1;
//		y = array[1] - '0';
//		
//		
//		// 1,1
//		
//		count = 0;
//		if(x - 2 >= 1 && y - 1 >= 1)
//			count++;
//		if(x - 2 >= 1 && y + 1 <= 8)
//			count++;
//		if(x - 1 >= 1 && y - 2 >= 1)
//			count++;
//		if(x + 1 <= 8 && y - 2 >= 1)
//			count++;
//		if(x + 2 <= 8 && y - 1 >= 1)
//			count++;
//		if(x + 2 <= 8 && y + 1 <= 8)
//			count++;
//		if(x - 1 >= 1 && y + 2 <= 8)
//			count++;
//		if(x + 1 <= 8 && y + 2 <= 8)
//			count++;
//		
//		
//		System.out.println(count);
		
		
//		String str;
//		int[] dx = {-2,-1,1,2,2,1,-1,-2};
//		int[] dy = {-1,-2,-2,-1,1,2,2,1};
//		int i;
//		Scanner input = new Scanner(System.in);
//		str = input.nextLine();
//		int row,col;
//		int nextrow, nextcol,count = 0;
//		row = str.charAt(1) - '0';     //1
//		col = str.charAt(0) - 'a' + 1; //a
//		
//		for(i = 0; i < 8 ;i++) {
//			nextrow = row + dx[i];
//			nextcol = col + dy[i];
//			if(nextrow >= 1 && nextrow <=8 && nextcol >= 1 && nextcol <= 8) {
//				count++;
//			}
//		}
//		System.out.println(count);
//
//		
//	}
//
//}
