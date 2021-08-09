//package java_tut;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//public class greedy_algorithm14 {
//
//	public static void main(String[] args) throws Exception, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int num = Integer.parseInt(br.readLine());
//		int[] array = {500,100,50,10,5,1};
//		int total = 1000 - num;  //620
//		int count = 0;
//	
//		for(int i = 0; i < 6; i++) {
//			while(true) {
//				if(total / array[i] > 0) {
//					total = total - array[i];
//					count++;
//				}else
//					break;
//			}
//		}
//		System.out.println(count);
//		br.close();
//	}
//
//
//}
