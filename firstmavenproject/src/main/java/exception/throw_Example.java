package exception;

public class throw_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=14;
		if(age>=18)
		{
			System.out.println("Eligible");
		}
		else
		{
			throw new ArithmeticException("invalid age");
		}

	}

}
