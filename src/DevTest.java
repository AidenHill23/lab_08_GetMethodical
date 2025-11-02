import java.util.Scanner;

/**
 * Devtest class to test input methods
 * @authoer Aiden Hill hill5ad
 */

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
/*
        //test getNonZeroLengthString
        String name = getNonZeroLenString(in, "Enter your name: ");
        System.out.println("Hello, " + name + "!");

        // 2nd test for library
        String name2 = SafeInput.getNonZeroLenString(in, "Enter your name: ");
        System.out.println("Hello, " + name + "!");

        String email = SafeInput.getRegExString(in, "Enter your email address", "^\\w+@\\w+$");
        System.out.println("Enter your email address: " + email);

        int test = getInt(in,"Enter a int: ");
        System.out.println(test);
        int test2 = SafeInput.getInt(in,"Enter a int for safe input ");
        System.out.print(test2);

        Double d = getDouble(in, "Enter a double value: ");
        System.out.println("Your salary is: " + d );
        Double dd = SafeInput.getDouble(in, "Enter a double value ");
        System.out.println("Your salary is: " + dd );

        int favNum = getRangedInt(in, "Enter your favorite number: ", 1, 10);
        int secondFav = SafeInput.getRangedInt(in,"Enter your second favorite number: ", 1, 10);

        double price = getRangedDbl(in, "Enter your price: ", .01, 10.1);
        System.out.println("Your price is: " + price );
        double price2 = SafeInput.getRangedDbl(in, "Enter your price: ", .01, 10.1);
        System.out.println("Your price is: " + price2);

        boolean confirm = getYNConfirm(in, "Do you want to contine: ");
        System.out.println("User confirmation " + confirm);

        boolean confirm2 = SafeInput.getYNConfirm(in, "Do you want to contine: ");
        System.out.println("User confirmation " + confirm);
*/

        String mNumberPattern = "^(M|m)\\d{5}$";
        String mNumber = getRegExString(in, "Enter your UC Student M number (format: MXXXXX)", mNumberPattern);
        System.out.println("Valid M number entered: " + mNumber);

        // Get menu choice
        String menuPattern = "^[OoSsVvQq]$";
        String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice (O/S/V/Q)", menuPattern);
        System.out.println("Valid menu choice entered: " + menuChoice);

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

    /**
     * Get an int from the user
     * @param pipe - Scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter
     * @return - any integer
     */

    public static int getInt(Scanner pipe, String prompt)
    {

        int retInt = 0;
        String trash = " ";
        boolean done = false;

        do
        {
         System.out.print(prompt);
         if (pipe.hasNextInt())
         {
             retInt = pipe.nextInt();
             pipe.nextLine();
             done = true;
         }
         else
         {
             trash = pipe.nextLine();
             System.out.println(trash);
         }
        }while(!done);
        return retInt;
    }


    /**
     * Get an Double from the user
     * @param pipe - Scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter
     * @return - any integer
     */

    public static double getDouble(Scanner pipe, String prompt)
    {

        double retDbl = 0;
        String trash = " ";
        boolean done = false;

        do
        {
            System.out.print(prompt);
            if (pipe.hasNextDouble())
            {
                retDbl = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println(trash);
            }
        }while(!done);
        return retDbl;
    }

    /**
     *
     * @param pipe
     * @param prompt
     * @param low
     * @param high
     * @return
     */

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = " ";
        boolean done = false;
        do
        {
            System.out.print(prompt);
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();

                if(retVal < low || retVal > high)
                {
                    System.out.println("Your input is out of range. ");
                }
                else
                {
                    done = true;
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println(trash);
            }


        }while(!done);
        return retVal;
    }
    /**
     *
     * @param pipe
     * @param prompt
     * @param low
     * @param high
     * @return
     */

    public static double getRangedDbl(Scanner pipe, String prompt, Double low, Double high)
    {
        Double retVal = 0.0;
        String trash = " ";
        boolean done = false;
        do
        {
            System.out.print(prompt);
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();

                if(retVal < low || retVal > high)
                {
                    System.out.println("Your input is out of range. ");
                }
                else
                {
                    done = true;
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println(trash);
            }


        }while(!done);
        return retVal;
    }

    /**
     *
     * @param pipe
     * @param prompt
     * @return
     */

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String response = " ";
        boolean retVal = false;
        boolean done = false;

        do
        {
            System.out.print(prompt + " Y/N: ");
            response = pipe.nextLine().toUpperCase();
            if(response.equals("Y"))
            {
                retVal = true;
                done = true;
            }
            else if (response.equals("N"))
            {
                retVal = false;
                done = true;
            }
            else{
                System.out.println("Your response must be Y or N ");
            }
        }while (!done);
        return retVal;
    }

    /**
     *
     * @param pipe - scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter and the regex
     * @param regEx - the regular expression input must match
     * @return - a string thajt matches the provided regular expression
     */

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retString = " ";
        boolean done = false;

        do
        {
            System.out.print(prompt + "[ "+regEx + "]: ");
            retString = pipe.nextLine();
            if (retString.matches(regEx))
            {
                done = true;
            }
            else
            {
                System.out.println("Your input must match the regEx");
            }
        }while(!done);

        return retString;
    }
}


