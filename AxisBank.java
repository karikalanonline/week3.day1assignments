package week3.day1;

public class AxisBank extends BankInfo {
	
	public void depoist() {
		System.out.println("Dollars Depoist - 5% int");
	}

	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.depoist();
	}
}
