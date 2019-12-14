//program to calculate tax in nepal
import java.util.Scanner;
public class Nestedif{

    public static void main(String[] args) {
        double tax = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for married and 2 for single");
        int status = input.nextInt();
        System.out.println("Enter your salary");
        double salary = input.nextDouble();


        if(status ==1){
            if(salary<400000){
                tax = salary * 0.01;
            }
            else if(salary<500000){
                tax = 4000+(salary-400000)*0.1;
            }
            else if (salary<600000){
                tax = 4000+10000+(salary-500000)* 0.2;
            }
        }

        else if (status == 2){
            if(salary<350000){
                tax = salary * 0.01;
            }
            else if (salary<450000){
                tax = 3500+(salary-350000)*0.1;
            }
            else if(salary < 550000){
                tax = 3500+10000+(salary-450000)*0.2;
            }
        }
        else{
            System.out.println("please Enter 1 and 2");
        }
        System.out.println("The tax is : "+ tax);

    }











}