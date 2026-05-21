class ReportGenerator {

    public void generateReport(Account account) {
        double income = 0;
        double expense = 0;

        for (Transaction t : account.getTransactions()) {
            if (t instanceof Income) {
                income += t.getAmount();
            } else if (t instanceof Expense) {
                expense += t.getAmount();
            }
        }

        System.out.println("\n===== Financial Report =====");
        System.out.println("Total Income  : ₹" + income);
        System.out.println("Total Expense : ₹" + expense);
        System.out.println("Net Savings   : ₹" + account.getBalance());

        System.out.println("\nTransaction History:");
        for (Transaction t : account.getTransactions()) {
            t.display();
        }
    }
}
