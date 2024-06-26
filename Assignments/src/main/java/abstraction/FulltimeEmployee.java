package abstraction;

public class FulltimeEmployee extends Employee{

	float payment=650;
	int hrs=24;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FulltimeEmployee obj=new FulltimeEmployee ();
		obj.calculateSalary();
		obj.calculateSalary1();

	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		float salary=payment*hrs;
		System.out.println("Total payment for given working hrs:"+salary);
		
	}
	
	public void calculateSalary1()
	{
		float sal=payment*8;
		System.out.println("Total payment for 8hrs:"+sal);
	}

}
