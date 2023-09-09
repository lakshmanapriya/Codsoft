import java.sql.SQLOutput;
import java.util.Scanner;
class ATMmachine{
    public static void main(String[] args ) {
        int balance = 100000, withdraw, deposit;
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the account Id: ");
        String AccountHolder = object.nextLine();
        int pin = 44455;
        System.out.println("Enter the pin number: ");
        int pin_No = object.nextInt();
        if (pin_No != 44455) {
            System.out.println("Wrong pin Number");
        }
        if (pin_No == 44455) {
            while (true) {
                System.out.println("** WELCOME****");
                System.out.println("choose 1 for Withdraw");
                System.out.println("choose 2 for Deposit");
                System.out.println("choose 3 for check balance");
                System.out.println("check 4 to transfer money");
                System.out.println("choose 5 to  Quit");
                System.out.println("choose the operation you want to perform: ");
                int choice = object.nextInt();
                System.out.println("-------------------------------");
                switch (choice) {
                    case 1:
                        System.out.println("Account Holder Name: " + AccountHolder);
                        System.out.println("enter money to be withdrawn: ");
                        withdraw = object.nextInt();
                        if (balance >= withdraw) {
                            balance = balance - withdraw;
                            System.out.println("Please collect your money");
                            System.out.println("Your Balance is " + balance);
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                        System.out.println("");
                        break;

                    case 2:
                        System.out.println("Account Holder Name: " + AccountHolder);
                        System.out.println("Balance : " + balance);
                        deposit = object.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your Money has been successfully deposited");
                        System.out.println("Your Balance is " + balance);

                        break;
                    case 3:
                        System.out.println("Account Holder Name: " + AccountHolder);
                        System.out.println("Balance : " + balance);
                        System.out.println("");
                        break;

                    case 4:
                        System.out.println("Account Holder Name: " + AccountHolder);
                        System.out.println("Enter the amount to Transfer: ");
                        int TransferAmount = object.nextInt();
                        balance = TransferAmount;
                        System.out.println("TransferAmount is done Succefully ");
                        System.out.println("Available balance: " + balance);
                    case 5:
                        System.exit(0);
                }
            }
        }

    }
}


