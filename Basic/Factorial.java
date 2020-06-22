import java.util.Scanner;
class Factorial{
    public static void Factorial(){
     Scanner i = new Scanner(System.in);
     System.out.print("\f");
     System.out.print("Enter a number: ");
     int n = i.nextInt();
     int j,k=1;
     for(j=1;j<=n;j++){
         k=k*j;
     }
     System.out.print(k);
    }
    public static void FactorialSums(){
     Scanner i = new Scanner(System.in);
     System.out.print("\f");
     System.out.print("Enter a number: ");
     int n = i.nextInt();
     int j,k=1,m, sum=0;
     for(m=1;m<=n;m++){
     k=1;
     for(j=1;j<=m;j++){
         k=k*j;
     }
     sum=sum + k;
    }
    System.out.print(sum);
   }
}