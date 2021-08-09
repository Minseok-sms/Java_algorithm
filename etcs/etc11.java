package etc;
import java.io.*;
public class etc11 {
	public static void main(String[] args) throws Throwable, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= N; i++) {
			for(int k = i; k <= N-1 ; k++) {
				sb.append(" ");
			}
			if(i == N) {
				for(int k = 1 ; k <= 2*N-1 ; k++) {
					sb.append("*");
				}
			}else {
				for(int k = 1 ; k <= 2*i -1 ; k++) {
					if(k == 1 || k == 2*i - 1) {
						sb.append("*");
					}else
						sb.append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
