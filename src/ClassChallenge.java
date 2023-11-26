public class ClassChallenge {
    public static void main(String[] args) {
        BankAccount joeAccount = new BankAccount("12345",500, "Joe",
                "joe@email.com","0892294937");
        System.out.println(joeAccount.toString());

        double deposit = -30;
        System.out.println("Deposit: " + deposit + " to account");
        joeAccount.deposit(deposit);
        System.out.println(joeAccount.toString());

        double withdraw = -540;
        System.out.println("Withdraw: " + withdraw + " from account");
        joeAccount.withdraw(withdraw);
        System.out.println(joeAccount.toString());
    }
}

class BankAccount{
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + this.customerName + ", Account Num: " + this.accountNumber + ", Balance: " + this.accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double fund){
        if (fund < 0) {
            System.out.println("Fund to deposit must >= 0");
            return;
        }
        this.accountBalance += fund;
    }

    public void withdraw(double fund){
        if (fund < 0){
            System.out.println("Fund to withdraw must >= 0");
            return;
        }
        if (fund > this.accountBalance) {
            System.out.println("Your balance is lesser than fund to withdraw");
            return;
        }
        this.accountBalance -= fund;
    }
}
