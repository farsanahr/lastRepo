package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread_Example {
	
	static FileInputStream fi;
	static XSSFWorkbook wk;
	static XSSFSheet sh;
	
	public static String getStringName(int a,int b) throws IOException
	{
		fi=new FileInputStream("C:\\Users\\hp\\Downloads\\Book.xlsx");
		wk=new XSSFWorkbook(fi);
		sh=wk.getSheet("Sheet1");
		Row rw=sh.getRow(a);
		Cell c=rw.getCell(b);
		 return c.getStringCellValue();
	}
	
	public static String getNumberValue(int a,int b) throws IOException
	{
		fi=new FileInputStream("C:\\Users\\hp\\Downloads\\Book.xlsx");
		wk=new XSSFWorkbook(fi);
		sh=wk.getSheet("Sheet1");
		Row rw=sh.getRow(a);
		Cell c=rw.getCell(b);
		int value= (int) c.getNumericCellValue();
		return String.valueOf(value);
		
	}

}
