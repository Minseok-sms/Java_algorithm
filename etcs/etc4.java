package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class etc4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> array = new ArrayList<>();
		while(true) {
			String str = br.readLine();
			if(str == null || str.isEmpty())
				break;
			array.add(str);
		}
		for(int i = 0 ; i < array.size(); i++) {
			System.out.println(array.get(i));
		}

	}

}
