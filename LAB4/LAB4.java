import java.util.Scanner;

class BankAccount {
    static String accountNumber;
    static String accountHolderName;
    static double accountBalance;
    static String transactions;

    public BankAccount(String accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.transactions = "";
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            transactions += "Deposit: " + amount + "\n";
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && accountBalance >= amount) {
            accountBalance -= amount;
            transactions += "Withdrawal: " + amount + "\n";
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid amount or insufficient balance. Withdrawal failed.");
        }
    }

    public void printTransactions() {
        System.out.println("Transaction history:");
        System.out.println(transactions);
    }

    public void printSummary() {
        System.out.println("Account summary:");
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Account balance: " + accountBalance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Enter account balance: ");
        double accountBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(accountNumber, accountHolderName, accountBalance);

        int choice = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Print transactions");
            System.out.println("4. Print account summary");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.printTransactions();
                    break;
                case 4:
                    account.printSummary();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }
}
