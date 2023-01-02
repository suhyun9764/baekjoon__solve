package SoleCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ch03_1940 {
	/* 배열 저장
	 * Arrays.sort()로 오름차순 정렬
	 * 포인터 두개를 각각 처음과 마지막부터 시작
	 */

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		st = new StringTokenizer(br.readLine());
		int buf=0;
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		
		int i=0;
		int j=N-1;
		int cnt=0;

		while(i<j) {
			if(A[i]+A[j]>M) 
				j--;

			else if(A[i]+A[j]<M) {
				i++;
			}
			else {
				cnt++;
				i++;
				j--;
			}
						
		}
		
		System.out.println(cnt);
		

	}

}
