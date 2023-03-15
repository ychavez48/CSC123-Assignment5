
//Yvette Chavez (ychaves48@toromail.csudh.edu)
public class BankAccount {
	
	private static int accountNumberCounter=1000;
	
	private String accName;
	private client accountHolder;
	private boolean open=true;
	private int accountNumber;
	private double total;
	
	public BankAccount(String name, client customer) {
		accName=name;
		accountHolder=customer;
		total=0.0;
		accountNumber=++accountNumberCounter;
	}
	public BankAccount() {
		
	}
	public BankAccount( client customer) {
		accountHolder=customer;
		total=0.0;
		accountNumber=++accountNumberCounter;
	}
	public String getAccountName() {
		return accName;
	}
	public void setAccountName(String accountName) {
		this.accName = accountName;
	}
	public client getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(client accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getBalance() {
		return total;
	}
	
	public boolean deposit(double amount) throws AccountClosedException{
		if(isOpen()) {
			total+=amount;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean withdraw(double amount) {
		if(total-amount>=0) {
			total-=amount;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void close() {
		open=false;
	}
	
	public boolean isOpen() {
		return open;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public String toString() {
		String s=accountNumber+"("+accName+")"+" : "+accountHolder.toString()+ " : "+total+" : "+(open?"Account Open":"Account Closed");
		return s;
	}
}