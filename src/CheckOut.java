import java.util.Scanner;
public class CheckOut
{
    public static void main(String[] args)
    {
        double totalPriceOfItem;
        double priceOfItem;
        String items;
        Scanner in = new Scanner(System.in);
        System.out.println("Do you have any items Y/N? ");
        items = in.nextLine();
        do
        {
            priceOfItem = SafeInput.getRangedDbl(in, "What is the price of your item?", .50, 10.0);
            totalPriceOfItem = priceOfItem + priceOfItem;
            System.out.println("Do you have any other items?");
            items = in.nextLine();
        }while(items.equalsIgnoreCase("n"));
        System.out.printf("Your total price of items is " + totalPriceOfItem);






    }
}