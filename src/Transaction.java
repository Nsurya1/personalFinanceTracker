abstract class Transaction {
    protected double amount;
    protected String category;
    protected String date;

    public Transaction(double amount, String category, String date) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getDate() {
        return date;
    }

    public abstract void apply(Account account);

    public void display() {
        System.out.println(date + " | " + category + " | ₹" + amount);
    }
}