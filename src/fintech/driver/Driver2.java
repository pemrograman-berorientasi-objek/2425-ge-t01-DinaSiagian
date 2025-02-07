package fintech.driver;
import java.util.Scanner;
import fintech.model.Transaction;
import fintech.model.Account;

/**
 * @author 12S23009_Dina Marlina Siagian
 * @author 12S23028_Daniel Situmorang
 */
public class Driver2 {

    public static void main(String[] _args) {

        Scanner input = new Scanner(System.in);
        String command = input.nextLine();
        String owner = input.nextLine();
        String account_nama = input.nextLine();
        Account account = new Account(command, owner, account_nama);
        System.out.println(account.toString());

        String command2 = input.nextLine();
        account_nama = input.nextLine();
        Double amount = input.nextDouble();
        input.nextLine();
        String posted_at = input.nextLine();
        String note = input.nextLine();
        Double balance = account.getBalance();
        int id = 1;
        Transaction transaction = new Transaction( id, account.getAccountNama(), posted_at, amount, note, balance);
        input.close();

    
        System.out.println(transaction.toString());
    }

}