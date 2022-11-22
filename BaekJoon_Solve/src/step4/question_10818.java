package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class question_10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int[] Arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			Arr[i] = Integer.parseInt(st.nextToken());	
		}
		int max=Arr[0];
		int min=Arr[0];
		
		for(int i=0;i<N;i++) {
			if(max<=Arr[i])
				max = Arr[i];
		}
		
		for(int i=0;i<N;i++) {
			if(min>=Arr[i])
				min = Arr[i]; 	
		}
		
		bw.write(min+" "+max+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
