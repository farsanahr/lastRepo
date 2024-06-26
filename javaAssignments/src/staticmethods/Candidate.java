package staticmethods;

public class Candidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean data=Candidate.eligible(6);
		if(data==true)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("Not eligible");
		}
	}

	private static boolean eligible(int age) {
		// TODO Auto-generated method stub
		if(age>=18)
		{
			return true;
		}
		else
		{
		return false;
		}
	}

}
