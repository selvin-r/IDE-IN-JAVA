package BankApplication;

import java.util.Scanner;

public class BankMain {
   public  static void main(String [] args) {


//        BankAccount b = new BankAccount("Selvin ","3278272982ff",38.4);



//        b.Deposit(9324.040);
//        b.CheckBalance();
//        b.Withdraw(444);
//        b.CheckBalance();
//
//       System.out.println("Get Account Number ::>>" +b.GetAccountNumber());
//       System.out.println("Get Balance ::>>" +b.GetBalance());
//       System.out.println("Get Name ::>>"+b.GetName());
//
//        Scanner scan = new Scanner(System.in);


       BankService b = new BankService();
       Scanner scan = new Scanner(System.in);

       System.out.println("Wel come to Darling Bank ::>> ");


       int mainChoice;

       do
       {

           System.out.println("\n1 Create Account ::>>");
           System.out.println("2 Acces Account ::>>");
           System.out.println("3 Exite ::>>");
           System.out.println("Enter Your Chioce");
           mainChoice = scan.nextInt();


           switch (mainChoice)
           {
               case 1:
                   b.CreateAccount();
                   break;
               case 2:
                   b.Operate();
                   break;
               case 3:
                   System.out.println(" Thanks for using Darling Bank ::>>");
                   break;
               default:
                   System.out.println("  Invalid choice  Try again ::>> ");
           }

       } while (mainChoice != 3);
   }

}
