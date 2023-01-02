package SoleCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ch03_1253 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		long [] arr = new long[N];
		for(int i=0;i<N;i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int cnt=0;
		for(int s=0;s<N;s++) {
			int i=0;
			int j=N-1;
			while(i<j) {
				if(arr[i]+arr[j]<arr[s]) {
					i++;
				}
				else if(arr[i]+arr[j]>arr[s]){
					j--;
				}
				else {
					if(i!=s&&j!=s) {
						cnt++;
						break;
					}
					else if(i==s) {
						i++;
					}
					else if(j==s) {
						j--;
					}
				}
			}
		}
		System.out.println(cnt);
	}

}
