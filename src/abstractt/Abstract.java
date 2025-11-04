package abstractt;


abstract class Bank
{

    abstract void interestRate();

    void welcomeMessage()
    {
        System.out.println(" Welcome to Selvin Banking System!");
    }
}


class SelvinBank extends Bank {
    void interestRate() {
        System.out.println("SelvinBank Interest Rate: 7.5%");
    }
}


class Account
{
    private String accountHolder;
    private double balance;


    public void setAccountDetails(String name, double amount)
    {
        if (amount > 0)
        {
            accountHolder = name;
            balance = amount;
        } else
        {
            System.out.println(" Invalid amount!");
        }
    }


    public void showAccountDetails()
    {
        System.out.println("Account Holder " + accountHolder);
        System.out.println(" Balance " + balance);
    }
}

public class Abstract
{
    static void main()
    {
      Bank b = new SelvinBank();
      b.welcomeMessage();
      b.interestRate();

      Account a = new Account();
      a.setAccountDetails("Selvin",238884948);
      a.showAccountDetails();

    }
}
