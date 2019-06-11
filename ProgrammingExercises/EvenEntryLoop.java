import java.util.Scanner;

public class EvenEntryLoop
{
    public static void main(String[] args)
    {
        int aNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: > ");
        aNumber = input.nextInt();

        while (aNumber != 999)
        {
            if (aNumber % 2 == 0)
            {
                System.out.println("Good Job!");
            }
            else System.out.println("Error.");

            System.out.print("Enter a number: > ");
            aNumber = input.nextInt();
        }
    }
}
