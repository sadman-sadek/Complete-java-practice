import java.util.*;
public class else_if_ex{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
    if (a==b){
        System.out.println("Both are equal.");

    }
    else if (a<b){
            System.out.println("a is less than b");

        }
        else{
            System.out.println("a is greater than b");
        }
    }
    }
