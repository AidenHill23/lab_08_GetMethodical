import java.util.Scanner;

public class GetUserName
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = " ";
        firstName = SafeInput.getNonZeroLenString(in,"Enter your first name: ");
        String lastName = " ";
        lastName = SafeInput.getNonZeroLenString(in,"Enter your last name: ");

        System.out.println("Your full name is : " + firstName +  " " + lastName);
    }
}
