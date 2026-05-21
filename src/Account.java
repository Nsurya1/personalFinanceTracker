import java.util.*;

class Account {
    private double balance;
    private List<Transaction> transactions;

    public Account() {
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transaction.apply(this); // polymorphism
        transactions.add(transaction);
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    // Only internal update allowed (encapsulation)
    protected void updateBalance(double amount) {
        this.balance += amount;
    }
}