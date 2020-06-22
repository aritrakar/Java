import java.util.Scanner;
class Prime{
    public static void PrmCheck(){
     Scanner i = new Scanner(System.in);
     System.out.print("\f");
     System.out.print("Enter a number: ");
     int n = i.nextInt();
     int j,flag=0;
     for(j=2;j<=n/2;j++){
         if(n%j == 0){
            flag=1;
            }
        }
     if(flag!=1){System.out.print("Prime");}
     else{System.out.print("Not prime");}
    }
    public static void Prm1toN(){
     Scanner i = new Scanner(System.in);
     System.out.print("\f");
     System.out.print("Enter a number: ");
     int n = i.nextInt();
     int j,flag=0,m;
     for(m=1;m<=n;m++){
        for(j=2;j<=m/2;j++){
         if(m%j == 0){
            flag=1;
            }
         }
        if(flag!=1){System.out.println(m);}
        flag=0;
      }
    }
}