//package java_tut;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.Arrays;
///*
// * น้มุ 2217
// * 11-20
// * วี
// */
//public class greedy_algorithm15 {
//
//	public static void main(String[] args) throws Exception, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int N = Integer.parseInt(br.readLine());
//		int[] array = new int[N];
//		
//		for(int i = 0; i < N ;i++) {
//			array[i] = Integer.parseInt(br.readLine());
//		} // 15 10 5
//				// 4 5 11
//		Arrays.sort(array);
//		int max = 0;
//		for(int i = 0; i < N; i++) {
//			if(max < array[i] * (N - i))
//				max = array[i] * (N - i);
//		}
//		bw.write(String.valueOf(max));
//		bw.flush();
//		bw.close();
//		br.close();
//		
//
//
//	}
//
//}
