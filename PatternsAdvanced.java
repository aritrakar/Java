import java.util.Scanner;
class PatternsAdvanced{
    public static Scanner i = new Scanner(System.in);
    public static void DiamondStars(){
        System.out.print("\f");
        System.out.print("Enter a number: ");
        int num = i.nextInt();
        int j,k,l, m=num-2;
        for(j=1;j<=num;j++){
            for(l=m;l>=0;l--){
                System.out.print(" ");
            }
            for(k=1;k<=j;k++){
               System.out.print("* ");
            }
            m=m-1;
            System.out.println();
        }
        m=0;
        for(j=(num-1);j>=1;j--){
            for(l=0;l<=m;l++){
                    System.out.print(" ");
            }
            for(k=j;k>=1;k--){
               System.out.print("* ");
            }
            m=m+1;
            System.out.println();
        }
        /* for(j=(num-1);j>=1;j--){
            for(k=1;k<=j;k++){
                System.out.print("* ");
            }
            System.out.println();
        } */
    }
    public static void AK(){
        System.out.print("\f");
        int j,k,l,num=20, m=num-2;
        for(j=1;j<=num;j++){
            for(l=m;l>=0;l--){
                System.out.print(" ");
            }
            for(k=1;k<=j;k++){  //Loop for A
                if((k>2)&&(k<(j-1))){
                    if(j==((num/2)+2)){System.out.print("* ");}
                    else {System.out.print("  ");}
                }
               else{System.out.print("* ");}
            }
            m=m-1;
            System.out.println();
        }
        System.out.println();
        j=0;
        for(j=num/2;j>=1;j--){
            for(k=1;k<=j;k++){  //Loop for K upper part
               if(k==1){continue;}
                if((k>2)&&(k<(j-1))){
                    System.out.print("  ");
                }
               else{System.out.print("* ");}
            }
            m=m-1;
            System.out.println();
        }
        j=0;m=-1;
        for(j=1;j<=num/2;j++){
            for(l=m;l>=0;l--){
                System.out.print(" ");
            }
            for(k=1;k<=j;k++){  //Loop for K lower part
               if(k==1){continue;}
                if((k>2)&&(k<(j-1))){
                    System.out.print("  ");
                }
               else{System.out.print("* ");}
            }
            m=m-1;
            System.out.println();
        }
    }
    
}