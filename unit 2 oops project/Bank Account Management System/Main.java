import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the account number:");
        String a = sc.nextLine();

        System.out.println("Enter the account holder's name:");
        String b = sc.nextLine();

        System.out.println("Enter the initial balance:");
        double c = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter the account type:");
        String d = sc.nextLine();

        System.out.println("Enter the branch name:");
        String e = sc.nextLine();

        System.out.println("Enter the IFSC code:");
        String f = sc.nextLine();

        System.out.println("Enter the mobile number:");
        String g = sc.nextLine();

        BankAccount p = new BankAccount();

        p.setAccountNumber(a);
        p.setHolderName(b);
        p.setBalance(c);
        p.setAccountType(d);
        p.setBranchName(e);
        p.setIfscCode(f);
        p.setMobileNumber(g);

        p.display();

        System.out.println("\nEnter deposit amount:");
        double amount = sc.nextDouble();
        p.deposit(amount);

        System.out.println("\nEnter withdrawal amount:");
        double amount1 = sc.nextDouble();
        p.withdraw(amount1);

        p.display();

        sc.close();
    }
}