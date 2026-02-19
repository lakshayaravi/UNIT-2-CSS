public class BankAccount {

    private String accountNumber;
    private String holderName;
    private double balance;
    private String accountType;

    private String branchName;
    private String ifscCode;
    private String mobileNumber;

    // Setters
    public void setAccountNumber(String a) {
        this.accountNumber = a;
    }

    public void setHolderName(String b) {
        this.holderName = b;
    }

    public void setBalance(double c) {
        this.balance = c;
    }

    public void setAccountType(String d) {
        this.accountType = d;
    }

    public void setBranchName(String e) {
        this.branchName = e;
    }

    public void setIfscCode(String f) {
        this.ifscCode = f;
    }

    public void setMobileNumber(String g) {
        this.mobileNumber = g;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void display() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder Name: " + getHolderName());
        System.out.println("Account Type: " + getAccountType());
        System.out.println("Branch Name: " + getBranchName());
        System.out.println("IFSC Code: " + getIfscCode());
        System.out.println("Mobile Number: " + getMobileNumber());
        System.out.printf("Balance: %.1f\n", getBalance());
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Transaction");
        } else {
            balance += amount;
            System.out.printf("Deposit Successful. Updated Balance: %.1f\n", balance);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid Transaction");
        } else {
            balance -= amount;
            System.out.printf("Withdrawal Successful. Updated Balance: %.1f\n", balance);
        }
    }
}