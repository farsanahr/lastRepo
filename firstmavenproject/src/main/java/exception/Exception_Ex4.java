package exception;

public class Exception_Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			 String arr[]= {"red","orange","blue"};
		 for(int i=0;i<=arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception occured");
		}
		/*finally
		{
			System.out.println("completed");
		}*/
	
	}

}
