import java.util.Scanner;
public class arRay_2D{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);


        int [][] A = new int [2][3];
        System.out.println("please enter A 2 by 3 matrix number");
        for(int row =0; row<2; row++){
            for(int col =0; col<3; col++){
                A [row][col]=input.nextInt();
                
            }
            System.out.println();
        }
         System.out.println("A =");
          for(int row =0; row<2; row++){
            for(int col =0; col<3; col++){
                
               System.out.print(A[row][col]);
            }
             System.out.println();
          }
    }
}