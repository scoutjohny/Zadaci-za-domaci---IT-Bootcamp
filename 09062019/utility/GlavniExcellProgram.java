package utility;

public class GlavniExcellProgram {

	public static void main(String[] args) {
		ExcelUtils.setExcell("Data.xls");
		ExcelUtils.setWorkSheet(0);
		System.out.println(ExcelUtils.getDataAt(0, 0));
		ExcelUtils.setDataAt(1, 1, "Dobar dan");
		ExcelUtils.closeExcell();

	}

}
