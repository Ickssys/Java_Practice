import java.util.*;

public class Mortgage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("This program computes monthly mortgage payments.");
        //prompt
        System.out.print("Loan amount: ");
        double loan = console.nextDouble();

        System.out.print("Enter down payment %: ");
        double downPayment = console.nextDouble()/100.0;
        loan = loan - (downPayment * loan);  

        //prompt
        System.out.print("Number of years: ");
        int years = console.nextInt();

        //prompt
        System.out.print("Interest rate: ");
        double rate = console.nextDouble();
        System.out.println();

        //This is the heart of the program here - calculations 
        int n = 12 * years; 
        double c = rate / 12.0 / 100.0;
        double payment = loan * c * Math.pow(1 + c, n)/(Math.pow(1 + c, n) - 1);
        System.out.println("Payment = $" + (int) payment);
    }    
}
