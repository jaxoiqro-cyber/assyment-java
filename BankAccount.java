public class BankAccount {
    private String accountNumber;
    private String customerName;
    private double balance;

    public BankAccount(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void display() {
        System.out.println(accountNumber);
        System.out.println(customerName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount("A001", "iqra", 1000);
        BankAccount a2 = new BankAccount("A002", "asma|", 1500);

        a1.display();
        a2.display();

        a1.setBalance(1200);

        System.out.println("New Balance: " + a1.getBalance());
    }
}
