import java.util.Scanner;
class BankAccount{
    public double balance;
    public BankAccount(double initializedBalance){
        this.balance = initializedBalance;
    }
    public double checkBalance(){
        return balance;
    }
    public void depositAmount(double amount){
        balance += amount;
    }
    public boolean withDraw(double amount){
        if(amount < balance){
            balance -= amount;
            return  true;
        }else{
            return false;
        }
    }
    
}
public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account=new BankAccount(10000.00);
        System.out.println("Welcome to the ATM");
        System.out.println("1. Deposit Amount");
        System.out.println("2. Check Balance");
        System.out.println("3. Withdraw Amount");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                depositAmount(scanner, account);
                break;
            case 2:
                checkBalance(scanner, account);
                break;
            case 3: 
                withdrawAmount(scanner, account);
                break;
            default:
                System.out.println("Invalid Choice!!!");
                break;
        }
        scanner.close();
    }
    private static void depositAmount(Scanner scanner, BankAccount account){
        System.out.println("Enter amount to deposit");
        double amount = scanner.nextInt();
        if(amount > 0){
            account.depositAmount(amount);
            System.out.println("Your cash is successfully deposited");
        System.out.println("your balanace amount is: " + account.checkBalance());
        }else{
            System.out.println("Insufficient amount");
        }
    }
    private static void checkBalance(Scanner scanner, BankAccount account){
        System.out.println("Your total balance is: "+ account.checkBalance());
    }
    private static void withdrawAmount(Scanner scanner, BankAccount account){
        System.out.println("Enter amount to withdraw");
        double amount = scanner.nextInt();
        if(amount > 0){
            if(account.withDraw(amount)){
                System.out.println("Your remaining balance is: " + account.checkBalance());
            }else{
                System.out.println("Insufficient balance");
            }
        }else{
            System.out.println("Enter a positive number");
        }
    }
}
