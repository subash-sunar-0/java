import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int count = 0,Ori_num = num;
        int number = num;
        double sum = 0;

        while(num>0){
            num = num/10;
            count++;
        }
        while(number>0){
            int a = number % 10;
            sum = sum+Math.pow(a,count);
            number = number/10;
        }
        if(sum == Ori_num){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }

    }
}