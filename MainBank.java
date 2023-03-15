//Yvette Chavez (ychaves48@toromail.csudh.edu)
import java.util.Scanner;
public class MainBank {
	static int option = 0;
	public static int accnt=0;
	

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws InsufficientBalanceException, AccountClosedException{

		BankAccount acc;
		try {
		do {
			option = user.getMainOption();
			switch (option) {
			case 1:
				user.print(user.MSG_ACCOUNT_OPENED,
						new Object[] { Bank.openAccount(user.readString(user.MSG_FIRST_NAME),
								user.readString(user.MSG_LAST_NAME), user.readString(user.MSG_SSN),
								user.readString(user.MSG_OVERDRAFT_LIMIT)).getAccountNumber() });
				break;
			case 2:
				user.print(user.MSG_ACCOUNT_OPENED,
						new Object[] { Bank.openaccount(user.readString(user.MSG_FIRST_NAME),
								user.readString(user.MSG_LAST_NAME), 
								user.readString(user.MSG_SSN)).getAccountNumber() });
				break;
			case 3:
				Bank.listAccounts();
				break;
			case 4: 
				Bank.listTransaction();
			
				break;

			case 5:
				acc = findAccount();
				if (acc != null) {
					printAccountAction(acc.deposit(user.readDouble(user.MSG_AMOUNT)), "Deposit", acc);
				}
				break;
			case 6:
				acc = findAccount();
				if (acc != null) {
					printAccountAction(acc.withdraw(user.readDouble(user.MSG_AMOUNT)), "Withdrawal", acc);
				}
				break;

			case 7:
				acc = findAccount();
				if (acc != null) {
					acc.close();
					user.print(user.MSG_ACCOUNT_CLOSED,new Object[] {acc.getAccountNumber(),acc.getBalance()});

				}
				break;
			case 8:
				
			}
			

		} while (option != 9);
		}catch( AccountClosedException e) {
			System.out.println(e.getMessage);
		}

	}
	
	private static void listAll(String actionType,BankAccount ac) {
		user.print(user.MSG_ACCOUNT_ACTION, new Object[] { actionType, "successful", ac.getBalance() });
	}

	private static void printAccountAction(boolean outcome, String actionType, BankAccount ac) {
		if (outcome) {
			user.print(user.MSG_ACCOUNT_ACTION, new Object[] { actionType, "successful", ac.getBalance() });
		}else {
			user.print(user.MSG_ACCOUNT_ACTION, new Object[] { actionType, "failed", ac.getBalance() });
		}
	}

	private static BankAccount findAccount() {
		int aNumber = user.readInt(user.MSG_ACCOUNT_NUMBER);
		BankAccount acc = Bank.lookup(aNumber);
		if (acc == null)
			user.print(user.MSG_ACCOUNT_NOT_FOUND, new Object[] { aNumber });
		return acc;
	}
}
