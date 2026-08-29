import java.util.Scanner;

class GradeCalc{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("=====Student Grade Calculator=====\n");
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter Math grade: ");
        double MathGrade = input.nextDouble();

        System.out.print("Enter Science grade: ");
        double ScienceGrade = input.nextDouble();

        System.out.print("Enter Programming grade: ");
        double ProgrammingGrade = input.nextDouble();

        double average = (MathGrade + ScienceGrade + ProgrammingGrade) / 3;

        String status;

        if (average >= 75){
            status = "PASSED";
        } else {
            status = "FAILED";
        }

        System.out.println("\n====== RESULT ======");
        System.out.println("Student: " + name);
        System.out.println("Math: " + MathGrade);
        System.out.println("Science: " + ScienceGrade);
        System.out.println("Programming: " + ProgrammingGrade);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Status: " + status);

        input.close();
    }
}

