import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        char pause;
        int op, op_2;
        double number_1, number_2, pot, multi, div, add, sut;

        do {
            System.out.println("************Menu**********");
            System.out.println("   1.Potency");
            System.out.println("   2.Multiplication");
            System.out.println("   3.Division");
            System.out.println("   4.Addition");
            System.out.println("   5.Subtraction");
            System.out.println("   6.Get out");
            System.out.println("Enter the option");
            op = lea.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Potency");
                    System.out.println("Enter the potency");
                    number_1 = lea.nextDouble();
                    System.out.println("Enter the base");
                    number_2 = lea.nextDouble();
                    pot = Math.pow(number_2, number_1);
                    System.out.println(number_2 + " ELEVATE TO " + number_1 + " is equal " + pot);
                    System.out.println("Enter any character and press enter to return to main menu");
                    lea.next(); // Consume the newline left-over
                    pause = lea.next().charAt(0);
                    break;
                case 2:
                    System.out.println("Multiplication");
                    System.out.println("Enter the first number");
                    number_1 = lea.nextDouble();
                    System.out.println("Enter the second number");
                    number_2 = lea.nextDouble();
                    multi = number_1 * number_2;
                    System.out.println("The result is:" + multi);
                    System.out.println("Enter any character and press enter to return to main menu");
                    lea.next(); // Consume the newline left-over
                    pause = lea.next().charAt(0);
                    break;
                case 3:
                    System.out.println("Division");
                    System.out.println("Enter the first number");
                    number_1 = lea.nextDouble();
                    System.out.println("Enter the second number");
                    number_2 = lea.nextDouble();
                    System.out.println("What is the operation way : 1. number 1/ number 2 or number 2 / number 1");
                    op_2 = lea.nextInt();
                    switch (op_2) {
                        case 1:
                            div = number_1 / number_2;
                            System.out.println("The result is:" + div);
                            System.out.println("Enter any character and press enter to return to main menu");
                            lea.next(); // Consume the newline left-over
                            pause = lea.next().charAt(0);
                            break;
                        case 2:
                            div = number_2 / number_1;
                            System.out.println("The result is:" + div);
                            System.out.println("Enter any character and press enter to return to main menu");
                            lea.next(); // Consume the newline left-over
                            pause = lea.next().charAt(0);
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Addition");
                    System.out.println("Enter the first number");
                    number_1 = lea.nextDouble();
                    System.out.println("Enter the second number");
                    number_2 = lea.nextDouble();
                    add = number_1 + number_2;
                    System.out.println("The result is:" + add);
                    System.out.println("Enter any character and press enter to return to main menu");
                    lea.next(); // Consume the newline left-over
                    pause = lea.next().charAt(0);
                    break;
                case 5:
                    System.out.println("Subtraction");
                    System.out.println("Enter the first number");
                    number_1 = lea.nextDouble();
                    System.out.println("Enter the second number");
                    number_2 = lea.nextDouble();
                    sut = number_1 - number_2;
                    System.out.println("The result is:" + sut);
                    System.out.println("Enter any character and press enter to return to main menu");
                    lea.next(); // Consume the newline left-over
                    pause = lea.next().charAt(0);
                    break;
                default:
                    System.out.println("ErrorValue");
                    break;
             } 
        } while (op != 6);
        lea.close();
    }
}

