

import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		ExpendManager expandmanager = new ExpendManager(input);
	
		while (num != 6) {
			System.out.println("1. Add Expenditure");
			System.out.println("2. Delete Expenditure");
			System.out.println("3. Edit Expenditure");
			System.out.println("4. List Expenditure");
			System.out.println("5. View Consumer");
			System.out.println("6. Exit"); 
			System.out.print("Select one number between 1~6: ");
			num = input.nextInt();
			if (num == 1) {
				expandmanager.AddEepand();
			}
			else if (num == 2) {
				expandmanager.DeletExpend();
			}
			else if (num == 3) {
				expandmanager.EditExpend();
			}
			else if (num == 4) {
				expandmanager.ListExpend();
			}
			else if (num == 5) {
				expandmanager.ViewConsumer();
			}
	
		}	
	}
}