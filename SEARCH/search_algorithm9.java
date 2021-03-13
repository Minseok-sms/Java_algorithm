//package Search;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
///*
// * น้มุ : 1789
// * 11-28
// */
//
//public class search_algorithm9 {
//	public static long binarySearch(long start, long end, long S) {
//		while(start <= end) {
//			long mid = (start + end) / 2;
//			long result = 0;
//			for(long i = 1 ; i <= mid ; i++) result += i;
//			if(result > S)
//				end = mid -1;
//			else
//				start = mid + 1;
//		}
//		return end;
//	}
//	public static void main(String[] args) throws Exception, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		long S = Long.parseLong(br.readLine());
//		System.out.println(binarySearch(1,S,S));
//	}
//
//}
