import java.util.Scanner;

class Menu{
    public static void main(String[] args) {
        int a=10,b=5,c;
        Scanner input = new Scanner(System.in);
        
        System.out.println("press 1.ADD 2.SUB 3.MUL 4.DIV");
        int choice = input.nextInt();



        switch(choice){
            case 1:c=a+b;
                System.out.println("sum= " +c);
                break;
            
            case 2:c=a-b;
                System.out.println("subtraction= " + c);
                break;

            case 3:c=a*b;
                System.out.println("multiplication= "+ c);
                break;
            case 4:c=a/b;
                System.out.println("Division= "+ c);
                break;
            default:System.out.println("Invalid input");

        }
    }
}