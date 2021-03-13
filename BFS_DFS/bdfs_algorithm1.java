//package BFS_DFS;
//import java.io.*;
//import java.util.*;
//
//public class bdfs_algorithm1 {
//	static int n,m;
//	static int[][] graph;
//	
//	public static boolean dfs(int x, int y) {
//		if(x <= -1 || x >= n || y <= -1 || y >= m) {
//			return false;
//		}
//		
//		if(graph[x][y] == 0) {
//			graph[x][y] = 1;
//			
//			dfs(x-1, y);
//			dfs(x, y-1);
//			dfs(x+1, y);
//			dfs(x, y+1);
//			
//			return true;
//		}
//		return false;
//	}
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		
//		String str = br.readLine();
//		StringTokenizer st = new StringTokenizer(str, " ");
//		n = Integer.parseInt(st.nextToken());
//		m = Integer.parseInt(st.nextToken());
//		graph = new int[n][m];
//		
//		for(int i = 0; i < n; i++) {
//			String temp = br.readLine();
//			for(int j = 0; j < m ; j++) {
//				graph[i][j] = temp.charAt(j) - '0';
//				
//			}
//		}
////		for(int i = 0; i < n; i++) {
////			for(int j = 0; j < m; j++) {
////				bw.write(String.valueOf(graph[i][j]));
////				bw.flush();
////			}
////			bw.write("\n");
////		}
//		int result = 0;
//		for(int i = 0 ; i < n; i++) {
//			for(int j = 0; j < m; j++) {
//				if(dfs(i, j)) {
//					result += 1;
//				}
//			}
//		}
//		bw.write(String.valueOf(result));
//		bw.flush();
//		bw.close();
//		br.close();
//		
//	}
//
//}
