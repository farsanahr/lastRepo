package excelread;

import java.io.IOException;

public class Excelread_Main extends Excelread_Example {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String data1=Excelread_Example.getStringName(2, 0);
		System.out.println(data1);
		String data2=Excelread_Example.getNumberValue(2, 1);
		System.out.println(data2);

	}

}
