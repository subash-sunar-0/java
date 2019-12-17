//create a matrix of size 2x3 multi dimension Arrya

import java.util.Scanner;
class Matrix{
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        int[][]a = new int[2][3];
        System.out.println("Enter the element of matrix 2x3");

        for (int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                a[i][j]=Sc.nextInt();

            }
        }
        System.out.println("Following are the elements of matrix 2x3");
        for(int i =0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}