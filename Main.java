import java.util.Scanner;

public class Main
{
    public static boolean isPalindrom(String teks)
    {
        int j = teks.length() - 1;
        int i = 0;

        while (i < j)
        {
            if (teks.charAt(i) != teks.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Teks : ");
        String teks = scan.nextLine();

        String isPalindrom = isPalindrom(teks) ? "Palindrom" : "Bukan Palindrom";

        System.out.println("Output : " + isPalindrom);
        scan.close();
    }
}
