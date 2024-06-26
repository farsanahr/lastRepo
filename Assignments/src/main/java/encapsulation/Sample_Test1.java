package encapsulation;

public class Sample_Test1 {

	private int pinno;
	
	public void setPin(int pinno)
	{
		this.pinno=pinno;
	}
	
	public int getPin()
	{
		System.out.println("The entered pin is:"+pinno);
		return pinno;
	}
	
	public void CheckPin(int pinno)
	{
		if(pinno==1001||pinno==1234||pinno==1212)
		{
			System.out.println("entered pin is valid");
			System.out.println("elgible for withdrawal");
		}
		else
		{
			System.out.println("invalid pin");
		}
	}
}
