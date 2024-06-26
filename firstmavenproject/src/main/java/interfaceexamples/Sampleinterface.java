package interfaceexamples;

public class Sampleinterface implements Sample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sampleinterface obj=new Sampleinterface();
		obj.display();
		

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Interface example");
		
	}

}
