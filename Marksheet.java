import java.util.Scanner;

public class Marksheet{
    public static void main(String[] args) {
        
        Marks();
    }

    public static void Marks(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks");
        float mark =input.nextFloat();

        if (mark>=80){
            System.out.println("Distinction");
        }
        else if(mark<=79 && mark>=60){
            System.out.println("First Division");

        }
        else if(mark>=35 && mark<=59){
            System.out.println("Second Devision");
        }
        else{
            System.out.println("Fail");
        }

    }
}