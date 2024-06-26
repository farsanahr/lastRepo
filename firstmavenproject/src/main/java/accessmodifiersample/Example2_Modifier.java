package accessmodifiersample;

import accessmodifiers.Example_Modifier;

public class Example2_Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example_Modifier obj2=new Example_Modifier();
		obj2.display1();
		//obj2.display3(); protected access method within another package
		//obj2.display4(); default access method within another 
	}

}
