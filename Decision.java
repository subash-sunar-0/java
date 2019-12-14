import java.util.Scanner;
public class Decision
{
    public static void main(String[] args) {
        EvenOdd();
    
    }

    public static void EvenOdd(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        if (number % 2 ==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }

    }
}