import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int num = 1;
        while (num <= 5) {
            System.out.println(num + " Cesde");
            num++;
        }

        /* Define variables */
        String name_product;
        char line;
        int amoun_product, N;
        float price_um, gross_value, iva_value = 0, net_worth;

        System.out.println("Welcome to the backrest sold");
        System.out.println("What is the sold amount?:");
        N = lea.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Enter the name product");
            name_product = lea.next();
            System.out.println("Enter the product line of the " + name_product + " (A,F,V,E)");
            line = lea.next().charAt(0);
            /* A->4 A->19 A->15 A->22 */
            System.out.println("What is the unitary price?:");
            price_um = lea.nextFloat();
            System.out.println("What is the product amount?:");
            amoun_product = lea.nextInt();
            gross_value = amoun_product * price_um;
            switch (line) {
                case 'A':
                case 'a':
                    iva_value = gross_value * 4 / 100;
                    break;
                case 'F':
                case 'f':
                    iva_value = gross_value * 19 / 100;
                    break;
                case 'V':
                case 'v':
                    iva_value = gross_value* 15 / 100;
                    break;
                case 'E':
                case 'e':
                    iva_value = gross_value * 22 / 100;
                    break;
                default:
                    System.out.println("Error in the line");
            }
            net_worth = gross_value+ iva_value;
            System.out.println("The check out the register:");
            System.out.println("The brute value sold: " + gross_value);
            System.out.println("The iva value sold: " + iva_value);
            System.out.println("The neto value for total sold: " + net_worth);
            System.out.println("");
            System.out.println("***********");
            System.out.println("");
            lea.close();
        }
    }
}