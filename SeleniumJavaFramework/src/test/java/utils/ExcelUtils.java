package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String ProjectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName){

		try{

			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);

		}catch(Exception e){

			System.out.println(e.getStackTrace());
		}

	}


	public static void main(String[] arg){

		//getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}


	public static int getColCount(){

		int ColCount = 0;

		try {

			ColCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No. of rows: "+ColCount);

		}catch(Exception exp){

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			System.out.println(exp.getStackTrace());

		}
		return ColCount;
	}


	public static int getRowCount(){

		int rowCount=0;

		try {

			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No. of rows: "+rowCount);

		}catch(Exception exp){

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			System.out.println(exp.getStackTrace());

		}
		return rowCount;

	}


	public static String getCellDataString(int rowNum, int colNum){
		
		String cellData=null;

		try{

			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);

		}catch(Exception exp){

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			System.out.println(exp.getStackTrace());

		}
		return cellData;
	}


	public static void getCellDataNumber(int rowNum, int colNum){

		try{

			double CellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(CellData);

		}catch(Exception exp){

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			System.out.println(exp.getStackTrace());

		}

	}

}
