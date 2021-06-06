package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Expend.Expend;
import Expend.ExpendInput;
import Expend.ExpendKind;
import Expend.ManExpend;
import Expend.WomanExpend;
import Expend.GirlExpend;

public class ExpendManager implements Serializable {
	/**
	 * 
	 */
	static final long serialVersionUID = -6084457482867988057L;
	ArrayList<ExpendInput> expends = new ArrayList<ExpendInput>();
	transient Scanner input;
	ExpendManager(Scanner input){
		this.input = input;
	}
	
	public void addExpend() {
		int kind = 1;
		ExpendInput expendInput;
		
		while (kind == 1) {
			try {
			System.out.println("1. for Man");
			System.out.println("2. for Woman ");
			System.out.println("3. for Boy ");
			System.out.println("4. for Girl ");
			System.out.print("Select num 1, 2, 3 or 4 for Student kind : ");
			kind = input.nextInt();
			if (kind == 1) {
				expendInput = new ManExpend(ExpendKind.Man);
				expendInput.getUserInput(input);
				expends.add(expendInput);
				break;
			}
			else if (kind == 2) {
				expendInput = new WomanExpend(ExpendKind.Woman);
				expendInput.getUserInput(input);
				expends.add(expendInput);
				break;
			}
			else if (kind == 3) {
				expendInput = new WomanExpend(ExpendKind.Boy);
				expendInput.getUserInput(input);
				expends.add(expendInput);
				break;
			}
			else if (kind == 4) {
				expendInput = new GirlExpend(ExpendKind.Girl);
				expendInput.getUserInput(input);
				expends.add(expendInput);
				break;
			}
			else {
				System.out.println("Again please");	
			}
			}
			catch(InputMismatchException e) {
				System.out.println("please put an integer between 1 and 3");
				if(input.hasNext()){
					input.next();
				}
				kind = -1; 
			}
		}
	}
	
	public void deleteExpend() {
		System.out.print("Put in Consumer Birth: ");
		String expendBirth = input.next();
		int index = findIndex(expendBirth);
		 removefromExpends(index, expendBirth);
	}	
	
	public int findIndex(String expendBirth) {
		int index = -1;
		for (int i = 0; i<expends.size(); i++) {
			if (expends.get(i).getBirth() == expendBirth) {//잘모르겠음
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromExpends(int index, String expendBirth) {
		if(index >= 0) {
			expends.remove(index);
			System.out.println("the expend " + expendBirth + " is Deleted");
			return 1;
		}
		else {
			System.out.println("Unregisterd");
			return -1;
			}
		}
	
	
	public void editExpend() {
		System.out.print("Put in Consumer Birth: ");
		String ExpendBirth = input.next();
		for (int i = 0; i<expends.size(); i++) {
			ExpendInput expend = expends.get(i);
			if (expend.getBirth() == ExpendBirth) {
				int num = -1;
				while (num != 5) {
					showEditMenu() ;
					num = input.nextInt();
					switch(num) {
					case 1:
						expend.setExpendBirth(input);
						break;
					case 2:
						expend.setExpendName(input);
						break;
					case 3:
						expend.setExpendEmail(input);
						break;
					case 4:
						expend.setExpendPhone(input);
						break;
					default:
						continue;
					}
				}//while
				break ;
			}//if
		}//for
	}
	
	public void viewExpend() {
		System.out.println("# of registered expends"+ expends.size());
		for (int i = 0; i<expends.size(); i++) {
			expends.get(i).printInfo();
		System.out.println("");
		}
	}
	
	public int size() {
		return expends.size();
	}
	
	public ExpendInput get(int index) {
		return (Expend) expends.get(index);
	}
	
	public void showEditMenu() {
		System.out.println("**Consumer Info Edit Menu");
		System.out.println("1. Edit Birth");
		System.out.println("2. Edit Name");
		System.out.println("3. Edit Email");
		System.out.println("4. Edit PhoneNum");
		System.out.println("5. Edit Exit");
		System.out.println("Select on number between 1-6:");
	}

}