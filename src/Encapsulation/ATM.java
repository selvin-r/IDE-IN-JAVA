package Encapsulation;

public class ATM {

    public static void main(String[] args) {

        Account a = new Account();
        a.setBalance(10000);
        System.out.println(a.getBalance());
    }
}

    class Account
    {

        private double balance;



        public void setBalance(double amount)
        {

            if(amount >0)
            {
                balance=amount;
            } else
            {
                System.out.println("Ivalide Amount ::>>");
            }
        }

        public double getBalance()
        {
            return balance;
        }

    }

