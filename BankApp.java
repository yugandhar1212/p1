class BankCustomer {
    String custName;
    String customerId;
    String customerAddress;

    
    public BankCustomer(String custName, String customerId, String customerAddress) {
        this.custName = custName;
        this.customerId = customerId;
        this.customerAddress = customerAddress;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + custName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Address: " + customerAddress);
    }
}

class BankTransaction {
    String accountName; 
    String accountHolderName;
    String accountType;
    String accountNumber;
    double balance;
    
    
    public BankTransaction(String accountName, String accountHolderName, String accountType, String accountNumber, double balance) {
        this.accountName = accountName;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayTransactionInfo() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankCustomer customer = new BankCustomer("Ram", "Ram123", "123 Main Street");
        BankTransaction transaction = new BankTransaction("SBI", "Ram", "Savings", "SB123456789", 1000.50);

        customer.displayCustomerInfo();
        System.out.println();
        transaction.displayTransactionInfo();
}
}
