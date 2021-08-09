//package Sorting;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.StringTokenizer;
//
//public class sorting_algorithm1 {
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int N = Integer.parseInt(st.nextToken());
//		int K = Integer.parseInt(st.nextToken());
//		int[] arr1 = new int[N];
//		ArrayList<Integer> arr2 = new ArrayList<>();
//		
//		st = new StringTokenizer(br.readLine());
//		for(int i = 0 ; i < N ; i++) arr1[i] = Integer.parseInt(st.nextToken());
//		st = new StringTokenizer(br.readLine());
//		for(int i = 0 ; i < N ; i++) arr2.add(Integer.parseInt(st.nextToken()));
//		
//		Arrays.sort(arr1);
//		Collections.sort(arr2);
//		
//		int index = 0;
//		for(int i = N-1 ; i > N-1-K; i--) {
//			arr1[index++] = arr2.get(i);
//		}
//		int result = 0;
//		for(int i = 0; i < N; i++) result += arr1[i];
//		
//		bw.write(String.valueOf(result));
//		bw.flush();
//		bw.close();
//		br.close();
//	}
//}
