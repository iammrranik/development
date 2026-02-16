import java.util.Scanner;
public class Buffer{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer();
        System.out.print("Enter 1st string: ");
        String input=scanner.nextLine();
        String s1=input;
        stringBuffer.append(s1);
        System.out.print("Enter 2nd string: ");
        String s2=scanner.nextLine();
        stringBuffer.append(s2);
        System.out.println("Concatenated string: " + stringBuffer.toString());
    }
}
