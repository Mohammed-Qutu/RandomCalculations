/*Mohammed Qutu
2/9/24
Practice with methods
*/


import java.util.Scanner;
public class RandomCalculations 
{
    public static void main (String[] args) 
    {
        //System.out.println(Calculations.generateRandomNumber(500, 300));
        Scanner input = new Scanner(System.in);
        System.out.println("Eould you like to add, subtract, multiply "
                + "or divide");
        String choice= input.next();
        System.out.println("Pick an integer: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int r1 = Calculations.generateRandomNumber(n1, n2);
        int r2 = Calculations.generateRandomNumber(n1, n2);
        switch(choice)
        {
            case"add":
                System.out.println(r1 + "+" + r2 + "=" + Calculations.add(r1,r2));
                break;
            case"subtract":
                System.out.println(r1 + "-" + r2 + "=" + Calculations.subtract(r1,r2));
                break;
            case"multiply":
                System.out.println(r1 + "*" + r2 + "=" + Calculations.multiply(r1,r2));
                break;
            case"divide":
                System.out.println(r1 + "/" + r2 + "=" + Calculations.divide(r1,r2));
                break;
            default:
                System.out.println("INVALIDmultiply"
                        + "");
        }
    }
}
