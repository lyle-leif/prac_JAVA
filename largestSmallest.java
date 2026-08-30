//Challenge asking an input then identifying what is the largest number and the lowest number

import java.util.Scanner;

class largestSmallest{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("-------------------------Largest number & Lowest number checker-------------------------\n");
        System.out.print("How many numbers: ");
        int num = input.nextInt();

        System.out.print("\nEnter number 1: ");
        int num1 = input.nextInt();

        int largest = num1;
        int smallest = num1;

        for(int i =2; i <= num; i++){
            System.out.print("Enter number " + i + " : ");
            int x = input.nextInt();
            
            if(x > largest){
                largest = x;
            }
            if(x < smallest){
                smallest = x;
            }
        }

        System.out.println("\n-------------------Result-------------------\n");
        System.out.println("The largest number is " + largest);
        System.out.print("The smallest number is " + smallest);
        input.close();
    }
}