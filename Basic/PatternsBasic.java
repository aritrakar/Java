import java.util.Scanner;
class PatternsBasic{
    public static void Star(){
     Scanner i = new Scanner(System.in);
     System.out.print("\f");
     System.out.print("Enter a number: ");
     int n = i.nextInt();
     int k,j;
     for(j=1;j<=n;j++){
        for(k=1;k<=j;k++){System.out.print(k);}
        System.out.println();
    } 
  }
   public static void StarReverse(){
     Scanner i = new Scanner(System.in);
     System.out.print("\f");
     System.out.print("Enter a number: ");
     int n = i.nextInt();
     int k,j,l,m=n-1;
     for(j=1;j<=n;j++){
        for(l=m;l>=1;l--){
            System.out.print(" ");
        }
        for(k=1;k<=j;k++){
            System.out.print(k);
        }
         m--;
        System.out.println();
    } 
  }
}