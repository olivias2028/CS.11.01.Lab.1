import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        System.out.println("What is your age?"); //Prompt users to enter their age
        Scanner scanner = new Scanner(System.in); //Create a scanner that receives user inputs
        int age = scanner.nextInt(); //Assign the value scanned into integer box named "age"
        if (age>100 || age<0) { //Removes invalid inputs such as being over 100 years old or under 0
            System.out.println("Invalid Input!");
            System.exit(0);
        }
        else
        {
            age = 100-age; //Calculate
            System.out.println("Before giving up on a book, you should read at least " + age + " pages."); //Print output
        }
    }}
