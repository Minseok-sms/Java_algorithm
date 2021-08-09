//package java_tut;
///*
// * ¹éÁØ : 1080
// * 11-22
// */
//import java.util.*;
//import java.io.*;
//
//public class greedy_algorithm18 {
//	static int n,m;
//	static int a[][],b[][];
//	public static boolean flip(int start_a,int start_b) { 
//		
//		if(start_a+3>n || start_b+3>m)
//			return false; 
//		for(int i=start_a;i<=start_a+2;i++) { 
//			for(int j=start_b;j<=start_b+2;j++) {
//				a[i][j]= 1-(a[i][j]);					
//			}
//		}
//		return true;
//	}
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		n = Integer.parseInt(st.nextToken());
//		m = Integer.parseInt(st.nextToken());
//		
//		a = new int[n][m];
//		b = new int[n][m];
//		
//		for(int i =0;i<n;i++) {
//			String row = br.readLine();
//			for(int j=0;j<m;j++) {				
//				a[i][j] =row.charAt(j)-'0';
//				
//			}
//		}
//		for(int i =0;i<n;i++) {
//			String row = br.readLine();
//			for(int j=0;j<m;j++) {				
//				b[i][j] =row.charAt(j)-'0';
//				
//			}
//		}
//		
//		int cnt =0;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<m;j++) {
//				
//				if(a[i][j]!=b[i][j]) 
//				{
//					if(flip(i,j))
//					{
//						cnt++;
//					}else
//					{
//						System.out.println("-1");
//						return;
//					}
//				}
//				
//			}
//		}
//		
//		System.out.println(cnt);
//		br.close();
//		
//	}
//	
//}
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//import java.util.Arrays;
//
//public class greedy_algorithm18 {
//	
//	public static void main(String[] args) throws Exception, IOException {
//		int total = 0;
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Scanner sc = new Scanner(System.in);
//		int N,M;
//		N = sc.nextInt();
//		M = sc.nextInt();
//		if(N < 3 || M < 3) {
//			return ;
//		}
//	
//		
//		int[][] arrayA = new int[N][M];
//		int[][] arrayB = new int[N][M];
//		int[][] corrArray = new int[2][50];
//		
//		for(int i = 0 ; i < 2; i++) {
//			for(int j = 0 ; j < 50; j++) {
//				corrArray[i][j] = -1;
//			}
//		}
//		
//		for(int i = 0; i < N; i++) {
//			String num = br.readLine();
//			for(int j = 0; j < M; j++) {
//				arrayA[i][j] = num.charAt(j) - '0';
//			}
//		}
//		for(int i = 0; i < N; i++) {
//			String num = br.readLine();
//			for(int j = 0; j < M; j++) {
//				arrayB[i][j] = num.charAt(j) - '0';
//			}
//		}
//		
//		
//		
//		int idx = 0;
//		for(int i = 0; i < N; i++) {
//			for(int j = 0; j < M; j++) {
//				int height = i + 2;
//				int width = j + 2;
//				if( height < N && width < M) {
//					corrArray[0][idx] = i;
//					corrArray[1][idx++] = j; 
//				}
//			}
//		}
//		idx = 0;
//		int corr = 0;
//		while(true) {
//			int result = 0;
//			int num1 = corrArray[0][idx];
//			int num2 = corrArray[1][idx];
//			if(num1 == -1 || num2 == -1) {
//				corr = -1;
//				break; //³¡
//			}
//				
//			idx++;
//			int maxnum1 = num1 + 3;
//			int maxnum2 = num2 + 3;
//			for(int i = num1 ; i < maxnum1; i++ ) {
//				for(int j = num2; j < maxnum2; j++) {
//					if(arrayA[i][j] == 1)
//						arrayA[i][j] = 0;
//					else
//						arrayA[i][j] = 1;
//				}
//			}
//			
//			for(int i = 0 ; i < N ; i++) {
//				if(Arrays.equals(arrayA[i], arrayB[i])) {
//					result++;
//				}
//			}
//			total++;
//			if(result == N) {
//				corr = 1;
//				break;
//			}
//			
//		}
//		if(corr == -1)
//			System.out.println("-1");
//		else
//			System.out.println(total);
//		br.close();
//		sc.close();
//
//	}
//	
//}
