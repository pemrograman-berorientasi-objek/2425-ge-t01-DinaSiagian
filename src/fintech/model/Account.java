package fintech.model;

/**
 * @author 12S23009_Dina Marlina Siagian
 * @author 12S23028_Daniel Situmorang
 */
public class Account {

    private final String owner;
    private final String account_nama;
    private double balance;

    public Account(String _command, String _owner, String _account_nama) {
        this.owner = _owner;
        this.account_nama = _account_nama;
        balance = 0.0;
    }

    public String getOwner() {
        return this.owner;
    }
    public String getAccountNama() {
        return this.account_nama;
    }
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double _balance) {
        this.balance = _balance;
    }

    @Override
    public String toString() {
        return this.account_nama + "|" + this.owner + "|" + this.balance;
    }
}