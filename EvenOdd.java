//Checking whether the input number is even or odd
import java.util.Scanner;

class EvenOdd{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("===== Even / Odd Checker =====");

        System.out.print("Enter a number: ");
        int Num = input.nextInt();

        if(Num % 2 == 0){
            System.out.println("The number is even.");
        } else if(Num % 2 != 0){
            System.out.println("The number is odd.");
        } else {
            System.out.println("Enter a valid number.");
        }

        input.close();

    }
}