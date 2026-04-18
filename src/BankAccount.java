import java.io.IOException;

public class BankAccount {
    public String accountHolder;
    public int accountNumber;
    public double balance;

    public BankAccount() {
    }

    public BankAccount(String accountHolder, int accNo, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accNo;
        this.balance = balance;
    }
       public boolean validateAccount(int accNo){
        return this. accountNumber==accNo;
    }

    public void deposit(double amount)throws InvalidDepositException{

        if(amount<=49){
            throw new InvalidDepositException("you can not deposit an amount less than or equals to 49");
        }else{
            balance+=amount;
            System.out.println("successful deposit");
            System.out.println("New Balance : "+balance);

        }
    }
    public void withdraw(double amount)throws InsufficientFundsException{
        if(amount>balance){
            throw new InsufficientFundsException("the amount is more than the balance :" +amount);
        }else{
            balance -=amount;
            System.out.println("withdraw successfully");
        }
    }
    public void checkBalance(){
        System.out.println("current Balance : "+ balance);
    }
    public String toString(){
        return "Account Holder : "+accountHolder+ ", Account Number : "+accountNumber+ ", Current Balance :" +balance;
    }
}

