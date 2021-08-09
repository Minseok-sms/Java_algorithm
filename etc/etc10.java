package etc;
import java.io.*;
public class etc10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for(int i = N; i > 1; i--) {
			for(int k = N; k > i; k--) {
				sb.append(" ");
			}
			for(int k = 0; k <= 2*(i-1); k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		for(int i = 1; i < N; i++) {
			sb.append(" ");
		}
		sb.append("*").append("\n");
		for(int i = 1; i < N ; i++) {
			for(int k = N-2; k >= i ; k--) {
				sb.append(" ");
			}
			for(int k = 0; k <= 2*i; k++) {
				sb.append("*");
			}
			sb.append("\n");
			
		}

		System.out.println(sb);
	}
}
