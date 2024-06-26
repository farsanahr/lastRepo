package iteratorinterface;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> obj=new ArrayList<String>(); //arraylist declaration
     obj.add("Malayalam");
     obj.add("English");
     obj.add("Science");
     obj.add("maths");
     
     System.out.println(obj);  //print the elements as list
     
     Iterator<String> itobj=obj.iterator();   //iterating arraylist
     while(itobj.hasNext())   //pointout and fetch firstelement
     {
    	 System.out.println(itobj.next() );   //print each elements outside of list
     }
     
     itobj.remove(); //remove only the lastelement
     System.out.println(obj);
     
     
	}

}
