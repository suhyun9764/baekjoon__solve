package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class question_2562 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] Arr = new int[9];
		for(int i=0;i<9;i++) {
			Arr[i] = Integer.parseInt(br.readLine());
		}
		int max = Arr[0];
		int maxI = 0;
		
		for(int i=0;i<9;i++) {
			if(max<=Arr[i]) {
				max = Arr[i];
				maxI = i+1; 
			}
		}
		
		bw.write(max+"\n"+maxI+"\n");
		br.close();
		bw.flush();
		bw.close();

	}
	

	

}
