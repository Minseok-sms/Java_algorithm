//package Search;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.Arrays;
//import java.util.StringTokenizer;
///*
// * น้มุ : 10816
// * 11-26
// */
//public class search_algorithm7 {
//	public static int binarySearch(int[] arr, int start, int end, int target, int N) {
//		int cnt = 0;
//		while(start <= end) {
//			int mid = (start + end) / 2;
//			if(arr[mid] == target) {
//				cnt = 1;
//				int tempL = mid - 1;
//				int tempR = mid + 1;
//				
//				while(tempL >= 0 && arr[tempL] == target) {
//					tempL--;
//					cnt++;
//				}
//				while(tempR < N && arr[tempR] == target) {
//					tempR++;
//					cnt++;
//				}
//				
//				break;
//			}
//			else if(arr[mid] < target) start = mid + 1;
//			else end = mid - 1;
//		}
//		return cnt;
//	}
//	public static void main(String[] args) throws Exception, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int[] array;
//		int[] comparray;
//		
//		int N,M;
//		String temp;
//		StringTokenizer st;
//		
//		N = Integer.parseInt(br.readLine());
//		array = new int[N];
//		temp = br.readLine();
//		st = new StringTokenizer(temp, " ");
//		for(int i = 0 ; i < N; i++)	
//			array[i] = Integer.parseInt(st.nextToken());
//		M = Integer.parseInt(br.readLine());
//		temp = br.readLine();
//		st = new StringTokenizer(temp, " ");
//		comparray = new int[M];
//		for(int i = 0 ; i < M; i++)
//			comparray[i] = Integer.parseInt(st.nextToken());
//		
//		Arrays.sort(array);
//		for(int i = 0; i < M; i++) {
//			bw.write(String.valueOf(binarySearch(array,0,N-1,comparray[i],N)) + " ");
//		}
//		bw.close();
//		br.close();
//	}
//
//}
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
// 
//public class search_algorithm7 {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] cnt = new int[20_000_001];
//        
//        for(int i = 0; i < n; i++) {
//            cnt[Integer.parseInt(st.nextToken()) + 10_000_000]++;
//        }
//        
//        int m = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine());
//        StringBuffer sb = new StringBuffer();
//        
//        for(int i = 0; i < m; i++) {
//            sb.append(cnt[Integer.parseInt(st.nextToken()) + 10_000_000] + " ");
//        }
//        
//        System.out.println(sb);
//    }
//}

