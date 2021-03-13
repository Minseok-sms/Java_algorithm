//package java_tut;
///*
// * น้มุ : 1138
// * 11-23
// */
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//
//
//public class greedy_algorithm19 {
//
//	public static void main(String[] args) throws IOException {
//		LinkedList<Integer> list = new LinkedList<>(); 
//		Iterator<Integer> lt = list.iterator();
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int N = Integer.parseInt(br.readLine());
//		String temp = br.readLine();
//		StringTokenizer st = new StringTokenizer(temp, " ");
//		int[] array = new int[N];
//	
//		for(int i = 0; i < N ; i++)
//			array[i] = Integer.parseInt(st.nextToken());
//		int people = N;
//		for(int i = N-1; i >= 0 ; i--) {
//			list.add(array[i],people--);
//		}
//		
//		while(lt.hasNext()) {
//			System.out.println(lt.next());
//		}
////		for(int i = 0 ; i < N ; i++) {
////			if( i == N - 1)
////				System.out.println(list.get(i));
////			else
////				System.out.print(list.get(i) + " ");
////		}
////		
//	}
//
//}
