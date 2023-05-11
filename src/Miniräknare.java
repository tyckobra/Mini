import java.util.Scanner;

public class Miniräknare {
    public static void main(String[] args) {

        String tecken;
        int numbers;

        System.out.println("Hur många nummer?");
        {
            Scanner number = new Scanner(System.in);
            for (numbers = 0; numbers == Integer.parseInt(number.next()); numbers++)
            {
                System.out.println(number + " nummer");
                numbers = number.nextInt();
            }
        }

        /*
        System.out.println("Andra nummret");
        number2 = number.nextInt();
        */

        Scanner teckenscan = new Scanner(System.in);

        System.out.println("Välj tecken");
        tecken = teckenscan.next();

        /*
       if (tecken.equals("+"))
        {
            System.out.println(n + "+" + n + "=" + (n + n));
        } else if (tecken.equals("-")) {
            System.out.println(number1 + "-" + number2 + "=" + (number1 - number2));
        } else if (tecken.equals("*")) {
            System.out.println(number1 + "*" + number2 + "=" + (number1 * number2));
        } else if (tecken.equals("/")) {
            System.out.println(number1 + "/" + number2 + "=" + (number1 / number2));
        }
         */
    }
}
