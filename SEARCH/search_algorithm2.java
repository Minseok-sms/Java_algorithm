//package Search;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class search_algorithm2 {
//	static int N;
//	static int target;
//	static int result = 0;
//	public static void binarySearch(int[] arr, int start, int end, int target) {
//		int firstEnd = (start + end) /2;
//		int firstStart = start;
//		int secondStart = ((start + end) / 2) + 1;
//		int secondEnd = end;
//		
//		while(firstStart <= firstEnd) {
//			if(arr[firstStart] == target) {
//				firstStart++;
//				result++;
//				continue;
//			}
//			if(arr[firstEnd] == target) {
//				firstEnd--;
//				result++;
//				continue;
//			}
//			int mid = (firstStart + firstEnd)/2;
//			if(arr[mid] == target) {
//				result++;
//			}
//			else if(arr[mid] > target) {
//				firstEnd = mid - 1;
//			}else
//				firstStart = mid + 1;
//		}
//		
//		while(secondStart <= secondEnd) {
//			if(arr[secondStart] == target) {
//				secondStart++;
//				result++;
//				continue;
//			}
//			if(arr[secondEnd] == target) {
//				secondEnd--;
//				result++;
//				continue;
//			}
//			int mid = (secondStart + secondEnd)/2;
//			if(arr[mid] == target) {
//				result++;
//			}
//			else if(arr[mid] > target) {
//				secondEnd = mid - 1;
//			}else
//				firstStart = mid + 1;
//		}
//		
//	}
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String temp = br.readLine();
//		StringTokenizer st = new StringTokenizer(temp, " ");
//		N = Integer.parseInt(st.nextToken());
//		target = Integer.parseInt(st.nextToken());
//		
//		int[] array = new int[N]; 
//		temp = br.readLine();
//		st = new StringTokenizer(temp, " ");
//		int i = 0;
//		
//		while(st.hasMoreTokens()) {
//			array[i] = Integer.parseInt(st.nextToken());
//			i++;
//		}
//		binarySearch(array,0,N-1,target);
//		System.out.println(result);
//	}
//
//}
