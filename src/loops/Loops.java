/*Brendan abbey
 * April 26th 2022
 * Loops
 * and open the template in the editor.
 */
package loops;
import java.util.Scanner;
/**
 *
 * @author brabb5577
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int a = 1;
        while (a!=4)
        {
        System.out.println("Which of the following would you like to do?");
        System.out.println("1. Find the number of a squared value");
        System.out.println("2. Find a value of a cubed value");
        System.out.println("3. Find a value of a number, to any power");
        System.out.println("4. Exit");
        a = scan.nextInt();
        if (a==4)
        {
            System.out.println("Goodbye");
        }
        else if (a == 1)
        {
            System.out.println("Please enter the number you would like to square:");
            int square = scan.nextInt();
            for (int i = 1;i<2;i++)
            {
                square*=square;
            }
            System.out.println(square);
        }
        else if (a==2)
        {
            System.out.println("Please enter the number you would like to cube:");
            int b = scan.nextInt();
            int extra = b;
            for (int i = 1;i<3;i++)
            {
                b = b*extra;
            }
            System.out.println(b);
        }
        else 
        {
            System.out.println("Please enter the base:");
            int c = scan.nextInt();
            System.out.println("Please enter the exponent:");
            int d = scan.nextInt();
            int bread = c;
            for (int i = 1; i<d; i++)
            {
                c = c*bread;
            }
            System.out.println(c);
        }
        }
   }   
}
