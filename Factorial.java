import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: "); 
        double num = input.nextDouble();

        double i=1,fact = 1;
        while(i<=num){
            fact = fact*i;
            i++;
        }
        System.out.println("The factorial is " + fact);
    }
}