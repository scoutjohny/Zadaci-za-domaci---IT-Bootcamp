package cnutorak;

import java.util.Scanner;

public class PalindromBroj {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("N?");
		int n=sc.nextInt(),temp;
		int br=0;
		temp=n;
		while(n!=0) {
			int c=n%10;
			System.out.print("Pre * " + br+" ");
			br*=10;
			System.out.print("Pre +c " + br+" ");
			br+=c;
			System.out.print("Posle +c " + br+" ");
			n/=10;
			System.out.println("Zavrsena iteracija "+n);
		}
		System.out.println(br);
		if(br==temp) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Nije palindrom");
		}

	}

}
