package cnutorak;

import java.util.Scanner;

public class CifreSuStrava {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("N?");
		int n=sc.nextInt();
		while(n!=0) {
			int c=n%10;
			System.out.print(c+" ");
			n/=10;
		}

	}

}
