//package Search;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
///*
// * น้มุ : 1654
// * 11-26
// */
//public class search_algorithm6 { //  array, 0 , 801, 11
//	public static int binarySearch(int[] arr, int start, int end, int M) {
//		while(start <= end) {
//			int mid = (start + end) / 2;
//			long result = 0;
//			for(int i = 0; i < arr.length; i++) {
//				result += arr[i] / mid;
//			}
//			if(result < M) {
//				end = mid -1;
//			}else if(result >= M)
//				start = mid + 1;
//		}
//		return end;
//	}
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int[] array;
//		int N,M;
//		String temp = br.readLine();
//		StringTokenizer st = new StringTokenizer(temp, " ");
//		N = Integer.parseInt(st.nextToken());
//		M = Integer.parseInt(st.nextToken());
//		
//		array = new int[N];
//		for(int i = 0 ; i < N; i++) {
//			array[i] = Integer.parseInt(br.readLine());
//		}
//		Arrays.sort(array);
//		System.out.println(binarySearch(array,1,array[N-1],M));	
//		bw.close();
//		br.close();
//
//	}
//
//}
