//package Search;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//import java.util.Arrays;
//
//public class search_algorithm1 {
//	static int[] restore = new int[101];
//	static int index = 0;
//	static int N,M;
////	public static int BinarySearch(int arr[], int start, int end,int M) {
////		int mid = (start+ end) /2;
////		while(true) {
////			int result = 0;

////			for(int i = mid + 1 ;i <= end ; i++) {
////				result += arr[i] - arr[mid];
////			}
////			if(result < M) {
////				mid--;
////				continue;
////			}
////			else if(result == M) {
////				return arr[mid];
////			}
////			else { // result > M
////				int temp = arr[mid];
////				int minus = end - mid;
////				while(true) {
////					temp++;
////					result = result - minus;
////					if(result < M) {
////						return temp;
////					}
////					
////				}
////			}
////			
////		}
//	public static void BinarySearch(int arr[], int start, int end) {
//		
//		while(start <= end) {
//			int result = 0;
//			int mid = (start + end)/2;
//			for(int i = 0 ; i < N ; i++) {
//				if(arr[i] > mid)
//					result += arr[i] - mid;
//			}
//			if(result < M) {
//				end = mid - 1;
//			}else 
//				index = mid;
//				start = mid + 1;
//		}
//	
//	}
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String temp = br.readLine();
//	
//		StringTokenizer st = new StringTokenizer(temp);
//		N = Integer.parseInt(st.nextToken());
//		M = Integer.parseInt(st.nextToken());
//		int[] array = new int[N];
//		
//		// 10 15 17 19
//		temp = br.readLine();
//		st = new StringTokenizer(temp, " ");
//		for(int i = 0 ; i < N ; i++) {
//			array[i] = Integer.parseInt(st.nextToken());
//		}
//		Arrays.sort(array);
//
//		
//		//System.out.println(BinarySearch(array,0,N-1,M));
//		BinarySearch(array,0,array[N-1]);
//		System.out.println(index);
//		
//	}
//
//}
