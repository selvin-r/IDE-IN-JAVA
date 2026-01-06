package DurgaSoftware.Data_Hiding.Encapsulation;

/*
 * Encapsulation = Data-hiding + Abstraction
 *  1: Security
 * 2: Enhancement == Upgrade or Improvement
 * Software enhancement: Adding new features, improving performance, or fixing usability issues.
 *
 * 3:Maintainability
 * 4:Modularity
 */

public class Encapsulation {
    static void main() {

    }
}

class Account {

    private double balance;


    public double getBalance() {
        return balance;
    }

    public void setBalance(double ammount) {
        this.balance = balance + ammount;
    }
}