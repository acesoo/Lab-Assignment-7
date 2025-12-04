package Lab7;

public class SavingsAccount implements BankAccount {

    private String accountNumber;
    private String accountName;
    private double balance;

    public void setAccountNumber(int num) {
        this.accountNumber = String.valueOf(num);
    }

    public void setAccountName(String name) {
        this.accountName = name;
    }

    public void setBalance(double bal) {
        this.balance = bal;
    }

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public double getInterestRate() {
        return 0.01;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    @Override
    public double computeBalanceWithInterest() {
        return balance + (balance * getInterestRate());
    }

    @Override
    public String showInfo() {
        return "Account number: " + accountNumber +
               "\nAccount name: " + accountName +
               "\nBalance: " + balance;
    }
}

