package accessmodifiers;

public class Example_Modifier {
	public static void main(String[] args) {
		Example_Modifier obj=new Example_Modifier();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();
	}
		// TODO Auto-generated method stub
     public void display1()
     {
    	 System.out.println("It is a public modifier");    
    	 }
     private void display2()
     {
    	 System.out.println("Its a private modifier");
     }
     protected void display3()
     {
    	 System.out.println("Its a protected modifier");
     }
     void display4()
     {
    	 System.out.println("Its a default modifier");
     }
	

}
