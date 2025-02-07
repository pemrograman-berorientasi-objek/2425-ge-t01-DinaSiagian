package fintech.driver;
import fintech.model.Account;
import java.util.Scanner;

/**
 * @author 12S23009_Dina Marlina Siagian
 * @author 12S23028_Daniel Situmorang
 */
public class Driver1 {

    public static void main(String[] _args) {

        Scanner input = new Scanner(System.in);
        String command = input.nextLine();
        String owner = input.nextLine();
        String account_nama = input.nextLine();
        Account account = new Account(command, owner, account_nama);

        input.close();
        System.out.println(account.toString());

    }

}