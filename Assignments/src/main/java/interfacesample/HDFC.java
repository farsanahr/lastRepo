package interfacesample;

public class HDFC implements RBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFC obj=new HDFC();
		obj.recurringDeposit();

	}

	@Override
	public void recurringDeposit() {
		// TODO Auto-generated method stub
		float deposit=amount+(amount*interestrate*durationinyrs);
		System.out.println("Deposit amount is:"+deposit);
	}

}
