package Expend;

import java.util.Scanner;

public class WomanExpend extends TeenageExpend {

	public WomanExpend(ExpendKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setExpendBirth(input);
		setExpendName(input);
		setExpendEmailwithYN(input);
		setExpendPhone(input);
	}

}
