package week04;

public class BankAccount {
    private int accntNbr; // kontonummer
    private int balance;  // saldo

    /** Skapar ett bankkonto med numret accntNbr och saldot noll */
    public BankAccount(int accntNbr) {
        this.accntNbr = accntNbr;
        this.balance = 0;
    }

    /** Tar reda på kontonumret */
    public int getAccntNbr() {
        return accntNbr;
    }
    
    /** Tar reda på saldot */
    public int getBalance() {
        return balance;
    }

    /** Sätter in amount kronor på kontot */
    public void deposit(int amount) {
        balance = balance + amount;
    }
    
    /** Tar ut amount kronor från kontot */
    public void withdraw(int amount) {
        balance = balance - amount;
    }
}
