import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        String name;
        char estate;
        int nc,N;
        System.out.println("Enter the student's amount:");
        N= lea.nextInt();
        float vc, vrbto, des = 0, res = 0, vrnto;
        for (int i = 1; i <= N; i++) {
        System.out.println("Enter the name student"+ i +":");
        name = lea.next(); // Corrected line to read the name input

        System.out.println("Enter the economical state for " + name + " (1/2/3/4/5/6):");
        estate = lea.next().charAt(0);

        System.out.println("Credits:");
        nc = lea.nextInt();

        System.out.println("Credit value: $");
        vc = lea.nextFloat();

        vrbto = nc * vc;

        switch (estate) {
            case '1':
                des = 0;
                res = vrbto * 40 / 100;
                break;
            case '2':
                des = 0;
                res = vrbto * 30 / 100;
                break;
            case '3':
            case '4':
                des = 0;
                res = vrbto * 10 / 100;
                break;
            case '5':
                des = 0;
                res = vrbto * 20 / 100;
                break;
            case '6':
                des = 0;
                res = vrbto * 40 / 100;
                break;
            default:
                System.out.println("The economical state entered is invalid");
                break;
        }

        vrnto = vrbto + res - des;
        System.out.println("The payment value for the enrollment by " + name + " is $" + vrnto);

        lea.close(); // Closing the Scanner object
        }

    }
}
