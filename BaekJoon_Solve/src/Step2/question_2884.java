package Step2;

import java.util.Scanner;

public class question_2884 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int fixTime = (h*60+m)-45;
		int fixH = ((fixTime+24*60)/60)%24;
		int fixM = (fixTime+60)%60;
		
		System.out.println(fixH+" "+fixM);

	}

}
