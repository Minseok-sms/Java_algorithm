package BFS_DFS;
import java.io.*;
import java.util.*;
class dot{
	int x,y;
	public dot(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class bdfs_algorithm2 {
	static int map[][];
	static boolean vistArr[][];
	static int N,M;
	static Queue<dot> queue;
	static int[] dx = {1,0,-1,0};  //  го ©Л ╩С аб
	static int[] dy = {0,1,0,-1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		vistArr = new boolean[N][M];
		
		for(int i = 0; i < N ; i++) {
			String temp = br.readLine();
			for(int j = 0; j < M; j++) {
				map[i][j] = temp.charAt(j) - '0';
				vistArr[i][j] = false;
			}
		}
	
		queue = new LinkedList<dot>();
		vistArr[0][0] = true;
		Bfs(0,0);
		
		
	}
	static public void Bfs(int x,int y) {
		queue.add(new dot(x,y));
		while(!queue.isEmpty()) {
			dot d = queue.poll();
			for(int i = 0; i < 4; i	++) {
				int nextX = d.x + dx[i];
				int nextY = d.y + dy[i];
				
				if(nextX <= 0 || nextX > N || nextY <= 0 || nextY > M)
					continue;
				
				if(vistArr[nextX][nextY] == true || map[nextX][nextY] == 0) {
					continue;
				}
				queue.add(new dot(nextX,nextY));
				map[nextX][nextY] = map[d.x][d.y] + 1;
				vistArr[nextX][nextY] = true;
				                                                                                                                                                                                                                                          
			}

		}
	}

}
