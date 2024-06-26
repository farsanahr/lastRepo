package inheritance;

public class Multi2_Csample extends Multi1_Bsample{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multi2_Csample obj=new Multi2_Csample();
		obj.display();
		obj.display1();
		obj.show();
		
	}
	public void show()
	{
		System.out.println("This is multilevel inheritence example");
	}

}
