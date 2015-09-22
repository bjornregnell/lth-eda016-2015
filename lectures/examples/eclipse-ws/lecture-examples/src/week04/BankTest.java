package week04;

public class BankTest {

	public static void main(String[] args) {
		BankAccountWithInterest ba = new BankAccountWithInterest(42, 4);
		Date.setToday(100);
		ba.deposit(50000);
		Date.setToday(110);
		ba.deposit(50000);
		Date.setToday(360);
		ba.newYearActions();
		System.out.println("Balance: " + ba.getBalance());
	}

}
