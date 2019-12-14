import java.util.Scanner;
public class Calc{
    public static void main(String[] args) {
        
    
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = input.nextInt();

        System.out.println("Please second number");
        int b = input.nextInt();

        System.out.println("Please select an option");
        System.out.println("'+' for addition");
        System.out.println("'-' for subtraction");
        System.out.println("'/' for division");
        System.out.println("'*' for multiplication");

        char c =input.next().charAt(0);

        switch(c){
            case '+':
            int sum  = a+b;
            System.out.println("The sum is"+ sum);
            break;

            case '-':
            int sub = a-b;
            System.out.println("The subtraction is "+ sub);
            break;


            case '/':
            float div = a/b;
            System.out.println("The division is"+ div);
            break;
            case '*':
            int multi = a*b;
            System.out.println("The multiplication is "+ multi);
            break;
            default:
            System.out.println("enter valid option");
            break;





        }
    }







}