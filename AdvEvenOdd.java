//Advance version of even/odd that uses for loop 

import java.util.Scanner;

class AdvEvenOdd{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        
        System.out.println("-----------------Advance Even/Odd Checker-----------------\n");

        System.out.print("How many number do you want to check? ");
        int numCheck = input.nextInt();
        System.out.println();

        for(int i=1; i <= numCheck; i++){
            System.out.print("Enter a number " + i + ": ");
            int Num = input.nextInt();

            if(Num % 2 == 0){
                System.out.println(Num + " is even.\n");
                evenCount++;
            } else {
                System.out.println(Num + " is odd.\n");
                oddCount++;
            }

            if(Num < 0){
                negative++;
            } else if (Num > 0){
                positive++;
            } else {
                zero++;
            }
        }

        System.out.println("===== Cutie Results =====\n");
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);

        input.close();
    }
}
