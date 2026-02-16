import java.util.Scanner;
public class Email{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter an email address: ");
        String emailAddress = scanner.nextLine();
        int tmp=0;
        if(emailAddress.indexOf("@")!=-1 && emailAddress.indexOf(".")!=-1){
            tmp=1;
        }
        if(tmp==1){
            System.out.println("Valid email address.");
        }else{
            System.out.println("Invalid email address.");
        }
    }
}