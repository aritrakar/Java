import java.util.Scanner;
class Perfect{
    public static void PNoCheck(){
     Scanner i = new Scanner(System.in);
     System.out.print("\f");
     System.out.print("Enter a number: ");
     int n = i.nextInt();
     int count=0,j;
     for(j=1;j<=n/2;j++){
         if(n%j == 0){
            count = count + j; 
        }
     } 
     if(count == n){System.out.print(n+" is a perfect no.");}
     else{System.out.print("Not a perfect no.");}
  }
  public static void PN1toN(){
     Scanner i = new Scanner(System.in);
     System.out.print("\f");
     System.out.print("Enter a number: ");
     int n = i.nextInt();
     int count,j,m;
     for(m=1;m<=n;m++){
      count=0;
      for(j=1;j<=m/2;j++){
         if(m%j == 0){
            count = count + j; 
        }
      } 
      if(count == m){System.out.println(m);}
     }
  }
}