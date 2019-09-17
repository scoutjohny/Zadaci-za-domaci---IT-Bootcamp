package excelovanje;

//U folderu domaci 09062019 nalazi se Excel tabela potrebna za izradu ovog domaceg zadatka,
//dok se u folderu predavanja 09062019 nalazi klasa ExcelUtils koja vam je za izradu domaceg
//zadatka takodje na raspolaganju.
//
//Napisati program koji racuna sumu brojeva koji se nalaze prvom worksheet-u Excel tabele koji
//se zove Brojevi. U tabeli se svi brojevi nalaze u prvoj koloni. Program treba da cita red po
//red iz tabele i upisane brojeve dodaje na sumu. Krajnju sumu nakon toga treba da ispise u 
//konzoli. Potrebno je omoguciti da program radi i ukoliko se u datu tabelu doda jos brojeva.
//
//Hint: Pogledajte ApachePOI biblioteke kako biste nasli metodu koja vraca index poslednjeg reda
//koji je ubacen. Istraziti kako neki String prevesti u int.

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excelovanje {
	public static void main(String args[]) {
		try {
			File src = new File("Data (DOM).xls");            // nalazi fajl
			FileInputStream fis = new FileInputStream(src);   // ubacuje ga u Eclipse
			HSSFWorkbook wb = new HSSFWorkbook(fis);		  // otvara Excel
			HSSFSheet sheet1 = wb.getSheetAt(0);			  // ulazi u prvu stranicu (sheet) Excell-a 
			int rowCount = sheet1.getLastRowNum();			  
			
			System.out.println("Ukupan broj redova u tabeli je " + (rowCount + 1) + ".");
			double sum = 0;
			
			for(int i=0; i<=rowCount; i++) {
				HSSFRow r = sheet1.getRow(i);
				if(r != null) {
					double data0 = r.getCell(0).getNumericCellValue();
					sum += data0;
					System.out.println("Podaci u redu [" + i + "]: " + data0);
				}else {
					System.out.println("<Prazan red>");
				}
			}
			System.out.println("Suma svih brojeva u tabeli iznosi: " + sum);
			wb.close();   // zatvara excel
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}



