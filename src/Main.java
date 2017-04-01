import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int reverSal = 0; // All variables are initialized

        System.out.println("Enter an integer:");
        j = scnr.nextInt();
        for (i = j; i != 0; i = i /10)
        // Passing the original number into i, assuming it doesn't equal 0, it will divide itself by 10
        // after each loop
        {
            reverSal = (reverSal * 10) + (i % 10);
            // dividing any number by modulus 10 will take the remainder from the ones place of the number
            // that number is stored in reverSal, when i is sent back through the loop, i = i/10 takes the ones
            // place number and discards it, since it was already stored in reversal.
            // Going back into the loop body, the one-place number we go from the first iteration is
            // multiplied by 10, adding a 0 to it. the zero serves as a place holder for the next ones-position
            // number.
            // This loop stops one the original value has nothing but 0 left.
        }

        System.out.print(reverSal); // Print the reversed number

        return;

    }
}