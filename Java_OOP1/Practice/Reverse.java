import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Reversed string: ");
        for (int i=inputString.length()-1; i >= 0; i--) {
            System.out.print(inputString.charAt(i));
        }
    }
}