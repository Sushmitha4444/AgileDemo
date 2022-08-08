package practiceprojects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


	
	public class Fixbugs {
	public static void main(String[] args) {
	
	
	System.out.println("Hello, Welcome \n");
	System.out.println("**** ");
	optionsSelection();

	}

	private static void optionsSelection() {
	String[] arr = { "1. I want to review my expenditure", "2. I want to add my expenditure",
	"3. I want to delete my expenditure", "4. I want to sort the expenditures",
	"5. I want to search for a particular expenditure", "6. Close the application" };
	int[] arr1 = { 1, 2, 3, 4, 5, 6 };
	int leng = arr1.length;
	for (int i = 0; i < leng; i++) {
	System.out.println(arr[i]);
	
	}
	ArrayList<Integer> arrlist = new ArrayList<Integer>();
	ArrayList<Integer> expenses = new ArrayList<Integer>();

	expenses.add(1000);
	expenses.add(3000);
	expenses.add(5000);
	expenses.add(8000);
	expenses.add(9000);

	expenses.addAll(arrlist);
	System.out.println("\nPlease enter your choice:\t");
	Scanner sc = new Scanner(System.in);
	int options = sc.nextInt();
	for (int j = 1; j <= leng; j++) {
	if (options == j) {
	switch (options) {
	case 1:
	System.out.println("Your saved expenses are listed below: \n");
	System.out.println(expenses + "\n");
	optionsSelection();
	break;
	case 2:
	System.out.println("Enter the value to be added to your Expense: \n");
	int value = sc.nextInt();
	expenses.add(value);
	System.out.println("Please wait, Your value is getting updated\n");
	expenses.addAll(arrlist);
	System.out.println(expenses + "\n");
	optionsSelection();

	break;
	case 3:
	System.out.println(
	"Expenses about to delete, please confirm by chosing same option \n");
	int con_choice = sc.nextInt();
	if (con_choice == options) {
	expenses.clear();
	System.out.println(expenses + "\n");
	System.out.println("Expenses are erased!\n");
	} else {
	System.out.println("Please try again");
	}
	optionsSelection();
	break;
	case 4:
	sortExpenses(expenses);
	optionsSelection();
	break;
	case 5:
	searchExpenses(expenses);
	optionsSelection();
	break;
	case 6:
	closeApp();
	break;
	default:
	System.out.println("You have made an invalid choice!");
	break;
	}
	}
	}

	}

	private static void closeApp() {
	System.out.println("Closing your application");
	}

	private static void searchExpenses(ArrayList<Integer> arrayList) {
	//int leng = arrayList.size();
	System.out.println("Enter the expense you need to search:\t");
	//Collections.sort(arrayList);
	Scanner scanner = new Scanner(System.in);
	int expense = scanner.nextInt();

	int result = Collections.binarySearch(arrayList, expense);
	            System.out.println("Search result= " + result);  

	}

	private static void sortExpenses(ArrayList<Integer> arrayList) {
	int arrlength = arrayList.size();


	System.out.println(arrayList);


	}
	}


