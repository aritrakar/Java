import java.util.Scanner;
class Palindromes{
    public static Scanner i = new Scanner(System.in);
    public static Scanner c = new Scanner(System.in);
    public static void main(){
        System.out.print("\f");
        System.out.println("Palindrome check menu:\n1.String\t2.Number");
        System.out.print("Enter choice: ");
        int choice = i.nextInt();
        switch(choice){
            case 1: palindrome_string(); break;
            case 2: palindrome_num(); break;
            default: System.out.print("Invalid choice."); break;
        }
    }
    public static void palindrome_string(){
        System.out.print("Enter a string: ");
        String s = c.nextLine();
        String a=s;boolean pal=false;
        for(int k=0;k<s.length();k++){
            if(s.charAt(k) == a.charAt(s.length()-k-1)){pal=true;}
            else{break;}
        }
        if(pal==true){System.out.print(s+" is a palindrome string");}
        else{System.out.print(s+" isn't a palindrome string");}
    }
    public static void p_mod(String a){
        StringBuffer sb = new StringBuffer(a);
        if(sb.reverse().toString().equals(a)){System.out.print("Palindrome string");}
        else{System.out.print("Not a palindrome string");}
    }
    public static void palindrome_num(){
        System.out.print("Enter a number: ");
        int n = i.nextInt(); 
        int o=n, s=0,k=0;
        while(n!=0){
            k=n%10;
            s = s*10 + k;
            n=n/10;
        }
        if(s==o){System.out.print(o+" is a palindrome number ");}
        else{System.out.print(o+" isn't a palindrome number ");}
    }
}
