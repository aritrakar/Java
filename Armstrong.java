import java.util.Scanner;
class Armstrong{
    public static void Armstrong(){
     Scanner i = new Scanner(System.in);
     System.out.print("\f");
     System.out.print("Enter a number: ");
     int n = i.nextInt();
     int k=1, sum=0, m=n;
     while(n>0){
         k=n%10;
         sum = sum + (k*k*k);
         n=n/10;
     }
     if(sum == m){System.out.print(m+" is an Armstrong number");}
     else{System.out.print(m+" is not an Armstrong number.");}
    }
    public static void A1toN(){
     Scanner i = new Scanner(System.in);
     System.out.print("\f");
     System.out.print("Enter a number: ");
     int n = i.nextInt();
     int k, sum=0,l,m;
     for(l=1;l<=n;l++){
     m=l;    
     sum=0;
     while(m>0){
         k=m%10;
         sum = sum + (k*k*k);
         m=m/10;
     }
     if(sum == l){System.out.println(l);}
    }
  }
}