package utility;

import javax.management.RuntimeErrorException;

public class GlavniP {

	public static void main(String[] args) {
		try {
			int[] nisko=new int[10];
			nisko[15]=5;
			nisko[3]=10;
			//throw new ExceptionInInitializerError("Poruka");
			System.out.println("Neka poruka u try!");
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("Prva greska "+aie.toString());
		}catch(Exception e) {
			System.out.println("Uopstena greska "+ e.toString());
		}finally{
			System.out.println("Ovo se svakako izvrsava!");
		}

	}

}
