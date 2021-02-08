package dl.iitu.kz;

public class Account implements  BankService {
    String username;
    String pincode;
    double balance;


    public Account(String username, String pincode, double balance) {
        this.username = username;
        this.pincode = pincode;
         this.balance = balance;
    }

    public Account(){}



    @Override
    public void deposit(double amount) {
        this.setBalance(this.getBalance() + amount);


    }

    @Override
    public void withdraw(double amount) {
        if(amount <= this.getBalance()) {
            this.setBalance(this.getBalance() - amount);
        }
        else {
            System.out.println("Error");
        }
    }

    @Override
    public double Balance() {
        return balance;
    }

    @Override
    public void info() {
        System.out.println("Username: " + this.getUsername());
        System.out.println("Balance: " + this.getBalance());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
