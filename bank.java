import java.util.Scanner;

public class bank{

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[]args){
        
        double balance = 0;
        boolean exit = true;

        while(exit){
            System.out.println("\n-------------------------------------");
            System.out.println("-----------BANKING PROGRAM-----------");
            System.out.println("-------------------------------------");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("-------------------------------------");
            System.out.print("Enter your choice(1-4): ");
            int choice = input.nextInt();
            System.out.println("-------------------------------------");
            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += depositMoney();
                case 3 -> balance -= withdrawMoney(balance); 
                case 4 -> exit = false;
                default -> System.out.println("Invalid Choice");
            }
       
        }

        System.out.println("===============PROGRAM ENDED===============");
        System.out.println("----------------Goodspeed🍀----------------");

        input.close();

    }

    static void showBalance(double balance){

        System.out.printf("Your available balance is $%.2f", balance);

    }

    static double depositMoney(){

        System.out.print("Enter the amount you want to deposit: ");
        double deposit = input.nextDouble();

        if(deposit <= 0){
            System.out.println("Amount can't be less than or equal zero.");
            return 0;
        }

        return deposit;
        
    }

    static double withdrawMoney(double balance){

        System.out.print("Enter the amount of money you want to withdraw: ");
        double withdraw = input.nextDouble();

        if(withdraw <= 0){
            System.out.print("The amount should not be equal or less than zero.");
            return 0;
        } else if(balance < withdraw){
            System.out.println("Your balance is not enough.");
            return 0;
        } else{
            return withdraw;
        }

    }

}
