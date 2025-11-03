public class MVC {
    static void main() {

    }
}


abstract class Account {
    String bankname;
    int accNo;
    double balance;

    Account(String bankname,int accNo,double balance){
            this.bankname=bankname;
            this.accNo=accNo;
            this.balance=balance;
    }

    void deposit(double amount) {

        balance += amount;
        System.out.println(amount + "Deposit Current Balance " + balance);
    }
    void withdraw(double amount){

        if(amount <=balance){
            balance -=amount;
            System.out.println(amount + " Withdraw Remaining Balance :" +balance);
        } else {
            System.out.println(" Insufficient balance!");
        }

    }

    static class SavingsAccount extends Account {

        SavingsAccount(String bankname, int accNo, double balance) {
            super(bankname, accNo, balance);
        }
    }

    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Interest for Savings Account: " + interest);
    }
}


class CurrentAccount extends Account {
    CurrentAccount(String name, int accNo, double balance) {
        super(name, accNo, balance);
    }


    void calculateInterest() {
        System.out.println("No interest for Current Account.");
    }
}

class Bank {
    private String bankName = "Darling Bank ";

    public String getBankName() {
        return bankName;
    }
}


 class BankAccount {
    public static void main(String[] args) {

        Bank bank = new Bank();
        System.out.println(" Welcome to " + bank.getBankName());


        Account a1 = new Account.SavingsAccount("Darling", 1001, 5000);
        Account a2 = new CurrentAccount("Zoho", 2001, 10000);


        a1.deposit(2000);
        a1.calculateInterest();

        System.out.println("---------------");

        a2.withdraw(1500);
        a2.calculateInterest();
    }
}

