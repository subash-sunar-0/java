import java.util.*;

public class Smallest{

    static int totalNumber;
    static int num[];

    static int smallest(int arr[]){

        int smallestNum=num[0];
        for(int i=0; i< arr.length; i++){
            if(num[i]<smallestNum){
                smallestNum=num[i];
            }
        }

        return smallestNum;


    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many number you want?:  ");

        totalNumber = input.nextInt();
        num = new  int [totalNumber];

        System.out.println("Enter Values: ");

        for(int i=0; i< totalNumber; i++){
            num[i] = input.nextInt();
        }

        System.out.println("Smallest number is : "+ smallest(num));
    }



}

