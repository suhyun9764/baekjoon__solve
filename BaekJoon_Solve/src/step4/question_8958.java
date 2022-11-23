package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_8958 {

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = br.readLine();	

		}
		
		br.close();
		
		for(int i=0;i<N;i++) {
			int total =0;
			int cnt =0;
			for(int j=0;j<arr[i].length();j++) {
				char target;

				target = arr[i].charAt(j);
				if(target=='O')
					cnt ++;
				else 
					cnt =0;
				total +=cnt;
			}
			System.out.println(total);
		}
		
			
			
				
	}
}


