
import java.util.Scanner;

public class Array{

    public static void main(String[] args) {
        
    


    Scanner input = new Scanner(System.in);



    System.out.println("Enter the no of element: ");
    int i;
    double avg;
    int sum=0;
    int size = input.nextInt();
    
    int[]x=new int[size];


    for (i = 0; i<size;i++){
        x[i]=input.nextInt();
        sum=sum+x[i];
    
    }
    for(i=0;i<size;i++){
        System.out.println(x[i]);
        
    }
    avg = sum/size;

    System.out.println("The average of element are "+ avg);

   }

}