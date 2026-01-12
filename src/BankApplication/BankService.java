package BankApplication;

import java.util.Scanner;


public class BankService
{
   private BankAccount account;
   private Scanner scan = new Scanner(System.in);


   public void CreateAccount()
   {
       System.out.println("Enter 12 Digit Account Number ::>>");

       String accNo = scan.nextLine();

       System.out.println("Account Holder Name ::>> ");
       String name=scan.nextLine();

       System.out.println("Enter the Initial Deposit Amount ::>>");
       double balance = scan.nextDouble();
       scan.nextLine();

       account = new BankAccount(accNo,name,balance);
       System.out.println("Account Create successfully " + name );

   }

   public void Operate()
   {
       if(account==null)
       {
           System.out.println("Plz Create Account First ::>>");
           return;
       }

       int Choice;

       do
       {
           System.out.println("\n :::::>>>> Wel come "+ account.GetName() + " :::>>>>>");
           System.out.println("1 Deposit Money ::>>");
           System.out.println("2 Withdraw Money ::>>");
           System.out.println("3 Check Balance ::>>");
           System.out.println("4 Show Account Info ::>>");
           System.out.println("5 Exite ::>>");
           Choice=scan.nextInt();


           switch (Choice)
           {
               case 1:
                   System.out.println("Enter the Amount Deposite ::>>");
                   double dep = scan.nextDouble();
                   account.Deposit(dep);
                   break;

               case 2:

                   System.out.println("Enter the Amount WithDraw ::>>");
                   double wit=scan.nextDouble();
                   account.Withdraw(wit);
                   break;

               case 3:
                   account.CheckBalance();
                   break;

               case 4:
                   System.out.println("\n Account Number ::>>" +account.GetAccountNumber());
                   System.out.println(" Account Holder Name ::>>" +account.GetName());
                   System.out.println(" Account Balance ::>>"+account.GetBalance());
                   break;

               case 5:
                   System.out.println("Thank You Visit Again ::>>");
                   break;

               default:
                   System.out.println("Invalide Choice  Plz Try Again ::>>");
           }

       } while (Choice != 5);
   }



}


// Demo


package BankApplication;

import java.util.Scanner;


public class BankService
{
    private BankAccount account;
    private Scanner scan = new Scanner(System.in);


    public void CreateAccount()
    {
        System.out.println("Enter 12 Digit Account Number ::>>");

        String accNo = scan.nextLine();

        System.out.println("Account Holder Name ::>> ");
        String name=scan.nextLine();

        System.out.println("Enter the Initial Deposit Amount ::>>");
        double balance = scan.nextDouble();
        scan.nextLine();

        account = new BankAccount(accNo,name,balance);
        System.out.println("Account Create successfully " + name );

    }

    public void Operate()
    {
        if(account==null)
        {
            System.out.println("Plz Create Account First ::>>");
            return;
        }

        int Choice;

        do
        {
            System.out.println("\n :::::>>>> Wel come "+ account.GetName() + " :::>>>>>");
            System.out.println("1 Deposit Money ::>>");
            System.out.println("2 Withdraw Money ::>>");
            System.out.println("3 Check Balance ::>>");
            System.out.println("4 Show Account Info ::>>");
            System.out.println("5 Exite ::>>");
            Choice=scan.nextInt();


            switch (Choice)
            {
                case 1:
                    System.out.println("Enter the Amount Deposite ::>>");
                    double dep = scan.nextDouble();
                    account.Deposit(dep);
                    break;

                case 2:

                    System.out.println("Enter the Amount WithDraw ::>>");
                    double wit=scan.nextDouble();
                    account.Withdraw(wit);
                    break;

                case 3:
                    account.CheckBalance();
                    break;

                case 4:
                    System.out.println("\n Account Number ::>>" +account.GetAccountNumber());
                    System.out.println(" Account Holder Name ::>>" +account.GetName());
                    System.out.println(" Account Balance ::>>"+account.GetBalance());
                    break;

                case 5:
                    System.out.println("Thank You Visit Again ::>>");
                    break;

                default:
                    System.out.println("Invalide Choice  Plz Try Again ::>>");
            }

        } while (Choice != 5);
    }



}




package BankApplication;

import java.util.Scanner;


public class BankService
{
    private BankAccount account;
    private Scanner scan = new Scanner(System.in);


    public void CreateAccount()
    {
        System.out.println("Enter 12 Digit Account Number ::>>");

        String accNo = scan.nextLine();

        System.out.println("Account Holder Name ::>> ");
        String name=scan.nextLine();

        System.out.println("Enter the Initial Deposit Amount ::>>");
        double balance = scan.nextDouble();
        scan.nextLine();

        account = new BankAccount(accNo,name,balance);
        System.out.println("Account Create successfully " + name );

    }

    public void Operate()
    {
        if(account==null)
        {
            System.out.println("Plz Create Account First ::>>");
            return;
        }

        int Choice;

        do
        {
            System.out.println("\n :::::>>>> Wel come "+ account.GetName() + " :::>>>>>");
            System.out.println("1 Deposit Money ::>>");
            System.out.println("2 Withdraw Money ::>>");
            System.out.println("3 Check Balance ::>>");
            System.out.println("4 Show Account Info ::>>");
            System.out.println("5 Exite ::>>");
            Choice=scan.nextInt();


            switch (Choice)
            {
                case 1:
                    System.out.println("Enter the Amount Deposite ::>>");
                    double dep = scan.nextDouble();
                    account.Deposit(dep);
                    break;

                case 2:

                    System.out.println("Enter the Amount WithDraw ::>>");
                    double wit=scan.nextDouble();
                    account.Withdraw(wit);
                    break;

                case 3:
                    account.CheckBalance();
                    break;

                case 4:
                    System.out.println("\n Account Number ::>>" +account.GetAccountNumber());
                    System.out.println(" Account Holder Name ::>>" +account.GetName());
                    System.out.println(" Account Balance ::>>"+account.GetBalance());
                    break;

                case 5:
                    System.out.println("Thank You Visit Again ::>>");
                    break;

                default:
                    System.out.println("Invalide Choice  Plz Try Again ::>>");
            }

        } while (Choice != 5);
    }



}




package BankApplication;

import java.util.Scanner;


public class BankService
{
    private BankAccount account;
    private Scanner scan = new Scanner(System.in);


    public void CreateAccount()
    {
        System.out.println("Enter 12 Digit Account Number ::>>");

        String accNo = scan.nextLine();

        System.out.println("Account Holder Name ::>> ");
        String name=scan.nextLine();

        System.out.println("Enter the Initial Deposit Amount ::>>");
        double balance = scan.nextDouble();
        scan.nextLine();

        account = new BankAccount(accNo,name,balance);
        System.out.println("Account Create successfully " + name );

    }

    public void Operate()
    {
        if(account==null)
        {
            System.out.println("Plz Create Account First ::>>");
            return;
        }

        int Choice;

        do
        {
            System.out.println("\n :::::>>>> Wel come "+ account.GetName() + " :::>>>>>");
            System.out.println("1 Deposit Money ::>>");
            System.out.println("2 Withdraw Money ::>>");
            System.out.println("3 Check Balance ::>>");
            System.out.println("4 Show Account Info ::>>");
            System.out.println("5 Exite ::>>");
            Choice=scan.nextInt();


            switch (Choice)
            {
                case 1:
                    System.out.println("Enter the Amount Deposite ::>>");
                    double dep = scan.nextDouble();
                    account.Deposit(dep);
                    break;

                case 2:

                    System.out.println("Enter the Amount WithDraw ::>>");
                    double wit=scan.nextDouble();
                    account.Withdraw(wit);
                    break;

                case 3:
                    account.CheckBalance();
                    break;

                case 4:
                    System.out.println("\n Account Number ::>>" +account.GetAccountNumber());
                    System.out.println(" Account Holder Name ::>>" +account.GetName());
                    System.out.println(" Account Balance ::>>"+account.GetBalance());
                    break;

                case 5:
                    System.out.println("Thank You Visit Again ::>>");
                    break;

                default:
                    System.out.println("Invalide Choice  Plz Try Again ::>>");
            }

        } while (Choice != 5);
    }



}




package BankApplication;

import java.util.Scanner;


public class BankService
{
    private BankAccount account;
    private Scanner scan = new Scanner(System.in);


    public void CreateAccount()
    {
        System.out.println("Enter 12 Digit Account Number ::>>");

        String accNo = scan.nextLine();

        System.out.println("Account Holder Name ::>> ");
        String name=scan.nextLine();

        System.out.println("Enter the Initial Deposit Amount ::>>");
        double balance = scan.nextDouble();
        scan.nextLine();

        account = new BankAccount(accNo,name,balance);
        System.out.println("Account Create successfully " + name );

    }

    public void Operate()
    {
        if(account==null)
        {
            System.out.println("Plz Create Account First ::>>");
            return;
        }

        int Choice;

        do
        {
            System.out.println("\n :::::>>>> Wel come "+ account.GetName() + " :::>>>>>");
            System.out.println("1 Deposit Money ::>>");
            System.out.println("2 Withdraw Money ::>>");
            System.out.println("3 Check Balance ::>>");
            System.out.println("4 Show Account Info ::>>");
            System.out.println("5 Exite ::>>");
            Choice=scan.nextInt();


            switch (Choice)
            {
                case 1:
                    System.out.println("Enter the Amount Deposite ::>>");
                    double dep = scan.nextDouble();
                    account.Deposit(dep);
                    break;

                case 2:

                    System.out.println("Enter the Amount WithDraw ::>>");
                    double wit=scan.nextDouble();
                    account.Withdraw(wit);
                    break;

                case 3:
                    account.CheckBalance();
                    break;

                case 4:
                    System.out.println("\n Account Number ::>>" +account.GetAccountNumber());
                    System.out.println(" Account Holder Name ::>>" +account.GetName());
                    System.out.println(" Account Balance ::>>"+account.GetBalance());
                    break;

                case 5:
                    System.out.println("Thank You Visit Again ::>>");
                    break;

                default:
                    System.out.println("Invalide Choice  Plz Try Again ::>>");
            }

        } while (Choice != 5);
    }



}




package BankApplication;

import java.util.Scanner;


public class BankService
{
    private BankAccount account;
    private Scanner scan = new Scanner(System.in);


    public void CreateAccount()
    {
        System.out.println("Enter 12 Digit Account Number ::>>");

        String accNo = scan.nextLine();

        System.out.println("Account Holder Name ::>> ");
        String name=scan.nextLine();

        System.out.println("Enter the Initial Deposit Amount ::>>");
        double balance = scan.nextDouble();
        scan.nextLine();

        account = new BankAccount(accNo,name,balance);
        System.out.println("Account Create successfully " + name );

    }

    public void Operate()
    {
        if(account==null)
        {
            System.out.println("Plz Create Account First ::>>");
            return;
        }

        int Choice;

        do
        {
            System.out.println("\n :::::>>>> Wel come "+ account.GetName() + " :::>>>>>");
            System.out.println("1 Deposit Money ::>>");
            System.out.println("2 Withdraw Money ::>>");
            System.out.println("3 Check Balance ::>>");
            System.out.println("4 Show Account Info ::>>");
            System.out.println("5 Exite ::>>");
            Choice=scan.nextInt();


            switch (Choice)
            {
                case 1:
                    System.out.println("Enter the Amount Deposite ::>>");
                    double dep = scan.nextDouble();
                    account.Deposit(dep);
                    break;

                case 2:

                    System.out.println("Enter the Amount WithDraw ::>>");
                    double wit=scan.nextDouble();
                    account.Withdraw(wit);
                    break;

                case 3:
                    account.CheckBalance();
                    break;

                case 4:
                    System.out.println("\n Account Number ::>>" +account.GetAccountNumber());
                    System.out.println(" Account Holder Name ::>>" +account.GetName());
                    System.out.println(" Account Balance ::>>"+account.GetBalance());
                    break;

                case 5:
                    System.out.println("Thank You Visit Again ::>>");
                    break;

                default:
                    System.out.println("Invalide Choice  Plz Try Again ::>>");
            }

        } while (Choice != 5);
    }



}




package BankApplication;

import java.util.Scanner;


public class BankService
{
    private BankAccount account;
    private Scanner scan = new Scanner(System.in);


    public void CreateAccount()
    {
        System.out.println("Enter 12 Digit Account Number ::>>");

        String accNo = scan.nextLine();

        System.out.println("Account Holder Name ::>> ");
        String name=scan.nextLine();

        System.out.println("Enter the Initial Deposit Amount ::>>");
        double balance = scan.nextDouble();
        scan.nextLine();

        account = new BankAccount(accNo,name,balance);
        System.out.println("Account Create successfully " + name );

    }

    public void Operate()
    {
        if(account==null)
        {
            System.out.println("Plz Create Account First ::>>");
            return;
        }

        int Choice;

        do
        {
            System.out.println("\n :::::>>>> Wel come "+ account.GetName() + " :::>>>>>");
            System.out.println("1 Deposit Money ::>>");
            System.out.println("2 Withdraw Money ::>>");
            System.out.println("3 Check Balance ::>>");
            System.out.println("4 Show Account Info ::>>");
            System.out.println("5 Exite ::>>");
            Choice=scan.nextInt();


            switch (Choice)
            {
                case 1:
                    System.out.println("Enter the Amount Deposite ::>>");
                    double dep = scan.nextDouble();
                    account.Deposit(dep);
                    break;

                case 2:

                    System.out.println("Enter the Amount WithDraw ::>>");
                    double wit=scan.nextDouble();
                    account.Withdraw(wit);
                    break;

                case 3:
                    account.CheckBalance();
                    break;

                case 4:
                    System.out.println("\n Account Number ::>>" +account.GetAccountNumber());
                    System.out.println(" Account Holder Name ::>>" +account.GetName());
                    System.out.println(" Account Balance ::>>"+account.GetBalance());
                    break;

                case 5:
                    System.out.println("Thank You Visit Again ::>>");
                    break;

                default:
                    System.out.println("Invalide Choice  Plz Try Again ::>>");
            }

        } while (Choice != 5);
    }



}




package BankApplication;

import java.util.Scanner;


public class BankService
{
    private BankAccount account;
    private Scanner scan = new Scanner(System.in);


    public void CreateAccount()
    {
        System.out.println("Enter 12 Digit Account Number ::>>");

        String accNo = scan.nextLine();

        System.out.println("Account Holder Name ::>> ");
        String name=scan.nextLine();

        System.out.println("Enter the Initial Deposit Amount ::>>");
        double balance = scan.nextDouble();
        scan.nextLine();

        account = new BankAccount(accNo,name,balance);
        System.out.println("Account Create successfully " + name );

    }

    public void Operate()
    {
        if(account==null)
        {
            System.out.println("Plz Create Account First ::>>");
            return;
        }

        int Choice;

        do
        {
            System.out.println("\n :::::>>>> Wel come "+ account.GetName() + " :::>>>>>");
            System.out.println("1 Deposit Money ::>>");
            System.out.println("2 Withdraw Money ::>>");
            System.out.println("3 Check Balance ::>>");
            System.out.println("4 Show Account Info ::>>");
            System.out.println("5 Exite ::>>");
            Choice=scan.nextInt();


            switch (Choice)
            {
                case 1:
                    System.out.println("Enter the Amount Deposite ::>>");
                    double dep = scan.nextDouble();
                    account.Deposit(dep);
                    break;

                case 2:

                    System.out.println("Enter the Amount WithDraw ::>>");
                    double wit=scan.nextDouble();
                    account.Withdraw(wit);
                    break;

                case 3:
                    account.CheckBalance();
                    break;

                case 4:
                    System.out.println("\n Account Number ::>>" +account.GetAccountNumber());
                    System.out.println(" Account Holder Name ::>>" +account.GetName());
                    System.out.println(" Account Balance ::>>"+account.GetBalance());
                    break;

                case 5:
                    System.out.println("Thank You Visit Again ::>>");
                    break;

                default:
                    System.out.println("Invalide Choice  Plz Try Again ::>>");
            }

        } while (Choice != 5);
    }



}




package BankApplication;

import java.util.Scanner;


public class BankService
{
    private BankAccount account;
    private Scanner scan = new Scanner(System.in);


    public void CreateAccount()
    {
        System.out.println("Enter 12 Digit Account Number ::>>");

        String accNo = scan.nextLine();

        System.out.println("Account Holder Name ::>> ");
        String name=scan.nextLine();

        System.out.println("Enter the Initial Deposit Amount ::>>");
        double balance = scan.nextDouble();
        scan.nextLine();

        account = new BankAccount(accNo,name,balance);
        System.out.println("Account Create successfully " + name );

    }

    public void Operate()
    {
        if(account==null)
        {
            System.out.println("Plz Create Account First ::>>");
            return;
        }

        int Choice;

        do
        {
            System.out.println("\n :::::>>>> Wel come "+ account.GetName() + " :::>>>>>");
            System.out.println("1 Deposit Money ::>>");
            System.out.println("2 Withdraw Money ::>>");
            System.out.println("3 Check Balance ::>>");
            System.out.println("4 Show Account Info ::>>");
            System.out.println("5 Exite ::>>");
            Choice=scan.nextInt();


            switch (Choice)
            {
                case 1:
                    System.out.println("Enter the Amount Deposite ::>>");
                    double dep = scan.nextDouble();
                    account.Deposit(dep);
                    break;

                case 2:

                    System.out.println("Enter the Amount WithDraw ::>>");
                    double wit=scan.nextDouble();
                    account.Withdraw(wit);
                    break;

                case 3:
                    account.CheckBalance();
                    break;

                case 4:
                    System.out.println("\n Account Number ::>>" +account.GetAccountNumber());
                    System.out.println(" Account Holder Name ::>>" +account.GetName());
                    System.out.println(" Account Balance ::>>"+account.GetBalance());
                    break;

                case 5:
                    System.out.println("Thank You Visit Again ::>>");
                    break;

                default:
                    System.out.println("Invalide Choice  Plz Try Again ::>>");
            }

        } while (Choice != 5);
    }



}




package BankApplication;

import java.util.Scanner;


public class BankService
{
    private BankAccount account;
    private Scanner scan = new Scanner(System.in);


    public void CreateAccount()
    {
        System.out.println("Enter 12 Digit Account Number ::>>");

        String accNo = scan.nextLine();

        System.out.println("Account Holder Name ::>> ");
        String name=scan.nextLine();

        System.out.println("Enter the Initial Deposit Amount ::>>");
        double balance = scan.nextDouble();
        scan.nextLine();

        account = new BankAccount(accNo,name,balance);
        System.out.println("Account Create successfully " + name );

    }

    public void Operate()
    {
        if(account==null)
        {
            System.out.println("Plz Create Account First ::>>");
            return;
        }

        int Choice;

        do
        {
            System.out.println("\n :::::>>>> Wel come "+ account.GetName() + " :::>>>>>");
            System.out.println("1 Deposit Money ::>>");
            System.out.println("2 Withdraw Money ::>>");
            System.out.println("3 Check Balance ::>>");
            System.out.println("4 Show Account Info ::>>");
            System.out.println("5 Exite ::>>");
            Choice=scan.nextInt();


            switch (Choice)
            {
                case 1:
                    System.out.println("Enter the Amount Deposite ::>>");
                    double dep = scan.nextDouble();
                    account.Deposit(dep);
                    break;

                case 2:

                    System.out.println("Enter the Amount WithDraw ::>>");
                    double wit=scan.nextDouble();
                    account.Withdraw(wit);
                    break;

                case 3:
                    account.CheckBalance();
                    break;

                case 4:
                    System.out.println("\n Account Number ::>>" +account.GetAccountNumber());
                    System.out.println(" Account Holder Name ::>>" +account.GetName());
                    System.out.println(" Account Balance ::>>"+account.GetBalance());
                    break;

                case 5:
                    System.out.println("Thank You Visit Again ::>>");
                    break;

                default:
                    System.out.println("Invalide Choice  Plz Try Again ::>>");
            }

        } while (Choice != 5);
    }



}




package BankApplication;

import java.util.Scanner;


public class BankService
{
    private BankAccount account;
    private Scanner scan = new Scanner(System.in);


    public void CreateAccount()
    {
        System.out.println("Enter 12 Digit Account Number ::>>");

        String accNo = scan.nextLine();

        System.out.println("Account Holder Name ::>> ");
        String name=scan.nextLine();

        System.out.println("Enter the Initial Deposit Amount ::>>");
        double balance = scan.nextDouble();
        scan.nextLine();

        account = new BankAccount(accNo,name,balance);
        System.out.println("Account Create successfully " + name );

    }

    public void Operate()
    {
        if(account==null)
        {
            System.out.println("Plz Create Account First ::>>");
            return;
        }

        int Choice;

        do
        {
            System.out.println("\n :::::>>>> Wel come "+ account.GetName() + " :::>>>>>");
            System.out.println("1 Deposit Money ::>>");
            System.out.println("2 Withdraw Money ::>>");
            System.out.println("3 Check Balance ::>>");
            System.out.println("4 Show Account Info ::>>");
            System.out.println("5 Exite ::>>");
            Choice=scan.nextInt();


            switch (Choice)
            {
                case 1:
                    System.out.println("Enter the Amount Deposite ::>>");
                    double dep = scan.nextDouble();
                    account.Deposit(dep);
                    break;

                case 2:

                    System.out.println("Enter the Amount WithDraw ::>>");
                    double wit=scan.nextDouble();
                    account.Withdraw(wit);
                    break;

                case 3:
                    account.CheckBalance();
                    break;

                case 4:
                    System.out.println("\n Account Number ::>>" +account.GetAccountNumber());
                    System.out.println(" Account Holder Name ::>>" +account.GetName());
                    System.out.println(" Account Balance ::>>"+account.GetBalance());
                    break;

                case 5:
                    System.out.println("Thank You Visit Again ::>>");
                    break;

                default:
                    System.out.println("Invalide Choice  Plz Try Again ::>>");
            }

        } while (Choice != 5);
    }



}



package BankApplication;

import java.util.Scanner;


public class BankService
{
    private BankAccount account;
    private Scanner scan = new Scanner(System.in);


    public void CreateAccount()
    {
        System.out.println("Enter 12 Digit Account Number ::>>");

        String accNo = scan.nextLine();

        System.out.println("Account Holder Name ::>> ");
        String name=scan.nextLine();

        System.out.println("Enter the Initial Deposit Amount ::>>");
        double balance = scan.nextDouble();
        scan.nextLine();

        account = new BankAccount(accNo,name,balance);
        System.out.println("Account Create successfully " + name );

    }

    public void Operate()
    {
        if(account==null)
        {
            System.out.println("Plz Create Account First ::>>");
            return;
        }

        int Choice;

        do
        {
            System.out.println("\n :::::>>>> Wel come "+ account.GetName() + " :::>>>>>");
            System.out.println("1 Deposit Money ::>>");
            System.out.println("2 Withdraw Money ::>>");
            System.out.println("3 Check Balance ::>>");
            System.out.println("4 Show Account Info ::>>");
            System.out.println("5 Exite ::>>");
            Choice=scan.nextInt();


            switch (Choice)
            {
                case 1:
                    System.out.println("Enter the Amount Deposite ::>>");
                    double dep = scan.nextDouble();
                    account.Deposit(dep);
                    break;

                case 2:

                    System.out.println("Enter the Amount WithDraw ::>>");
                    double wit=scan.nextDouble();
                    account.Withdraw(wit);
                    break;

                case 3:
                    account.CheckBalance();
                    break;

                case 4:
                    System.out.println("\n Account Number ::>>" +account.GetAccountNumber());
                    System.out.println(" Account Holder Name ::>>" +account.GetName());
                    System.out.println(" Account Balance ::>>"+account.GetBalance());
                    break;

                case 5:
                    System.out.println("Thank You Visit Again ::>>");
                    break;

                default:
                    System.out.println("Invalide Choice  Plz Try Again ::>>");
            }

        } while (Choice != 5);
    }



}





