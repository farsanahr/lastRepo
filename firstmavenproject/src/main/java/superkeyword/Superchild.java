package superkeyword;

public class Superchild extends SuperExample1 {
	String name="hamdulla";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superchild obj=new Superchild();
		obj.display();

	}
	public void display()
	{
		System.out.println(name);
		System.out.println(super.name);
	}	

}
