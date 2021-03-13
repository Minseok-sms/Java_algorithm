//package Search;
///*
// * น้มุ : 1920
// * 11- 24
// */
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class search_algorithm3 {
//	public static int binarySearch(int[] arr, int start, int end, int target) {
//		while(start <= end) {
//			int mid = (start + end) / 2;
//			if(arr[mid] == target)
//				return 1;
//			else if(arr[mid] < target) start = mid + 1;
//			else end = mid - 1;
//		}
//		return 0;
//	}
//	public static void main(String[] args) throws Exception, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		int N,M;
//		N = Integer.parseInt(br.readLine());
//		String temp = br.readLine();
//		int[] array = new int[N];
//		
//		StringTokenizer st = new StringTokenizer(temp, " ");
//		for(int i = 0; i < N; i++) {
//			array[i] = Integer.parseInt(st.nextToken());
//		}
//		M = Integer.parseInt(br.readLine());
//		int[] comarray = new int[M];
//		temp = br.readLine();
//		st = new StringTokenizer(temp, " ");
//		int count = st.countTokens();
//		for(int i = 0; i < N; i++) {
//			comarray[i] = Integer.parseInt(st.nextToken());
//		}
//		Arrays.sort(array);
//		
//		int num;
//	
//		for(int i = 0 ; i < M ; i++) {
//			num = Arrays.binarySearch(array,comarray[i]);
//			if(num < 0)
//				System.out.println("0");
//			else System.out.println("1");
//		}
//		System.out.println(count);
//		br.close();
//	}
//
//}
