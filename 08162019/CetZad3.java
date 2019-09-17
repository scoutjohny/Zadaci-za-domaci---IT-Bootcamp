package cnp;

import java.util.Scanner;

public class CetZad3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N? K?");
		int n = sc.nextInt();
		double k=sc.nextDouble();
		double sum=0;
		for(int i=1;i<=n+1;i++) {
			sum+=i/(k+i-1);
		}
		System.out.println(sum);
	}
}
