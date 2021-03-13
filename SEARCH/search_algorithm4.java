//package Search;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.StringTokenizer;
///*
// * น้มุ : 2805
// * 11-25
// */
//public class search_algorithm4 {
//
//	static int N;
//	static int M;
//	
//	public static int binarySearch(int[] arr, int start, int end) {
//		while(start <= end) {
//			long result = 0;
//			int mid = (start + end) / 2;
//			for(int i = 0; i < N; i++) {
//				if((arr[i] - mid) > 0)
//					result += arr[i] - mid;
//			}
//			
//			if(result >= M) {
//				start = mid + 1;
//				
//			}else
//				end = mid - 1;
//		}
//		return end;
//	}
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String temp = br.readLine();
//		StringTokenizer st = new StringTokenizer(temp," ");
//		N = Integer.parseInt(st.nextToken());
//		M = Integer.parseInt(st.nextToken());
//		int[] array = new int[N];
//		
//		temp = br.readLine();
//		st = new StringTokenizer(temp, " ");
//		for(int i = 0; i < N ; i++) {
//			array[i] = Integer.parseInt(st.nextToken());
//		}
//		Arrays.sort(array);
//		int num = binarySearch(array,0,array[N-1]-1);
//		
//		System.out.println(num);
//		
//		br.close();
//	}
//
//}
