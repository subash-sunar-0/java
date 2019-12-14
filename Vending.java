import java.util.Scanner;


public class Vending{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Please select an option");
        System.out.println("1.coke");
        System.out.println("2.Fanta");
        System.out.println("3.sprite");
        System.out.println("4.exit");
        boolean run = true;
        while(run){
            choice = input.nextInt();
            switch(choice){
                case 1:
                System.out.println("coke");
                break;

                case 2:
                System.out.println("Fanta");
                break;

                case 3:
                System.out.println("sprite");
                break;

                case 4:
                run = false;
                break;

                default:
                System.out.println("please enter valid option");
                break;
            }


                



        }



    }
}
