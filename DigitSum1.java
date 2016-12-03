import java.util.Scanner;
class DigitSum1{
   public static void main(String[] args){
     Scanner i = new Scanner(System.in);
     System.out.print("\f");
     int j;
     int n[] = new int[1000];
     int c = i.nextInt();
     for(j=1;j<=c;j++){
         n[j] = i.nextInt();
     }
     for(j=1;j<=c;j++){
     int sum=0,k;
     while(n[j]!=0){
        k=n[j]%10; 
        n[j]=n[j]/10;
        sum = sum + k;
     } 
     System.out.println(sum);
     }
   }


}