//package java_tut;
///*
// * 백준 1946
// * 11 - 21
// * 시간초과
// */
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.ArrayList;
//import java.util.StringTokenizer;
//
//public class greedy_algorithm16 {
//
//	public static void main(String[] args) throws Exception, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st;
//		
//		int testCase = Integer.parseInt(br.readLine());
//		
//		ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
//		ArrayList<Integer> num1 = new ArrayList<>();
//		ArrayList<Integer> num2 = new ArrayList<>();
//		int[] ansArray = new int[testCase];
//		int ansIndex = 0;
//		
//		for(int k = 0; k < testCase; k++) {
//		int N = Integer.parseInt(br.readLine());
//		for(int i = 0; i < N; i++) {
//			String str = br.readLine();
//			st = new StringTokenizer(str, " ");
//			num1.add(Integer.parseInt(st.nextToken()));
//			num2.add(Integer.parseInt(st.nextToken()));
//		}
//		
//		array.add(num1);
//		array.add(num2);
//		int corr = 0;
//		for(int i = 0; i < N; i++) {
//			int total = 0;
//			int val1 = array.get(0).get(i);
//			int val2 = array.get(1).get(i);
//			for(int j = 0; j < N; j++) {
//				int nextVal1 = array.get(0).get(j);
//				int nextVal2 = array.get(1).get(j);
//				if(i == j)
//					continue;
//				if(val1 > nextVal1 && val2 > nextVal2)
//					total++;; // total > 1 이상일시 그사람 x
//			}
//			if(total > 0)
//				corr++;
//			total = 0;
//		}
//		ansArray[ansIndex++] = N - corr;
//		
//
//	}
//		for(int i = 0 ; i < testCase; i++) {
//			System.out.println(ansArray[i]);
//		}
//	}
//
//}
