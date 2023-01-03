package SoleCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ch03_12891ex  {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		char[] dArr = new char[s];
		dArr = br.readLine().toCharArray();
	
		st = new StringTokenizer(br.readLine());
		int[] cArr = new int[4];
		for(int i=0;i<4;i++) {
			cArr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		
		int i=0;
		int j=p;
		int cnt=0;
		while(j<=s) {
			int[] nowArr = {0,0,0,0};  
			for(int t=i;t<j;t++) {
				if(dArr[t]=='A')	nowArr[0]++;
				else if(dArr[t]=='C')	nowArr[1]++;
				else if(dArr[t]=='G')	nowArr[2]++;
				else	nowArr[3]++;
				
				
			}
			for(int q=0;q<4;q++) {
				if(cArr[q]>nowArr[q])
					break;
				
				if(q==3)
					cnt++;
			}
			i++;
			j++;
		}
		
		System.out.println(cnt);
		
		
	}
}
		

