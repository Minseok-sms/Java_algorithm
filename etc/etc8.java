package etc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class etc8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int month = Integer.parseInt(st.nextToken());
		int date = Integer.parseInt(st.nextToken());
		int k = 0;
		int resultday = 0;
		for(int i = 1; i < month; i++){
			switch(i) {
			case 1:
				k += 31;
				break;
			case 2:
				k += 28;
				break;
			case 3:
				k += 31;
				break;
			case 5:
				k += 31;
				break;
			case 7:
				k += 31;
				break;
			case 8:
				k += 31;
				break;
			case 10:
				k += 31;
				break;
			case 12:
				k += 31;
				break;
			default :
				k += 30;
			}
		}
		k += date;
		resultday = k % 7;
		System.out.println(day[resultday]);
	}
}	
