package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import GUI.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ExpendManager expendManager = getObject("log.txt"); // 여기서 이상함
		if (expendManager == null) {
			expendManager = new ExpendManager(input);
		}
		else {
			System.out.println("error");
		}
		
		WindowFrame frame = new WindowFrame(expendManager);
		selectMenu(input, expendManager);
		putObject(expendManager, "expendmanager.ser");
	}
	
	public static void selectMenu(Scanner input, ExpendManager expendManager) {
		int num = -1;
		while (num != 5) {
			try {
			showMenu() ;
			num = input.nextInt();
			switch(num) {
			case 1 :
				expendManager.addExpend();
				break ;
			case 2 :
				expendManager.deleteExpend();
				break ; 
			case 3 :
				expendManager.editExpend();
				break ;
			case 4 :
				expendManager.viewExpend();
				break ;
			
			default :
				continue ;
			}
		}
		catch(InputMismatchException e) { //??
			System.out.println("please put an integer between 1 and 5");
			if(input.hasNext()){
				input.next();
			}
			num = -1;
		}
	}	
}
	
	public static void showMenu() {
		System.out.println("1. Add Expenditure");
		System.out.println("2. Delete Expenditure");
		System.out.println("3. Edit Expenditure"); 
		System.out.println("4. View Consumers");
		System.out.println("5. Exit"); 
		System.out.print("Select one number between 1~5 : ");	
	}
	
	
	public static ExpendManager getObject(String filename) {
		ExpendManager expendManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			expendManager = (ExpendManager) in.readObject();
			
			in.close();
			file.close();
			
			
		} catch (FileNotFoundException e) {
			return expendManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return expendManager;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return expendManager;
	}
	
	public static void putObject(ExpendManager expendManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(expendManager);
			
			out.close();
			file.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
