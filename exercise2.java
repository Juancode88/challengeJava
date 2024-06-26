import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        String employeer_name;
        float num_hour,salary_gross,bonus,reductions,salary_net,salary_basi_hour;
        System.out.println("Welcome at algoritm caculater the employeer's salary");
        System.out.println("Enter the employeer's name:");
        employeer_name= lea.next();
        System.out.println("Enter the worked hour:");
        num_hour = lea.nextFloat();
        System.out.println("Enter the basic salary hour:");
        salary_basi_hour = lea.nextFloat();
        if(num_hour <= 48){
            bonus=20000;
        }
        else if(num_hour > 48 && num_hour <=58){
            bonus=50000;
        }
        else{
            bonus=100000;
        }
        if(salary_basi_hour < 5000){
            reductions = 10000;
        }
        else if(salary_basi_hour > 5000 && salary_basi_hour < 8000 ){
            reductions = 20000;
        }
        else{
            reductions = 50000;
            lea.close();
        }
        salary_gross = num_hour*salary_basi_hour;
        salary_net = salary_gross+bonus-reductions;
        System.out.println("*********Settlement********");
        System.out.println("The employeer name:"+employeer_name);
        System.out.println("The brute salary:..$"+salary_gross);
        System.out.println("The bonus:..$"+bonus);
        System.out.println("The reductins:..$"+reductions);
        System.out.println("The neto salary:..$"+salary_net);
    }   
}
