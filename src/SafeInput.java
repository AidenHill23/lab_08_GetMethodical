import java.util.Scanner;

public class SafeInput {
    /**
     *
     * Get a non zero length string from the user
     *
     * @param pipe   - Scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter
     * @return - a non empty string
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = " ";
        do {

            System.out.print(prompt);
            retString = pipe.nextLine();
            if (retString.isEmpty()) {
                System.out.println("You must enter at least one character ");
            }
        } while (retString.isEmpty());
        return retString;
    }

    /**
     * Get an int from the user
     *
     * @param pipe   - Scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter
     * @return - any integer
     */

    public static int getInt(Scanner pipe, String prompt) {

        int retInt = 0;
        String trash = " ";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println(trash);
            }
        } while (!done);
        return retInt;
    }

    /**
     * Get an Double from the user
     *
     * @param pipe   - Scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter
     * @return - any integer
     */

    public static double getDouble(Scanner pipe, String prompt) {

        double retDbl = 0;
        String trash = " ";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retDbl = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println(trash);
            }
        } while (!done);
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

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = 0;
        String trash = " ";
        boolean done = false;
        do {
            System.out.print(prompt);
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();

                if (retVal < low || retVal > high) {
                    System.out.println("Your input is out of range. ");
                } else {
                    done = true;
                }
            } else {
                trash = pipe.nextLine();
                System.out.println(trash);
            }


        } while (!done);
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

    public static double getRangedDbl(Scanner pipe, String prompt, Double low, Double high) {
        Double retVal = 0.0;
        String trash = " ";
        boolean done = false;
        do {
            System.out.print(prompt);
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();

                if (retVal < low || retVal > high) {
                    System.out.println("Your input is out of range. ");
                } else {
                    done = true;
                }
            } else {
                trash = pipe.nextLine();
                System.out.println(trash);
            }


        } while (!done);
        return retVal;
    }

    /**
     *
     * @param pipe
     * @param prompt
     * @return
     */

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response;

        do {
            System.out.print(prompt + " Y/N: ");
            response = pipe.nextLine().toUpperCase();

            if (response.equals("Y")) {
                return true;
            } else if (response.equals("N")) {
                return false;
            } else {
                System.out.println("Your response must be Y or N.");
            }
        } while (true);
    }


    /**
     *
     * @param pipe   - scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter and the regex
     * @param regEx  - the regular expression input must match
     * @return - a string thajt matches the provided regular expression
     */

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String retString = " ";
        boolean done = false;

        do {
            System.out.print(prompt + "[ " + regEx + "]: ");
            retString = pipe.nextLine();
            if (retString.matches(regEx)) {
                done = true;
            } else {
                System.out.println("Your input must match the regEx");
            }
        } while (!done);

        return retString;
    }

    public static void prettyHeader(String msg) {
        int totalWidth = 60;
        int msgLength = msg.length();
        int sideStarsCount = (totalWidth - msgLength - 6) / 2;

        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("***");
        for (int i = 0; i < sideStarsCount; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < sideStarsCount; i++) {
            System.out.print(" ");
        }
        if (msgLength % 2 != 0)
        {
            System.out.print(" ");
        }
        System.out.println("***");

        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static double CtoF(double celsius) {
        return (celsius * 9 / 5) + 32;
    }






}







