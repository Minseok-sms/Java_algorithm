//package Sorting;
///*
// * น้มุ : 2108
// * 11 -30
// */
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class sorting_algorithm2 {
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int N = Integer.parseInt(br.readLine());
//		int[] array = new int[N];
//		for(int i = 0 ; i < N; i++) array[i] = Integer.parseInt(br.readLine());
//		
//		Arrays.sort(array);
//		
//		double average = 0;
//		for(int i = 0 ; i < N; i++) average += array[i];
//		System.out.println(Math.round(average / N));
//		
//		
//		int median = array[N / 2];
//		System.out.println(median);
//		
//		int mostNum = 0;
//		int[] cnt = new int[8001];
//		for(int i = 0 ; i < N; i++) cnt[array[i] + 4000]++;
//		
//		ArrayList<Integer> list = new ArrayList<>();
//		for(int i = 0; i < 8001 ; i++) {
//			if(cnt[i] >= mostNum)
//				mostNum = cnt[i];
//		}
//		for(int i = 0; i < 8001 ; i++) {
//			if(cnt[i] == mostNum)
//				list.add(i-4000);
//		}
//		if(list.size() == 1)
//			System.out.println(list.get(0));
//		else
//			System.out.println(list.get(1));
//			
//		System.out.println(array[N-1] - array[0]);
//		
//	}
//
//}
