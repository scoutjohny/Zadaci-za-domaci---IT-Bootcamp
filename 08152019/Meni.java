package cnc;

import java.util.Scanner;

public class Meni {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int izbor;
		do {
			System.out.println("Choose wisely:");
			System.out.println("0 - Izlaz");
			System.out.println("1 - Sabiranje");
			System.out.println("2 - Oduzimanje");
			System.out.println("3 - Mnozenje");
			System.out.println("4 - Deljenje");
			izbor = sc.nextInt();
			double a, b;
			switch (izbor) {
			case 1:
				System.out.println("Unesi a i b:");
				a = sc.nextDouble();
				b = sc.nextDouble();
				System.out.println(a + b);
				break;
			case 2:
				System.out.println("Unesi a i b:");
				a = sc.nextDouble();
				b = sc.nextDouble();
				//System.out.println(a - b);
				break;
			case 3:
				System.out.println("Unesi a i b:");
				a = sc.nextDouble();
				b = sc.nextDouble();
				System.out.println(a * b);
				break;
			case 4:
				
				System.out.println("Unesi a i b:");
				a = sc.nextDouble();
				b = sc.nextDouble();
				if (b != 0) {
					System.out.println(a / b);
				} else {
					System.out.println("ERROR!");
				}
				break;
			default:
				System.out.println("Los unos!");
				
				break;
			case 0:
				System.out.println("Izlaz iz kalkulatora!");
				break;
			}
		} while (izbor != 0);

	}

}
