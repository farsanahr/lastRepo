package inheritance;

import java.util.Scanner;

public class Salary_Pfirst extends Salary_First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary_First ss=new Salary_Pfirst();
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your basicpay");
		float basicpay=obj.nextFloat();
		System.out.println("Enter your deduction amount");
		float deductionamount=obj.nextFloat();
		System.out.println("Enter your bonus amount");
		float bonusamount=obj.nextFloat();
		
		ss.calc(basicpay);
		ss.TotalSalary(basicpay, deductionamount, bonusamount);

	}

}
