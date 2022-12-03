package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class question_15596 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<a.length;i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}	
		
		long val = sum(a);
		System.out.println(val);

	}
	
	public static long sum(int[] a) {
		long sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		
		return sum;
	}

}
