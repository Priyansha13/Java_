interface BankingInterface{
    double getBalance(); //abstract method
    double getInterestRate(); // abstract method 
}

class BankA implements BankingInterface{
    private double balance;

    public BankA(double initialDeposit){
        this.balance = initialDeposit;
    }
    @Override
    public double getBalance(){
        return balance;
    }

    @Override
    public double getInterestRate(){
        return 0.07;
    }
}

class BankB implements BankingInterface {
    private double balance;

    public BankB(double initialDeposit) {
        this.balance = initialDeposit;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double getInterestRate() {
        return 0.074; 
    }
}


class BankC implements BankingInterface {
    private double balance;

    public BankC(double initialDeposit) {
        this.balance = initialDeposit;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double getInterestRate() {
        return 0.079; 
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Deposit amounts into banks A, B, and C
        BankA bankA = new BankA(10000);
        BankB bankB = new BankB(150000);
        BankC bankC = new BankC(200000);

        // Invoke methods
        System.out.println("Bank A Balance: " + bankA.getBalance());
        System.out.println("Bank A Interest Rate: " + bankA.getInterestRate());

        System.out.println("Bank B Balance: " + bankB.getBalance());
        System.out.println("Bank B Interest Rate: " + bankB.getInterestRate());

        System.out.println("Bank C Balance: " + bankC.getBalance());
        System.out.println("Bank C Interest Rate: " + bankC.getInterestRate());
    }
}
