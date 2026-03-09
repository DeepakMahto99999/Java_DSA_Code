import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principle amount:");
        float p = sc.nextFloat();

        System.out.println("Enter rate of interest  %");
        float r =sc.nextFloat();

        System.out.println("Enter time duration of the loan");
        float t =sc.nextFloat();

        float interest = (p*t*r)/100;

        System.out.println("principle: "+p);
        System.out.println("Rate: "+r);
        System.out.println("Time: "+t);

        System.out.println("The simple Interest is :"+ interest);
    }
}
