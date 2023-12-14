package encapsulation;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank obj = new Bank();
		
		obj.pinNo = 2222;
		obj.accountNo=98765;
		
		obj.updatePin(123456, 1234, 3333);
		obj.withdrawAmount(123456, 2222, 1000);

	}

}
