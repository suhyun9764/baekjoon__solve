package SoleCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ch03_11659 {

	public static void main(String[] args) throws IOException {
		/* 변수 N에 수의 개수 입력받기
		 * 변수 m에 합을 구해야 하는 횟수 입력받기
		 * int[]형 변수 numArr에 n개의 수 입력받기
		 * int[]형 변수 sumArr에 구간합 저장
		 * 질의 개수만큼 반복하는 for문으로 구간합 출력
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] numArr = new int[N];
		int[] sumArr = new int[N+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=1;i<sumArr.length;i++) {
			int num = Integer.parseInt(st.nextToken());
			sumArr[i] = sumArr[i-1]+ num;
		}
		
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int f = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			
			int ans = sumArr[l]-sumArr[f-1];
			System.out.println(ans);
		}
	}

}
