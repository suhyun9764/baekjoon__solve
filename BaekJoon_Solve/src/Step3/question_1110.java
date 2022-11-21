package Step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_1110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int t =N;
		int ten;
		if(t<10) 
			ten = 0;
		else
			ten = t/10;
		int cnt =1;
		int one = t-10*ten;
		
		while(true) {
			int nextVal = one+ten;
			
			int nextCal = (one+ten)%10;
			
			int nextTotal = 10*one+nextCal;
		
			if(nextTotal==t)
				break;
			ten = nextTotal/10;
			one = nextTotal-(ten*10);
			cnt ++;
			
		}
		System.out.println(cnt);		

	}

}
