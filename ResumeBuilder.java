import java.util.Scanner;
public class ResumeBuilder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you full name : ");
        String name = sc.nextLine();
        System.out.print("Enter you email Address : ");
        String email = sc.nextLine();
        System.out.print("Enter your phone number : ");
        String phone = sc.nextLine();
        System.out.print("Enter your address : ");
        String address = sc.nextLine();
        System.out.print("Enter your professional title : ");
        String title = sc.nextLine();
        System.out.print("Enter your summary statement : ");
        String summary = sc.nextLine();
        System.out.println("\n Resume");
        System.out.println("_____________________________");
        System.out.println("Name     : " + name);
        System.out.println("Email    : " + email);
        System.out.println("Phone    : " + phone);
        System.out.println("Address  : " + address);
        System.out.println("_____________________________");
        System.out.println("Professional Title  : " + title);
        System.out.println("Summary : " + summary);
    }
}