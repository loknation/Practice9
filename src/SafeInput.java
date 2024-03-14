import java.util.Scanner;

public class SafeInput
{
    public static String getNonZeroLenString(Scanner scanner, String prompt)
    {
        String temp = "";
        do {
            System.out.printf(prompt);

            temp = scanner.nextLine();
        } while (temp.length() == 0);

        return temp;
    }

    private static void bar(String message)
    {
        int length = 60 - message.length() % 2;
        for (int i = 0; i < length; ++i)
        {
            System.out.printf("*");
        }
        System.out.println("");
    }

    public static void prettyHeader(String message)
    {
        int length = 60 - message.length() % 2;

        bar(message);

        System.out.printf("***");

        int middle = length - 6;
        int spaces = (middle - message.length()) / 2;

        for (int i = 0; i < spaces; ++i)
        {
            System.out.printf(" ");
        }

        System.out.printf(message);

        for (int i = 0; i < spaces; ++i)
        {
            System.out.printf(" ");
        }

        System.out.println("***");
        bar(message);
    }

    public static void header(Scanner scanner)
    {
        prettyHeader(getNonZeroLenString(scanner, "What is your message: "));
    }
}