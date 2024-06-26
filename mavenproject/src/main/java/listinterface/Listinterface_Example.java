package listinterface;

import java.util.ArrayList;
import java.util.List;

public class Listinterface_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>obj=new ArrayList<String>();
		
		obj.add("Green");
		obj.add("Red");
		obj.add("Yellow");
		obj.add("violet");
		obj.add("Red");
		obj.add("Red");
		
		System.out.println(obj);
		
		obj.set(1,"Orange");
		System.out.println(obj);
		
		int firstIndex=obj.indexOf("Yellow");
		int lastIndex=obj.lastIndexOf("Red");
		
		System.out.println(firstIndex);
		System.out.println(lastIndex);
		
		obj.remove(3);
		System.out.println(obj);
		
		String s=obj.get(4);
		System.out.println(s);
		
		boolean b=obj.contains("Red");
		System.out.println(b);
		
		//String data=
		

	}

}
