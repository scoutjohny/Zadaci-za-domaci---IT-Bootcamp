package cnp;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N?");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			String s="";
			if(i%3==0) {
				s+="Fizz";
			}
			if(i%5==0) {
				s+="Buzz";
			}
			if(i%7==0) {
				s+="Zazz";
			}
			if(s.equals("")) {
				System.out.println(i);
			}
			else {
				System.out.println(s);
			}
			
		}
	}

}
