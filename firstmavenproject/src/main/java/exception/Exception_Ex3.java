package exception;

public class Exception_Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10,b=0;
			int c=a/b;  //Exception occurred at this line nd further code cant be executed
			System.out.println("Hai");
			System.out.println(c);
		}
		/*catch(ArithmeticException ae)
		{
			System.out.println("Exception occured");
			//System.out.println(ae);
			
		}*/
		finally
		{
			System.out.println("Completed");
		}
		

	}

	

}
