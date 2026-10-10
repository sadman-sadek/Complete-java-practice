import java.util.Scanner;
public class strg_buffer{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer("sadman");

        str.delete(0, 2);
        str.append(" sadek");


        System.out.println("Str ="+str);

    }
}