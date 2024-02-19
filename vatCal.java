import java.util.Scanner;

public class vatCal {
    public static void main(String[] args) {
        double price, vatPercentage1 = 0.18, vat, withVAT, vatPercentage2 = 0.08 ;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the price : ");
        price = input.nextDouble();

        if (price >= 1000) {
            vat = price * vatPercentage2;
            withVAT = price + vat;

            System.out.println("Without VAT : " + price );
            System.out.println("VAT percentage : " + vatPercentage2 );
            System.out.println("VAT : " + vat );
            System.out.println("With VAT: " + withVAT);
        } else {

            vat = price * vatPercentage1;
            withVAT = price + vat;

            System.out.println("Without VAT : " + price );
            System.out.println("VAT percentage : " + vatPercentage1 );
            System.out.println("VAT : " + vat );
            System.out.println("With VAT: " + withVAT);

        }

    }
}

