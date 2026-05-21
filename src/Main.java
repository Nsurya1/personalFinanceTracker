//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void displayMenu() {
        System.out.println("\n===== Personal Finance Tracker =====");
        System.out.println("1. Add Income");
        System.out.println("2. Add Expense");
        System.out.println("3. View Report");
        System.out.println("4. Exit");
        System.out.print("Enter choice: ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        ReportGenerator report = new ReportGenerator();

        while (true) {
            displayMenu();
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter amount: ");
                        double incAmount = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter category: ");
                        String incCategory = sc.nextLine();

                        System.out.print("Enter date (YYYY-MM-DD): ");
                        String incDate = sc.nextLine();

                        account.addTransaction(new Income(incAmount, incCategory, incDate));
                        System.out.println("Income added successfully!");
                        break;

                    case 2:
                        System.out.print("Enter amount: ");
                        double expAmount = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter category: ");
                        String expCategory = sc.nextLine();

                        System.out.print("Enter date (YYYY-MM-DD): ");
                        String expDate = sc.nextLine();

                        account.addTransaction(new Expense(expAmount, expCategory, expDate));
                        System.out.println("Expense added successfully!");
                        break;

                    case 3:
                        report.generateReport(account);
                        break;

                    case 4:
                        System.out.println("Exiting... Thank you!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}