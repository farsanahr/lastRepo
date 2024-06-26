package superkeyword;

public class SuperExample2 extends SuperParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SuperParent obj=new SuperExample2 (); upcasting
				SuperExample2 obj=new SuperExample2();
				obj.display1();
				obj.display();
	}
	public void display()
	{
		//super.display();
		System.out.println("This is a super child class");
		
	}

}
