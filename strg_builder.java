import java.util.Scanner;
public class strg_builder{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder("sadman");
        System.out.println("Str ="+str);

        str.delete(0, 2);
        str.append(" sadek");
        str.reverse();


        System.out.println("Str ="+str);

    }
}