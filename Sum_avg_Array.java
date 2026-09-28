import java.util.Scanner;
public class Sum_avg_Array{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        double [] number = new double [5];
        double sum = 0;
        double avg;
        System.out.print("please enter five number :");

        for (int i=0; i<5; i++){
           number[i] = sc.nextDouble();
        }

        
        for (int i=0; i<5; i++){
            sum = sum + number[i];
        }
        System.out.println(" sum of all numbers is :" +sum);
           

       avg = sum/number.length;
       System.out.println("average of all numbers is :" +avg);


       double max =number[0];
       for (int i=0; i<5; i++){
            if (number [i]>max){
                max = number[i];
                
            }
          }
         System.out.println("the maximum number is :"+max);


         double min =number[0];
         for (int i=0; i<5; i++){
            if (number [i]<min){
                min = number[i];
                
            }
          }
         System.out.println("the minimum number is :"+min);
        }
    }
