package week04;

public class BankTest {

	public static void main(String[] args) {
		BankAccountWithInterest ba = new BankAccountWithInterest(42, 0.04);
		ba.deposit(42);
	}

}
