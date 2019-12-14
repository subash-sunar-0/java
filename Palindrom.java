import java.util.Scanner;

public class Palindrom{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no to check : ");

        int num = input.nextInt();
        int sum=0,r,number=num;

        while (num>0){
            r=num%10;
            num=num/10;
            sum = sum*10+r;
        }
        if (sum==number){
            System.out.println("palindrome");

        }
        else{
            System.out.println("not palindrome");
        }            
    }
}