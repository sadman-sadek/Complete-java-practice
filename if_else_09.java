import java.util.*;

public class if_else_09{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("enter your age :");
    int age = input.nextInt();
    

    System.out.println("your age is :" + age );
    if(age>=18){
        System.out.println("so,you are an adult!Congrats !😍");
    }
    
else {
    System.out.println("sorry! You are not an adult😒");
}
  
    if (age % 2 == 0) {
        System.out.println("You age is in even numbers !👌");
    }
   else {
     System.out.print(" your age is  in odd numbers!😁");
   }

    }
}