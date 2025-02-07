package fintech.model;

/**
 * @author 12S23009_Dina Marlina Siagian
 * @author 12S23028_Daniel Situmorang
 */
public class Transaction {

    private int id;
    private String account_name;
    private String posted_at;
    private double amount;
    private String note;
    private double balance;

    public Transaction(int _id, String _account_name, String _posted_at, double _amount, String _note, double _balance) {
        this.id = _id;
        this.account_name = _account_name;
        this.posted_at = _posted_at;
        this.amount = _amount;
        this.note = _note;
        this.balance = _balance + _amount;
    }

    public String getAccountName() {
        return this.account_name;
    }

    public String getPostedAt() {
        return this.posted_at;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getNote() {
        return this.note;
    }

    public double getBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return this.id + "|" + this.account_name + "|" + this.amount + "|" + this.posted_at + "|" + this.note + "|" + this.balance;
    }
}