package chapter1;

import java.util.Scanner;

public class Gugudan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("gugudanfrom:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		gugudan(i);
	}

	private static void gugudan(int i) {
		for(int j=1;j<=9;j++) {
			int k = i*j;
			System.out.println(i+"x"+j+"="+k);
		}
	}
}
