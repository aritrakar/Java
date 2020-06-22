import java.util.Scanner;
class Conversions{
    public static Scanner i = new Scanner(System.in);
    public static void bin(int a){
        System.out.print("\f");
        int k=0; String f="";
        while(a>0){
            k=a%2;
            f += Integer.toString(k);
            a=a/2;
        }
        String res = new StringBuffer(f).reverse().toString();
        System.out.print("Binary version: "+res);
    }
    public static void octal(int a){
        System.out.print("\f");
        int k=0; String f="";
        while(a>0){
            k=a%8;
            f += Integer.toString(k);
            a=a/8;
        }
        String res = new StringBuffer(f).reverse().toString();
        System.out.print("Octal version: "+res);
    }
    public static void hex(int a){
        System.out.print("\f");
        int k=0; String f="";
        while(a>0){
            k=a%16;
            if(k>9){switch(k){
                case 10: f+= "A"; break;
                case 11: f+= "B"; break;
                case 12: f+= "C"; break;
                case 13: f+= "D"; break;
                case 14: f+= "E"; break;
                case 15: f+= "F"; break;
              }
            }
            else{ f += Integer.toString(k); }
            a=a/16;
        }
        String res = new StringBuffer(f).reverse().toString();
        System.out.print("Hexadecimal version: "+res);
    }
}
