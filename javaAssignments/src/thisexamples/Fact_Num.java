package thisexamples;

public class Fact_Num {
	int fact=1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fact_Num obj=new Fact_Num();
		obj.calculate(5);

	}
	
	public void calculate(int a)
	{
		for(int i=1;i<=a;i++)
		{
			this.fact=fact*i;
		}
		this.display();
	}
   public void display()
    {
		System.out.println("Factorial of a number is"+fact);
}
}
