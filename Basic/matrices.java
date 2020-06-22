import java.util.Scanner;
class Matrices{
    public static Scanner i = new Scanner(System.in);
    public static void main(){
        System.out.print("\f");
        System.out.print("Enter number of rows of matrix 1 : ");
        int rows1 = i.nextInt();
        System.out.print("Enter number of columns of matrix 1: ");
        int cols1 = i.nextInt();
        int m1[][] = new int[rows1][cols1];
        for(int r=0;r<rows1;r++){
            for(int c=0;c<cols1;c++){
                int a=r,b=c;
                System.out.print("Value for row "+(a+1)+" and column "+(b+1)+" is :");
                m1[r][c]= i.nextInt();
            }
        }
        System.out.print("\nEnter number of rows of matrix 2: ");
        int rows2 = i.nextInt();
        System.out.print("Enter number of columns of matrix 2: ");
        int cols2 = i.nextInt();
        int m2[][] = new int[rows2][cols2];
        for(int r=0;r<rows2;r++){
            for(int c=0;c<cols2;c++){
                int a=r,b=c;
                System.out.print("Value for row "+(a+1)+" and column "+(b+1)+" is :");
                m2[r][c]= i.nextInt();
            }
        }
        System.out.println("Printing matrix 1:");
        for(int a=0;a<rows1;a++){
            for(int b=0;b<cols1;b++){
                System.out.print(m1[a][b]+"  ");
            }
            System.out.println();
        }
        System.out.println("Printing matrix 2:");
        for(int a=0;a<rows2;a++){
            for(int b=0;b<cols2;b++){
                System.out.print(m2[a][b]+"  ");
            }
            System.out.println();
        }
        int m3[][] = new int[rows2][cols2]; //row1=row2 and cols1=cols2 for square matrix
        System.out.println("Addition: ");
        for(int y=0;y<rows1;y++){
            for(int z=0;z<cols1;z++){
                m3[y][z]= m1[y][z]+m2[y][z];
            }
        }
        for(int a=0;a<rows1;a++){
            for(int b=0;b<cols1;b++){
                System.out.print(m3[a][b]+"  ");
            }
            System.out.println();
        }
        System.out.println("Multiplication: ");
        if(rows1 != cols2){System.out.print("Multiplication is not possible.");}
        else {
            int m4[][] = new int[rows1][cols2];
            for(int k=0;k<rows1;k++){
                for(int j=0;j<cols2;j++){
                    for(int p=0;p<cols1;p++){ //Got formula from https://study.com/academy/lesson/multiplying-matrices-in-java.html
                        m4[k][j]+= m1[k][p] * m2[p][j];
                    }
                }
            }
            for(int a=0;a<rows1;a++){
                for(int b=0;b<cols2;b++){
                    System.out.print(m4[a][b]+"  ");
                }
                System.out.println();
            }
        }
    }
}
