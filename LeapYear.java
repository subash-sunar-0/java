import java.util.Scanner;

public class LeapYear{

    public static void main(String[] args) {
        leap();
    }

    public static void leap(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year to check ");
        int year = input.nextInt();
        if (year % 400==0){
            System.out.println("leap year");

        }
        else if(year % 100==0){
            System.out.println("not leap year");
        }
        else if (year % 4 ==0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }

    }













}
