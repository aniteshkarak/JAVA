package JAVA;

public class Variables_DataTypes {
    public static void main(String[] args) {
        //Integers -> byte, short, int, long
        

        byte b = 5;
        short s = 10;
        int i = 4000;
        long l = 100000;

        //Real NUmber

        float f = 18.54f;
        double d = 4.263;

        //Characters
        char c1 = 'A';
        char c2 = 'K';

        // boolean 

        boolean bool = false;

        // Binary(2), Octal(8), Hexadecimal(16) Number system 
        byte bin = 0b101; //binary num
        byte oct = 024; //octal num
        byte hexa = 0xA; //hexadecimal num
        
        System.out.println("Integer Values -> " +b+", "+s+", "+i+", "+l+", ");
        System.out.println("Floating Values -> " +f+", "+d);
        System.out.println("Characters Values -> " +c1+", "+c2);
        System.out.println("Boolan Values -> " +bool);
        System.out.println("Binary , Octal and Hexadecimal Values -> " +bin+", "+oct+", "+hexa);
        
    }
}
