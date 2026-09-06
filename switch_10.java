import java.util.*;

public class switch_10{
    public static void main(String[]args){
        Scanner bulb = new Scanner(System.in);
        System.out.println("Enter 1 or 0 !");
        int choice =bulb.nextInt();

 switch (choice){
    case 1: System.out.println("light on 💡");
    break;
    case 0: System.out.println("light off 🌚");
    break;
    default: System.out.println("not found !");
 }
    }
}