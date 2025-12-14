package BankApplication;

public class BankAccount
{
    private String name;
    private  double balance;
    private String accountNumber;

    public BankAccount(String name,String accountNumber,double balance)
    {

        this.name=name;
        this.balance= this.balance;
        this.accountNumber=accountNumber;
    }


    public void Deposit(double amount)
    {

        if(amount > 0)
        {
            balance +=amount;
            System.out.println("Deposit Amount ::>>>" +amount);
        } else
        {
            System.out.println("Invalide Deposit Amount ::>>> ");
        }
    }

    public void Withdraw(double amount)
    {
        if(amount <=balance && amount > 0)
        {
           balance -=amount;
            System.out.println("Withdraw Amount ::>> "+amount);
        } else
        {
            System.out.println("Balance Are Invalide ::>> ");
        }
    }


    public void CheckBalance()
    {
        System.out.println("Current Balance ::>>" +balance);
    }

    public String GetAccountNumber()
    {
        return accountNumber;
    }

    public String GetName()
    {
        return name;
    }

    public  double GetBalance()
    {
        return balance;
    }
}


// package BankApplication;
//
//public class BankAccount
//{
//    private String name;
//    private  double balance;
//    private String accountNumber;
//
//    public BankAccount(String name,String accountNumber,double balance)
//    {
//
//        this.name=name;
//        this.balance= this.balance;
//        this.accountNumber=accountNumber;
//    }
//
//
//    public void Deposit(double amount)
//    {
//
//        if(amount > 0)
//        {
//            balance +=amount;
//            System.out.println("Deposit Amount ::>>>" +amount);
//        } else
//        {
//            System.out.println("Invalide Deposit Amount ::>>> ");
//        }
//    }
//
//    public void Withdraw(double amount)
//    {
//        if(amount <=balance && amount > 0)
//        {
//           balance -=amount;
//            System.out.println("Withdraw Amount ::>> "+amount);
//        } else
//        {
//            System.out.println("Balance Are Invalide ::>> ");
//        }
//    }
//
//
//    public void CheckBalance()
//    {
//        System.out.println("Current Balance ::>>" +balance);
//    }
//
//    public String GetAccountNumber()
//    {
//        return accountNumber;
//    }
//
//    public String GetName()
//    {
//        return name;
//    }
//
//    public  double GetBalance()
//    {
//        return balance;
//    }
//}

package BankApplication;

public class BankAccount
{
    private String name;
    private  double balance;
    private String accountNumber;

    public BankAccount(String name,String accountNumber,double balance)
    {

        this.name=name;
        this.balance= this.balance;
        this.accountNumber=accountNumber;
    }


    public void Deposit(double amount)
    {

        if(amount > 0)
        {
            balance +=amount;
            System.out.println("Deposit Amount ::>>>" +amount);
        } else
        {
            System.out.println("Invalide Deposit Amount ::>>> ");
        }
    }

    public void Withdraw(double amount)
    {
        if(amount <=balance && amount > 0)
        {
            balance -=amount;
            System.out.println("Withdraw Amount ::>> "+amount);
        } else
        {
            System.out.println("Balance Are Invalide ::>> ");
        }
    }


    public void CheckBalance()
    {
        System.out.println("Current Balance ::>>" +balance);
    }

    public String GetAccountNumber()
    {
        return accountNumber;
    }

    public String GetName()
    {
        return name;
    }

    public  double GetBalance()
    {
        return balance;
    }
}



package BankApplication;

public class BankAccount
{
    private String name;
    private  double balance;
    private String accountNumber;

    public BankAccount(String name,String accountNumber,double balance)
    {

        this.name=name;
        this.balance= this.balance;
        this.accountNumber=accountNumber;
    }


    public void Deposit(double amount)
    {

        if(amount > 0)
        {
            balance +=amount;
            System.out.println("Deposit Amount ::>>>" +amount);
        } else
        {
            System.out.println("Invalide Deposit Amount ::>>> ");
        }
    }

    public void Withdraw(double amount)
    {
        if(amount <=balance && amount > 0)
        {
            balance -=amount;
            System.out.println("Withdraw Amount ::>> "+amount);
        } else
        {
            System.out.println("Balance Are Invalide ::>> ");
        }
    }


    public void CheckBalance()
    {
        System.out.println("Current Balance ::>>" +balance);
    }

    public String GetAccountNumber()
    {
        return accountNumber;
    }

    public String GetName()
    {
        return name;
    }

    public  double GetBalance()
    {
        return balance;
    }
}



package BankApplication;

public class BankAccount
{
    private String name;
    private  double balance;
    private String accountNumber;

    public BankAccount(String name,String accountNumber,double balance)
    {

        this.name=name;
        this.balance= this.balance;
        this.accountNumber=accountNumber;
    }


    public void Deposit(double amount)
    {

        if(amount > 0)
        {
            balance +=amount;
            System.out.println("Deposit Amount ::>>>" +amount);
        } else
        {
            System.out.println("Invalide Deposit Amount ::>>> ");
        }
    }

    public void Withdraw(double amount)
    {
        if(amount <=balance && amount > 0)
        {
            balance -=amount;
            System.out.println("Withdraw Amount ::>> "+amount);
        } else
        {
            System.out.println("Balance Are Invalide ::>> ");
        }
    }


    public void CheckBalance()
    {
        System.out.println("Current Balance ::>>" +balance);
    }

    public String GetAccountNumber()
    {
        return accountNumber;
    }

    public String GetName()
    {
        return name;
    }

    public  double GetBalance()
    {
        return balance;
    }
}



package BankApplication;

public class BankAccount
{
    private String name;
    private  double balance;
    private String accountNumber;

    public BankAccount(String name,String accountNumber,double balance)
    {

        this.name=name;
        this.balance= this.balance;
        this.accountNumber=accountNumber;
    }


    public void Deposit(double amount)
    {

        if(amount > 0)
        {
            balance +=amount;
            System.out.println("Deposit Amount ::>>>" +amount);
        } else
        {
            System.out.println("Invalide Deposit Amount ::>>> ");
        }
    }

    public void Withdraw(double amount)
    {
        if(amount <=balance && amount > 0)
        {
            balance -=amount;
            System.out.println("Withdraw Amount ::>> "+amount);
        } else
        {
            System.out.println("Balance Are Invalide ::>> ");
        }
    }


    public void CheckBalance()
    {
        System.out.println("Current Balance ::>>" +balance);
    }

    public String GetAccountNumber()
    {
        return accountNumber;
    }

    public String GetName()
    {
        return name;
    }

    public  double GetBalance()
    {
        return balance;
    }
}



package BankApplication;

public class BankAccount
{
    private String name;
    private  double balance;
    private String accountNumber;

    public BankAccount(String name,String accountNumber,double balance)
    {

        this.name=name;
        this.balance= this.balance;
        this.accountNumber=accountNumber;
    }


    public void Deposit(double amount)
    {

        if(amount > 0)
        {
            balance +=amount;
            System.out.println("Deposit Amount ::>>>" +amount);
        } else
        {
            System.out.println("Invalide Deposit Amount ::>>> ");
        }
    }

    public void Withdraw(double amount)
    {
        if(amount <=balance && amount > 0)
        {
            balance -=amount;
            System.out.println("Withdraw Amount ::>> "+amount);
        } else
        {
            System.out.println("Balance Are Invalide ::>> ");
        }
    }


    public void CheckBalance()
    {
        System.out.println("Current Balance ::>>" +balance);
    }

    public String GetAccountNumber()
    {
        return accountNumber;
    }

    public String GetName()
    {
        return name;
    }

    public  double GetBalance()
    {
        return balance;
    }
}
