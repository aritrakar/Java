import java.util.Scanner;
class Pascal{
    public static void main(){
        Scanner i = new Scanner(System.in);
        System.out.print("\f");
        System.out.print("Enter no. of levels: ");
        int l = i.nextInt();
        for(int j=0;j<l;j++){
            for(int k=0;k<=j;k++){System.out.print(c(j,k)+" ");}
            System.out.println();
        }
    }
    public static int c(int n, int r){
        return (fact(n)/(fact(r)*fact(n-r)));
    }
    public static int fact(int s){
        int k=1;
        for(int j=1;j<=s;j++){k *= j;}
        return k;
    }
}
