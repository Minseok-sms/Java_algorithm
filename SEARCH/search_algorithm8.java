//package Search;
///*
// * น้มุ : 2512
// * 11-27
// */
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class search_algorithm8 {
//	public static int binarySearch(int[] arr,int start, int end, int N, long M) {
//		
//		while(start <= end) {
//			long result = 0;
//			int mid = (start + end) / 2;
//			for(int i = 0; i < N; i++) {
//				if(arr[i] - mid > 0) {
//					result += mid;
//				}else
//					result += arr[i];
//			}
//			if(result <= M)
//				start = mid + 1;
//			else end = mid - 1;
//		}
//		return end;
//	}
//	public static void main(String[] args) throws Exception, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int N = Integer.parseInt(br.readLine());
//		int[] array = new int[N];
//		String temp = br.readLine();
//		StringTokenizer st = new StringTokenizer(temp, " ");
//		for(int i = 0; i < N; i++) array[i] = Integer.parseInt(st.nextToken());
//		long M = Integer.parseInt(br.readLine());
//		Arrays.sort(array);
//		int sum = 0;
//		for(int i = 0 ; i < N; i++) sum += array[i];
//		if(sum <= M)
//			bw.write(String.valueOf(array[N-1]));
//		else
//			bw.write(String.valueOf(binarySearch(array,1,array[N-1]-1,N, M)));
//		br.close();
//		bw.close();
//
//	}
//
//}
