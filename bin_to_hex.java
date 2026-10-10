public class bin_to_hex{
    public static void main(String[] args) {
       int binary = 11111;
       String hexadecimal = Integer.toHexString(binary);
       System.out.println("octal ="+hexadecimal);
    }
}


/* String binary = "1101";
        int decimal = Integer.parseInt(binary, 2);
        String hexadecimal = Integer.toHexString(decimal);

        System.out.println("hexadecimal =" + hexadecimal);*/