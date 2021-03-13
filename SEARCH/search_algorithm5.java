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
//public class search_algorithm5 {
//
//	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int N = Integer.parseInt(br.readLine());
//		String temp = br.readLine();
//		StringTokenizer st = new StringTokenizer(temp, " ");
//		int[] array1 = new int[N];
//		
//		for(int i = 0; i < N; i++) {
//			array1[i] = Integer.parseInt(st.nextToken());
//		}
//		int M = Integer.parseInt(br.readLine());
//		temp = br.readLine();
//		st = new StringTokenizer(temp," ");
//		int[] array2 = new int[M];
//		
//		for(int i = 0; i < M; i++) {
//			array2[i] = Integer.parseInt(st.nextToken());
//		}
//		
//		Arrays.sort(array1);
//		for(int i = 0; i < M; i++) {
//			int num = Arrays.binarySearch(array1,array2[i]);
//			if(num < 0)
//				bw.write("0 ");
//			else bw.write("1 ");
////			if(i + 1 < M)
////				System.out.print(" ");
//		}
//		br.close();
//		bw.close();
//	}
//}