package exception;

public class Exception_Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=Integer.parseInt("89.78");
			System.out.println(a);
		}
		catch(NumberFormatException e)
		{
			System.out.println("invalid string in argument");
		}
		

	}

}
