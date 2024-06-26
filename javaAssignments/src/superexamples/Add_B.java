package superexamples;

public class Add_B extends Add_A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Add_B obj=new Add_B();
		obj.add(10, 5);
		obj.find();
		
	}
	
	public void find()
	{
		if(super.sum%10==0)
		{
			System.out.println("The sum is divisible by 10");
		}
		else
		{
			System.out.println("Ths sum is not divisible by 10");
		}
			
	}

}
