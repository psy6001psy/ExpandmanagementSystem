

import java.util.Scanner;

public class ExpendManager {
	Scanner input;
	ExpendManager(Scanner input){
		this.input = input;
	}
	Expend expend;
	
	public void AddEepand() {
		expend = new Expend();
		System.out.print("Consumer Birth input: ");		
		expend.birth = input.nextInt();
		System.out.print("Consumer Name input: ");
		expend.name = input.next();
		System.out.print("Consumer Email input: ");
		expend.email = input.next();
		System.out.print("Consumer PhoneNum input: ");
		expend.phone = input.next();
	}
	
	public void DeletExpend() {
		System.out.print("Put in Consumer Birth: ");
		int newbirth = input.nextInt();
		if(expend == null) {
			System.out.println("UNREGISTERED");
			return;
		}
		else if(expend.birth == newbirth) {
			expend = null;
			System.out.println("The Data is Deleted");	
		}
	}
	
	public void EditExpend() {
		System.out.print("Put in Consumer Birth: ");
		int newbirth = input.nextInt();
		if(expend.birth == newbirth) {
			System.out.println("The Data To Be Edited: " + newbirth);
		}
	}
	
	public void ListExpend() {
		
	}
	
	public void ViewConsumer() {
		System.out.print("Put in Consumer Birth: ");
		int newbirth = input.nextInt();
		if(expend.birth == newbirth) {
			expend.printInfo();
		}
	}
}
