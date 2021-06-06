package Expend;

import java.util.Scanner;

import exception.EmailFormatException;

public class GirlExpend extends TeenageExpend {
	String parentEmail;
	String parentPhone;
	
	public GirlExpend(ExpendKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setExpendBirth(input);
		setExpendName(input);
		setExpendEmailwithYN(input);
		setParentEmailwithYN(input);
		setExpendPhone(input);
	}
	
	public void setParentEmailwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n')
		{
			System.out.print("Do you have an parent's email address? (Y/N)");
			answer = input.next().charAt(0);
			try {
			if(answer == 'Y' || answer == 'y') {
				setExpendEmail(input);
				break;
			}
			else if (answer == 'N' || answer =='n') {
				this.setEmail("");
				break;
			}
			else {
			}
			}
			catch(EmailFormatException e) {
				System.out.println("Incorrect Email Format. put your e-mail address that contains @");
			}
		}
	}
	
	public void printInfo() {
		String skind = getKindString() ;
		System.out.println(" kind : " + skind);
		System.out.println(" Birth : " + birth);
		System.out.println(" Name : " + name);
		System.out.println(" Email : " + email);
		System.out.println(" Phone: " + phone);
		System.out.println(" parent's Email : " + email);
		System.out.println(" parent's Phone: " + phone);
		}
	
}
