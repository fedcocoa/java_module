public class BankTest {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(args[0],args[1],Float.valueOf(args[2]));
        System.out.println(myAccount.getBalance());
        myAccount.deposit(20);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(10.2f);
        System.out.println(myAccount.getBalance());

    }
}