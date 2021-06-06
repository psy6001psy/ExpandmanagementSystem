package Expend;

import java.util.Scanner;

import exception.EmailFormatException;

public interface ExpendInput {

	public String getBirth();
	
	public void setBirth(String birth);
	
	public String getName();
	
	public void setName(String name);
	
	public String getEmail();
	
	public void setEmail(String email) throws EmailFormatException;
	
	public String getPhone();
	
	public void setPhone(String phone);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setExpendBirth(Scanner input);
	
	public void setExpendName(Scanner input);
	
	public void setExpendEmail(Scanner input);
	
	public void setExpendPhone(Scanner input);
	
}
