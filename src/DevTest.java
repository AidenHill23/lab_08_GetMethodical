import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //test getNonZeroLengthString
        String name = getNonZeroLenString(in, "Enter your name: ");
        System.out.println("Hello, " + name + "!");

        // 2nd test for library
        String name2 = SafeInput.getNonZeroLenString(in, "Enter your name: ");
        System.out.println("Hello, " + name + "!");
    }

    /**
     *
     * Get a non zero length string from the user
     * @param pipe - Scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter
     * @return - a non empty string
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = " ";
        do
        {

            System.out.print(prompt);
            retString = pipe.nextLine();
            if(retString.isEmpty())
            {
                System.out.println("You must enter at least one character ");
            }
        }while(retString.isEmpty());
        return retString;
    }
}
