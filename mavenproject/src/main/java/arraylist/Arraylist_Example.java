package arraylist;

import java.util.ArrayList;

public class Arraylist_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("farsana");
		list.add("eshan");
		list.add("ershad");
		System.out.println(list);
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Fousiya");
		list2.add("ramla");
		list2.add("hamdulla");
		System.out.println(list2);
		list.addAll(list2);
		System.out.println(list);
		
		boolean b=list.contains("Manju");
		System.out.println(b);
		
		System.out.println(list.get(1));
		
		System.out.println(list.isEmpty());
		
		list.remove(0);
		System.out.println(list  );
		
		System.out.println(list.size());
		

	}

}
