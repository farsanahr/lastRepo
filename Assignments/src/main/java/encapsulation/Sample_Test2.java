package encapsulation;

public class Sample_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample_Test1 obj=new Sample_Test1();
		obj.setPin(1213);
		int pin=obj.getPin();
		obj.CheckPin(pin);

	}

}
