import java.util.*;

public class taking_input_08{
    public static void main(String []arg){
        System.out.println("Enter your name, batch and roll no: ");
        Scanner info = new Scanner(System.in);


        System.out.print("Enter your name: ");  
        String name = info.nextLine();
        
        

        System.out.print("Enter your Roll no : ");
        int rollNo = info.nextInt();
        


        System.out.print("Enter your Batch: "); 
        int batch = info.nextInt();
        

        System.out.println("Your Name: " + name + " ");
        System.out.println("Your Roll No: " + rollNo + " " );
        System.out.println("Batch no : " + batch + " " );

        if ( batch >45){
            System.out.println("senior");
        }
        else {
            System.out.println(" junior!");
        }   
        }
    }
