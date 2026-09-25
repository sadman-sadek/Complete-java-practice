import java.util.Scanner;
 public class arrayDemo{
  public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   
   int [] num = new int [2];
  
   num [0] =sc.nextInt();
   num [1] =sc.nextInt();

   

   int sum = num[0] +num[1];
   int avg = (num[0] +num[1])/num.length;

   System.out.println("your entered numbers are :" +num[0]+ ","+num[1]);
   System.out.println("your entered numbers sum = " +sum);
   System.out.println("your entered numbers avarage = " +avg);

  }

 }