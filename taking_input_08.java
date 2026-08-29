import java.util.Scanner;
public class taking_input_08{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your name : ");
        String name=sc.nextLine();
        System.out.print("your name = "+name);
    }
}