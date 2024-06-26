package string;

public class Palindrome_String {
	
	static String data="java";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Palindrome_String.Reverse(data);
	}
public static void Reverse(String letter)
{
	StringBuilder obj=new StringBuilder(letter);
	String reversedString=obj.reverse().toString();
	System.out.println("Revesed Strting is"+reversedString);
	if(letter.equals(reversedString))
	{
		System.out.println("The entered string is palindrome");
	}
	else
	{
		System.out.println("The entered string is not palindrome");
	}
}
}
