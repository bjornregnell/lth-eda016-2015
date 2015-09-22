package week04;

import java.util.Calendar;

public class BankAccountWithInterest {
    private int accntNbr;        // kontonummer
    private int balance;         // saldo
    private double interestRate; // räntesats i procent
    private double interest;     // ackumulerad ränta 
                                 // under året
    private int lastInterestDay; // dagnummer för senaste 
                                 // ränteberäkning

    /** Skapar ett bankkonto med numret accntNbr och saldot noll */
    public BankAccountWithInterest(int accntNbr, double interestRate) {
        this.accntNbr = accntNbr;
        this.balance = 0;
        this.interest = 0;
        this.interestRate = interestRate;
    }

    /** Tar reda på kontonumret */
    public int getAccntNbr() {
        return accntNbr;
    }

	/** Tar reda på saldot */
    public int getBalance() {
        return balance;
    }
    
    public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void deposit(int amount) {
        computeInterest();
        balance = balance + amount;
    }
    
    /** Adderar årets ränta till saldot. Ska utföras vid årsskifte */
    public void newYearActions() {
        computeInterest();
        balance = balance + (int) Math.round(interest);
        interest = 0;
        lastInterestDay = 1;
    }
    
    /** Adderar räntan sedan föregående insättning eller uttag */
    private void computeInterest() {
        interest = interest + interestRate / 100.0 *
                   (Date.today() - lastInterestDay) / 
                   360 * balance;
        lastInterestDay = Date.today();
    }    
}
