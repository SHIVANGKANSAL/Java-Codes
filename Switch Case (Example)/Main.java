// Switch Case Example - Selecting the role.
//Author : Shivang Kansal
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("These are the following Role present : ");
        System.out.println("1 --> Admin");
        System.out.println("2 --> Moderator");
        System.out.println("3 --> Guest");

        System.out.print("Please select your Role : ");

        int role;
        Scanner scanner = new Scanner(System.in);
        role = scanner.nextInt();

        switch (role) {
            case 1:
                System.out.println("You're now an Admin");
                break;

            case 2:
                System.out.println("You're now a Moderator");
                break;

            default:
                System.out.println("You're now a Guest");
        }

    }
}
