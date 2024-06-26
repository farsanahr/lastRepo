package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list=new ArrayList<String>();
		list.add("Green");
		list.add("Blue");
		list.add("Yellow");
		list.add("Orange");
		list.add("violet");
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		Iterator<String> obj=list.iterator();
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
		
		System.out.println(list.remove(3));
		System.out.println(list);
		
		boolean data=list.contains("violet");
		if(data==true)
		{
			
			 System.out.println("found at position:"+list.indexOf("violet"));
		}
		else
		{
			System.out.println("Not found");
		}

	}

}
