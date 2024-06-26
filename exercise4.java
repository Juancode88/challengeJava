import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        char rpt;
        String name;
        int age;
        float height;
        System.out.println("Do you wish the first person?");
        rpt = lea.next().charAt(0);
        while((rpt == 'S')||(rpt == 's')){
            System.out.println("What is the name?:");
            name =lea.next();
            System.out.println("What is the age?:");
            age =lea.nextInt();
            System.out.println("What id the height?");
            height =lea.nextFloat();
            if(age >= 18){
                if(height > 1.80){
                    System.out.println(name+"comply the conditions");
                }
                else{
                    System.out.println("");
                }
            }
            else{
                
            }
            System.out.println("Do you wish to other person register?");
            rpt = lea.next().charAt(0);

            lea.close(); 
        }
    }
}

