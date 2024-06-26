package exception;

public class Custom_Example {
	

	public static void main(String[] args)throws VotingException
	{
		// TODO Auto-generated method stub
		Custom_Example ex=new Custom_Example();
		ex.check(17);

	}
	
	public void check(int age)throws VotingException
	{
		if(age>=18)
		{
			System.out.println("Eligible");
		}
		else
		{
			throw new VotingException("Not eligible");
		}
	}

	
}
