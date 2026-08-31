import java.util.Scanner;

public class stud{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        String headTitle = "STUDENT INFORMATION";

        header(headTitle);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter your course: ");
        String course = input.nextLine();

        System.out.print("Enter your level: ");
        String level = input.nextLine();

        headerTwo();

        studentInfo(name, age, course, level);

        taskHeader();

        System.out.print("Task: ");
        String task = input.nextLine();

        studTaskPrio();

        System.out.print("Choose: ");
        int choose = input.nextInt();

        studPrio(task, choose);

        input.close();

    }

    static void header(String headTitle){
        System.out.println("================================\n");
        System.out.printf("       %s       \n", headTitle);
        System.out.println("\n================================\n");
    }
    static void headerTwo(){
        System.out.println();
        System.out.println("------- INFORMATION -------\n");
    }
    static void studentInfo(String name, int age, String course, String level){
        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Course: %s\n", course);
        System.out.printf("Year Level: %s\n", level);
    }
    static void taskHeader(){
        System.out.println();
        System.out.println("------- STUDENT TASK MANAGER -------\n");
    }
    static void studTaskPrio(){
        System.out.println();
        System.out.println("Select priority: ");
        System.out.println("1. High");
        System.out.println("2. Medium");
        System.out.println("3. Low");
        System.out.println();
    } 
    static void studPrio(String task, int choose){

        System.out.println();

        if(choose == 1){
            System.out.printf("Task: %s\n", task);
            System.out.println("Priority: HIGH");
        } else if(choose == 2){
            System.out.printf("Task: %s\n", task);
            System.out.println("Priority: MEDIUM");
        } else if(choose == 3){
            System.out.printf("Task: %s\n", task);
            System.out.println("Priority: LOW");
        }
    }
}