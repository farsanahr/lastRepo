package staticmethods;

public class Customer_Discount {

	float item1,item2,item3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer_Discount obj=new Customer_Discount();
		float tAmount=obj.getPrice(1500, 1650, 1150);
		double discountPrice=obj.discount(tAmount);
		if(discountPrice==tAmount)
		{
			System.out.println("FinalAmount:"+tAmount);
		}
		else
		{
			double finalamount=tAmount-discountPrice;
			System.out.println("Final amount is"+finalamount);
		}
		

	}
	
	public float getPrice(float a,float b,float c)
	{
		item1=a;
		item2=b;
		item3=c;
		float totalAmount=item1+item2+item3;
		System.out.println("TotalSAmount"+totalAmount);
		return totalAmount;
	}
	
	public double discount(float amount)
	{
		double discount=0;
		if(amount>5000)
		{
			System.out.println("Customer have 20% discount");
			discount=(0.2)*amount;
			System.out.println("Discount amount is"+discount);
			return discount;
			
		}
		else
		{
			System.out.println("No discount applicable");
			return amount;
		}
	}

}
