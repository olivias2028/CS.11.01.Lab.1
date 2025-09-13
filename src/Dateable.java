import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        System.out.println("What is your age?"); //Prompt users to enter their age
        Scanner scanner = new Scanner(System.in); //Create a scanner that receives user inputs
        int age = scanner.nextInt(); //Assign the value scanned into integer box named "age"
        if (age<0) { //Removes invalid inputs such as being over 100 years old or under 0
            System.out.println("Invalid Input!");
            System.exit(0);
        }
        else
        {
            age = age/2 +7; //Calculate
            System.out.println("The youngest you should date is a " + age + " year old."); //Print output
    }
}}