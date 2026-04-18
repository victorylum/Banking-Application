import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void LogTraction(){

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount account=new BankAccount("Lum",685753349,500000);
        account=new BankAccount("Joy", 943357586,300000);
        int choice;
        while(true){
            System.out.println("Welcome to Tigha Bank");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.println("Choose an option : ");
            choice= sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1 :
                    System.out.println("Enter your account number :");
                    int enterAccNO= sc.nextInt();
                    if(account.validateAccount(enterAccNO)) {

                        try {
                            System.out.println("Welcome "+ account.accountHolder);
                            sc.nextLine();
                            System.out.println("Enter Amount");
                            double depositAmount = sc.nextDouble();
                            account.deposit(depositAmount);

                        } catch (InvalidDepositException e) {
                            System.out.println(e.getMessage());
                        }


                    }else {
                        System.out.println("Invalid Account Number");

                    }
                    break;
                case 2:
                    System.out.println("Enter your account number :");
                    int enterAccNUm= sc.nextInt();
                    if(account.validateAccount(enterAccNUm)) {
                        try {
                            System.out.println("Welcome "+ account.accountHolder);
                            sc.nextLine();
                            System.out.println("Enter Amount");
                            double withdrawAmount = sc.nextDouble();
                            account.withdraw(withdrawAmount);
                        } catch (InsufficientFundsException e) {
                            System.out.println("Invalid input :" + e.getMessage());
                        }
                    }else{
                        System.out.println("Invalid Account Number");

                }
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("thanks for using are service");
                    return;
                default:
                    System.out.println("Please choose any of the options provided");

            }
        }
    }
}