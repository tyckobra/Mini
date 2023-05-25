import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;


public class Miniräknare {
    public static void main(String[] args) {

        int numbers;

        Scanner n = new Scanner(System.in);

        System.out.println("Hur många nummer?");{
            //for (numbers = 0; numbers == Integer.parseInt(n.next()); numbers++) {
                numbers = n.nextInt();
                System.out.println(numbers + " antal nummer");
        }

        System.out.println("Vilka nummer?");
        int nu;
            for (nu = 0; nu < numbers; nu++ ) {
                n.nextInt();
            }

        String tecken;

        Scanner teckenscan = new Scanner(System.in);

        System.out.println("Välj tecken");
        tecken = teckenscan.next();

        if (tecken.equals("+"))
        {
            System.out.println();
        }
       /*else if (tecken.equals("-")) {
            System.out.println(number1 + "-" + number2 + "=" + (number1 - number2));
        } else if (tecken.equals("*")) {
            System.out.println(number1 + "*" + number2 + "=" + (number1 * number2));
        } else if (tecken.equals("/")) {
            System.out.println(number1 + "/" + number2 + "=" + (number1 / number2));
        }
         */
    }
}
