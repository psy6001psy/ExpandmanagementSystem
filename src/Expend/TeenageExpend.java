package Expend;

import java.util.Scanner;

import exception.EmailFormatException;

public abstract class TeenageExpend extends Expend {

	public TeenageExpend(ExpendKind kind) {
		super(kind);
	}
	@Override
	public abstract void getUserInput(Scanner input); 
	
	@Override
	public void printInfo() {
		String skind = getKindString() ;
		System.out.println(" kind : " + skind);
		System.out.println(" Birth : " + birth);
		System.out.println(" Name : " + name);
		System.out.println(" Email : " + email);
		System.out.println(" Phone: " + phone);
	}

	public void setExpendEmailwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n')
		{
			System.out.print("Do you have an email address? (Y/N) : ");
			answer = input.next().charAt(0);
			try {
				if(answer == 'Y' || answer == 'y') {
					System.out.print("Email adress : ");
					String email = input.next();
					this.setEmail(email);
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
				System.out.println("Incorrect Email Format. put your e-mail address that contains '@' ");
				setExpendEmailwithYN(input);
			}
		}
	}
} 
