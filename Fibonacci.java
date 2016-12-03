import java.util.Scanner;
class Fibonacci{
    public static void FtoN(){
     Scanner i = new Scanner(System.in);
     System.out.print("\f");
     System.out.print("Enter a number: ");
     int n = i.nextInt();
     int j,a=0,b=1,c;
     for(j=1;j<=n;j++){
         c = a+b;
         System.out.print(c+" ");
         b=a;
         a=c;
     }
    }
}