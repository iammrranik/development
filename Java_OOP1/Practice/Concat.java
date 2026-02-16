import java.util.Scanner;

public class Concat{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter 2nd string: ");
        String secondString = scanner.nextLine();

        String concatenatedString = firstString + secondString;
        System.out.println("Concatenated string: " + concatenatedString);
    }
}