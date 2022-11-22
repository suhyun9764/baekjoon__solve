package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class tete {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		int N = Integer.parseInt(br.readLine());
		double[] arr = new double[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		double max = arr[0];
		for(int i=1;i<N;i++) {
			if(max<=arr[i])
				max = arr[i];
		}
		System.out.println(max);
		
		double total =0;
		for(int i=0;i<N;i++) {
			arr[i] = arr[i]/max*100;
			total += arr[i];
		}
		
		System.out.println(total/N);
		
		
		
		
		
	}

}