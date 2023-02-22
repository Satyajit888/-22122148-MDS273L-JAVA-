import java.util.*;
class LAB4 {
    static int acc_num;
    static String holder_nm;
    static float acc_balance;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String trans_main,summary_main;
        float dep,withdraw;
        System.out.println("Welcome to the Bank Account program!");
        
        // Initialize the customer
        System.out.print("Enter account number: ");
        int acc_no = sc.nextInt();
        System.out.print("Enter account holder name: ");
        String name = sc.next();
        System.out.print("Enter initial balance: ");
        float bal = sc.nextFloat();
        System.out.println("Enter the money you want to deposit: ");
        dep=sc.nextFloat();
        System.out.println("Enter the money you want to withdraw: ");
        withdraw=sc.nextFloat();
        details(acc_no,name,bal);

        
        // Display the menu
        int choice = 0;
        do {
            System.out.println("Main Menu:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Print transactions");
            System.out.println("4. Print account summary");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = sc.nextDouble();
                    withdraw(withdraw);
                    break;
                case 3:
                    trans();
                    break;
                case 4:
                    summary();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
        sc.close();
    }
    public static void details(int acc_no,String name,float bal){
        acc_num=acc_no;
        holder_nm=name;
        acc_balance=bal;
        System.out.println("Details initialized with account number of "+acc_num+"and initial balance of "+acc_balance);
    }
    public static void deposit(float dep){
        acc_balance=+dep;
        System.out.println("Successfully deposited amount :"+dep+",therefore new balance is now:"+acc_balance);
    }
    public static void withdraw(float withdraw){
        if (withdraw <= acc_balance) {
            acc_balance -= withdraw;
            System.out.println("Successfully withdrew " + withdraw + " from the account. New balance is " + acc_balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
    public static void trans(){
        System.out.println("No transaction to display");        
    }
    public static void summary(){
        System.out.println("Account Number: " + acc_num);
        System.out.println("Account Holder Name: " + holder_nm);
        System.out.println("Account Balance: " + acc_balance);

    }
    
}