package aggregation;

public class Address {
	Student std;
	String city,state,country;
	int pin;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1=new Student();
		Address obj=new Address("kzt","Tvm","India",67895,obj1);
		obj1.getDetails("FARSANA", 12345);
		obj.show();

	}
	Address(String city,String state,String country,int pin,Student std)
	{
		this.city=city;
		this.state=state;
		this.country=country;
		this.pin=pin;
		this.std=std;
	}
	
	public void show()
	{
		System.out.println("NAME:"+std.name+"ROLLNO:"+std.rollno);
		System.out.println("CITY:"+city+"STATE:"+state+"COUNTRY:"+country+"PIN:"+pin);
		
	}

}
