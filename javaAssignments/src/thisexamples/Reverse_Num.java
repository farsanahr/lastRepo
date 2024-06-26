package thisexamples;

public class Reverse_Num {
	
	int num,remainder,reverse;
	
	public Reverse_Num()
	{
		this(789);
		System.out.println("Finding reverse is"+reverse);
		
	}
	
	public Reverse_Num(int num)
	{
		while(num>0)
		{
			this.num=num;
			this.remainder=num%10;
			this.reverse=reverse*10+remainder;
			num=num/10;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_Num obj=new Reverse_Num();

	}

}
