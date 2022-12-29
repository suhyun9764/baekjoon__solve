package SoleCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ch03_11660 {

	public static void main(String[] args) throws IOException {
		/* 변수 N에 배열의 크기, M에 계산해야하는 횟수 저장
		 * for(N만큼 반복){
		 * 		2차원배열 저장
		 * }
		 * for(M만큼 반복){
		 * 		질의 
		 * }
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] numArr = new int[N+1][N+1];
		
		for(int i=1;i<numArr.length;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1;j<numArr.length;j++) {
				numArr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int[][] sumArr = new int[N+1][N+1];
		
		for(int i=1;i<numArr.length;i++) {
			for(int j=1;j<numArr.length;j++) {
				sumArr[i][j] = sumArr[i-1][j]+sumArr[i][j-1]-sumArr[i-1][j-1]+numArr[i][j];
			}
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int result = sumArr[x2][y2]-sumArr[x1-1][y2]-sumArr[x2][y1-1]+sumArr[x1-1][y1-1];
			
			System.out.println(result);
		}
	}

}
