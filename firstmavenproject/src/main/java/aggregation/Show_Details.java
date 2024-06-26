package aggregation;

public class Show_Details {
	int rollno;
	String grade;
	Details_Stud refv;  //Aggregation

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details_Stud obj1=new Details_Stud("Anu","Tvm","India");
		Show_Details obj=new Show_Details(123,"A",obj1);
		
		obj.display();

	}
	
	Show_Details(int rollno,String grade,Details_Stud refv) // classname referencevariable
	{
		this.rollno=rollno;
		this.grade=grade;
		this.refv=refv; //
	}
	
	
	public void display()
	{
		System.out.println("rollno"+rollno+"grade"+grade);
		System.out.println("name"+refv.name+"city"+refv.city+"country"+refv.country); //reference variable.datamembers
		}

}
