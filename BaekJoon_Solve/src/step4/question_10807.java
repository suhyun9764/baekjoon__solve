package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class question_10807 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] Arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<Arr.length;i++) {
			
			int Val = Integer.parseInt(st.nextToken());
			Arr[i] = Val;
			
		}
		int V = Integer.parseInt(br.readLine());
		int cnt=0;
		for(int i=0;i<Arr.length;i++) {
			if(Arr[i]==V)
				cnt++;
		}
		
		bw.write(cnt+"\n");
		br.close();
		bw.flush();
		bw.close();
		
	
		
	
	}

}
