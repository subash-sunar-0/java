import java.util.Scanner;

public class Triangle{


    public static void main(String[] args) {
        Angle();
    }

    public static void Angle(){
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  first  angles");
        a = input.nextInt();

        System.out.println("Enter second angle");
        b=input.nextInt();

        System.out.println("Enter third angle");
        c=input.nextInt();


        if(a==b && b==c){
            System.out.println("All Angles are equal so, it is an equilator triangle");
        }

        else if(a==b || b==c){
            System.out.println("Two angles are equal so, it is an Isosceles triangle");

        }
        else{
            System.out.println("Since none of the angle are equal so it is a Scalene triangle");
        }




    }
}