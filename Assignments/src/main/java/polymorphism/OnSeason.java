package polymorphism;

public class OnSeason extends OffSeason{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OnSeason obj1=new OnSeason();
		OffSeason obj2=new OffSeason();
		float totalamt=5600;
		int season=1;
		switch(season)
		{
		case 1: System.out.println("offseason");
		        obj2.calcDiscount(totalamt);
		        break;
		case 2:System.out.println("Onseason");  
		       obj1.calcDiscount(totalamt);
		       break;
		       
		default:System.out.println("invalid sdeason");
		}

	}
public void calcDiscount(float amount)
{
	float disc=0.40f*amount;
	System.out.println("DISCOUNT:"+disc);
}
}
