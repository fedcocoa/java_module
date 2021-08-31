public class BankAccount {
    private String holderName;
    private float balance;
    private String number;

    public BankAccount(String newName, String newNumber) {
        holderName = newName;
        number = newNumber;
    }

    public BankAccount(String newName, String newNumber, float newBalance) {
        holderName = newName;
        number = newNumber;
        balance = newBalance;
    }

    public String getName() {
        return holderName;
    }

    public void setName(String newName) {
        holderName = newName;
    }

    public void deposit(float amount) {
        if(amount>=0) {
            balance+=amount;
        }
    }
    
    public void withdraw(float amount) {
        if(amount>=0) {
            balance-=amount;
        }
    }

    public float getBalance() {
        return balance;
    }
}