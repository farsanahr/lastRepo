package inheritance;

public class Salary_First extends Salary_Second {
	
	float bp,dd,bs,totalsal;
	
	public void TotalSalary(float bp,float dd,float bs)
	{
		this.bp=bp;
		this.dd=dd;
		this.bs=bs;
		this.totalsal=bp+super.hra-super.pf-dd+bs;
		this.show();
	}

	public void show() {
		// TODO Auto-generated method stub
		
		System.out.println("SALARY DETAILS:");
		System.out.println("Basicpay"+this.bp);
		System.out.println("Deduction"+this.dd);
		System.out.println("HRA:"+super.hra);
		System.out.println("PF:"+super.pf);
		System.out.println("Bonus:"+this.bs);
		System.out.println("Salary by hand:"+this.totalsal);
		
		
	}

}
