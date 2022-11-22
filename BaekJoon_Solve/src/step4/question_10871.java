package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class question_10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] Arr = new int[N];
		
		int X = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++) {
			Arr[i] = Integer.parseInt(st.nextToken());	
		}
		
		for(int i=0;i<N;i++) {
			if(Arr[i]<X)
				bw.write(Arr[i]+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
		
		
}

}
