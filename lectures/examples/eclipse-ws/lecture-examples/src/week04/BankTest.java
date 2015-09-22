package week04;

public class BankTest {

	public static void main(String[] args) {
		BankAccountWithInterest ba = new BankAccountWithInterest(42, 0.04);
		Date.setToday(100);
		ba.deposit(50000);
		Date.setToday(110);
		ba.deposit(50000);
		Date.setToday(365);
		ba.newYearActions();
		System.out.println("Balance: " + ba.getBalance());
	}

}
