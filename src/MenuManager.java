import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		ExpendManager expandmanager = new ExpendManager(input);
	
		while (num != 5) {
			System.out.println("1. Add Expenditure");
			System.out.println("2. Delete Expenditure");
			System.out.println("3. Edit Expenditure"); 
			System.out.println("4. View Consumers");
			System.out.println("5. Exit"); 
			System.out.print("Select one number between 1~5: ");
			num = input.nextInt();
			if (num == 1) {
				expandmanager.AddExpend();
			}
			else if (num == 2) {
				expandmanager.DeleteExpend();
			}
			else if (num == 3) {
				expandmanager.EditExpend();
			}
			else if (num == 4) {
				expandmanager.ViewConsumers();
			}
	
		}	
	}
}