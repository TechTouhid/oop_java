import java.util.Scanner;

public class Reading_user_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Make the scanner function

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();  // Input validation
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // Exception handel

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2020 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " and you are " + age + " years old.");
                scanner.close();
            } else {
                System.out.println("Invalid year of birth! ");
            }
        } else {
            System.out.println("Unable to parse year of birth!!");
        }
    }
}
