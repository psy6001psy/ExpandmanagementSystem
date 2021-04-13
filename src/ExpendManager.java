import java.util.ArrayList;
import java.util.Scanner;

import Expend.Expend;
import Expend.ManExpend;

public class ExpendManager {
	ArrayList<Expend> expends = new ArrayList<Expend>();
	Scanner input;
	ExpendManager(Scanner input){
		this.input = input;
	}
	
	public void AddExpend() {
		int kind = 0;
		Expend expend;
		while (kind !=1 && kind != 2) {
			System.out.print("1 for Man");
			System.out.print("1 for Woman ");
			System.out.print("Select Customer Kind between 1 and 2: ");
			kind = input.nextInt();
			if (kind == 1) {
				expend = new Expend();
				expend.getUserInput(input);
				expends.add(expend);
				break;
			}
			else if (kind == 2) {
				expend = new ManExpend();
				expend.getUserInput(input);
				expends.add(expend);
				break;
			}
			else {
				System.out.print("Select Customer Kind  between 1 and 2: ");	
			}
		}
	}
	
	public void DeleteExpend() {
		System.out.print("Put in Consumer Birth: ");
		String newbirth = input.next();
		int index = -1;
		for (int i = 0; i<expends.size(); i++) {
			if(expends.get(i).getBirth() == newbirth) {
				index = i;
				break;
			}
		}
		
		
		if(index >= 0) {
			expends.remove(index);
			System.out.println(newbirth +"data is Deleted");
		}
		else {
			System.out.println("Unregisterd");
			return;
			}
		}
	
	public void EditExpend() {
		System.out.print("Put in Consumer Birth: ");
		String newbirth = input.next();
		for (int i = 0; i<expends.size(); i++) {
			Expend expend = expends.get(i);
			if (expend.getBirth() == newbirth) {
				int num = -1;
				while (num != 5) {
					System.out.println("**Consumer Info Edit Menu");
					System.out.println("1. Edit Birth");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Email");
					System.out.println("4. Edit PhoneNum");
					System.out.println("5. Edit Exit");
					System.out.println("Select on number between 1-6:");
					num = input.nextInt();
					if(num==1) {
						System.out.print("Consumer Birth:");
						String birth = input.next();
						expend.setBirth(birth);
					}
					else if (num ==2){
						System.out.print("Consumer Name:");
						String name = input.next();
						expend.setName(name);
					}
					else if (num ==3){
						System.out.print("Consumer Email:");
						String email = input.next();
						expend.setEmail(email);
					}
					else if (num ==4){
						System.out.print("Consumer PhoneNum:");
						String phone = input.next();
						expend.setPhone(phone);
					}
					else if (num ==5){
						break ;
					}
					else {
//					System.out.println("The Data is Edited: " + newbirth);
						continue;	
					} //if
				}//while
				break ;
			}//if
		}//for
	}
	
	
	public void ViewConsumers() {
//		System.out.print("Put in Consumer Birth: ");
//		int newbirth = input.nextInt();
		System.out.println("# of registered expends"+ expends.size());
		for (int i = 0; i<expends.size(); i++) {
			expends.get(i).printInfo();
		}
	}
}	

