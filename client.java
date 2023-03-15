//Yvette Chavez (ychavez48@toromail.csudh.edu)

import java.util.Scanner; 

public class client {
	
	private String fName;
	private String lName;
	private String ssn;

	public client(String fName, String lName, String ssn) {
		setFirstName(fName);
		setLastName(lName);
		setSSN(ssn);
		
	}
	
	public client() {}

	public client(client p) {
		this.fName=p.getFirstName();
		this.lName=p.getLastName();
		this.ssn=p.getSSN();
	}	
	
	
	public void setFirstName(String s) {
		fName=s;
		
	}
	
	public void setLastName(String s) {
		lName=s;
	}

	public void setSSN(String s) {
		ssn=s;
	}

	public String getFirstName() {
		return fName;
	}
	
	public String getLastName() {
		return lName;
	}
	

	public String getSSN() {
		return ssn;
	}

	@Override
	public String toString() {
		
		return fName+" : "+lName+" : "+ssn; 
	}

	@Override
	public boolean equals(Object obj) {
		
		client other=(client)obj;
		return this.fName.equalsIgnoreCase(other.getFirstName())
				&&this.lName.equalsIgnoreCase(other.getLastName())
						&&this.ssn.equalsIgnoreCase(other.getSSN());
	}
}