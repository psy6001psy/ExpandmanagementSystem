package Expend;

import java.util.Scanner;

public class ManExpend extends Expend {
	
	public ManExpend(ExpendKind kind) {
		super(kind);
	}


	public void getUserInput(Scanner input) {
			setExpendBirth(input);
			setExpendName(input);
			setExpendEmail(input);
			setExpendPhone(input);
	}
	
	public void printInfo() {
		String skind = getKindString() ;
		System.out.println(" kind : " + skind);
		System.out.println(" Birth : " + birth);
		System.out.println(" Name : " + name);
		System.out.println(" Email : " + email);
		System.out.println(" Phone: " + phone);
		}
	
}
