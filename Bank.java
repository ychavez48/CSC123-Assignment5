//Yvette Chavez (ychavez48@toromail.csudh.edu)

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Bank {
	
	private static ArrayList<BankAccount> accounts=new ArrayList<BankAccount>();
	private static ArrayList<BankAccount> transaction = new ArrayList<BankAccount>();
	
	public static BankAccount openAccount(String firstName, String lastName, String ssn, String accountName) {
		client c=new client(firstName,lastName, ssn);
		BankAccount acc=new BankAccount(accountName,c);
		accounts.add(acc);
		transaction.add(acc);
		return acc;
		
	}
	public static BankAccount openaccount(String firstName, String lastName, String ssn) {
		client c=new client(firstName,lastName, ssn);
		BankAccount acc=new BankAccount(c);
		accounts.add(acc);
		transaction.add(acc);
		return acc;
		
	}
	public static void saveTransaction() throws IOException {
		File file = new File("transaction.txt");
		FileWriter fw = new FileWriter("transaction.txt");
		fw.write(user.MSG_AMOUNT);
		
	}
	public static BankAccount lookup(int accountNumber) {
		for (BankAccount acc:accounts) {
			if(acc.getAccountNumber()==accountNumber)
				return acc;
		}
		return null;	
	}
	
	public static void listAccounts() {
		System.out.println("");
		for (BankAccount acc:accounts) {
			System.out.println(acc);
		}	
	}
	public static void listTransaction() {
		System.out.println("");
		for (BankAccount acc:transaction) {
			System.out.println(transaction);
		}	
	}
	
	public static void listTransactions() {
		System.out.println("");
		for( BankAccount acc:accounts) {
			System.out.println(acc);
		}
	}
	public static BankAccount openAccount(String readString, String readString2, String readString3) {
		// TODO Auto-generated method stub
		return null;
	}	
}
