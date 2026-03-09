import java.util.Scanner;

public class CountDecimalDigit
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a floating number
        System.out.print("Enter a floating number: ");
        double number = scanner.nextDouble();

        // Convert the number to a string
        String numberString = Double.toString(number);

        // Check if the number contains a decimal point
        if (numberString.contains("."))
        {
            // Split the number string at the decimal point
            String[] parts = numberString.split("\\.");

            // Count the digits after the decimal point
            int count = parts[1].length();
            int count2 =parts[0].length();
            int count3 = count +count2;

            System.out.println("Number of digits after the decimal point: " + count);
            System.out.println("Number of digits before the decimal point: " + count2);
            System.out.println("Total number: " + count3);
        }

    }


}

