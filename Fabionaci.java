import java.util.Scanner;

public class Fabionaci{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a =0,b=1,c,i=0;
        System.out.println("Enter a number: ");
        int num= input.nextInt();

        System.out.print("the fabinaci number are: " +a+"\t"+b);
        while(i<=num-2){
            c = a+b;
            a=b;
            b=2;
            System.out.print("\t"+c);
            i++;
        }
    
    
    }
}