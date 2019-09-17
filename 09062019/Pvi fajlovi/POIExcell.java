package readexceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	
	
	public	class PoiExcell{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src = new File("c:\\Users\\nemanja\\Desktop\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wbe = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wbe.getSheetAt(0);
		int rowcount = sheet1.getLastRowNum();
		System.out.println("Total row count is " + (rowcount + 1));
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow r = sheet1.getRow(i);
			if (r != null) {
				String data0 = r.getCell(0).getStringCellValue();
				System.out.println("Podaci iz reda " + i + " is " + data0);
			} else {
				System.out.println("<Empty row>");
			}
		}
		wbe.close();
	}

}
