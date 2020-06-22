import java.util.Scanner;
class Array_2D{
    public static Scanner i = new Scanner(System.in);
    public static void transpose(){
        System.out.print("\f");
        System.out.print("Enter number of rows: ");
        int r = i.nextInt();
        System.out.print("Enter number of columns: ");
        int c = i.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Please fill the matrix");
        for(int j=0;j<r;j++){
            for(int k=0;k<c;k++){
                System.out.print("Element "+j+","+k+": ");
                a[j][k] = i.nextInt();
            }
        }
        int t[][] = new int[c][r];
        for(int j=0;j<r;j++){
            for(int k=0;k<c;k++){t[k][j] = a[j][k];}
        }
        System.out.println("Printing original array...");
        for(int j=0;j<r;j++){
            for(int k=0;k<c;k++){
                System.out.print(a[j][k]+" ");
            }
            System.out.println();
        }
        System.out.println("Printing transposed array...");
        for(int j=0;j<c;j++){
            for(int k=0;k<r;k++){
                System.out.print(t[j][k]+" ");
            }
            System.out.println();
        }
    }
    public static void sort(){
        System.out.print("\f");
        System.out.print("Enter number of rows: ");
        int r = i.nextInt();
        System.out.print("Enter number of columns: ");
        int c = i.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Please fill the matrix");
        for(int j=0;j<r;j++){
            for(int k=0;k<c;k++){
                System.out.print("Element "+j+","+k+": ");
                a[j][k] = i.nextInt();
            }
        }
        System.out.println("Printing original array...");
        for(int j=0;j<r;j++){
            for(int k=0;k<c;k++){
                System.out.print(a[j][k]+" ");
            }
            System.out.println();
        }
        int m[] = new int[r*c]; int count=0;
        for(int j=0;j<r;j++){for(int k=0;k<c;k++){m[count]=a[j][k];count++;}}
        int temp=0;
        for(int j=0;j<r*c-1;j++){//Bubble sort
            for(int k=0;k<r*c-1-j;k++){
                if(m[k] >(m[k+1])){
                    temp=m[k];
                    m[k]=m[k+1];
                    m[k+1]=temp;
                }
            }
        }
        System.out.println("Printing sorted array...");
        int f=0;
        for(int j=0;j<r;j++){
            for(int k=0;k<c;k++){System.out.print(m[f]+" ");f++;}
            System.out.println();
        }
    }
    public static void operations(){
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
        int m4[][] = new int[rows2][cols2]; 
        System.out.println("Subtraction(A-B): ");
        for(int y=0;y<rows1;y++){
            for(int z=0;z<cols1;z++){
                m4[y][z]= m1[y][z]-m2[y][z];
            }
        }
        for(int a=0;a<rows1;a++){
            for(int b=0;b<cols1;b++){
                System.out.print(m4[a][b]+"  ");
            }
            System.out.println();
        }
        int m5[][] = new int[rows2][cols2]; //row1=row2 and cols1=cols2 for square matrix
        System.out.println("Subtraction(B-A): ");
        for(int y=0;y<rows1;y++){
            for(int z=0;z<cols1;z++){
                m5[y][z]= m2[y][z]-m1[y][z];
            }
        }
        for(int a=0;a<rows1;a++){
            for(int b=0;b<cols1;b++){
                System.out.print(m5[a][b]+"  ");
            }
            System.out.println();
        }
        //Multiplication
        if(rows1 != cols2){System.out.print("Multiplication is not possible.");}
        else {
            System.out.println("Multiplication(A*B): ");
            int m6[][] = new int[rows1][cols2];
            for(int k=0;k<rows1;k++){
                for(int j=0;j<cols2;j++){
                    for(int p=0;p<cols1;p++){ 
                        m6[k][j]+= m1[k][p] * m2[p][j];
                    }
                }
            }
            for(int a=0;a<rows1;a++){
                for(int b=0;b<cols2;b++){
                    System.out.print(m6[a][b]+"  ");
                }
                System.out.println();
            }
            System.out.println("Multiplication(B*A): ");
            int m7[][] = new int[rows1][cols2];
            for(int k=0;k<rows1;k++){
                for(int j=0;j<cols2;j++){
                    for(int p=0;p<cols1;p++){ 
                        m7[k][j]+= m2[k][p] * m1[p][j];
                    }
                }
            }
            for(int a=0;a<rows1;a++){
                for(int b=0;b<cols2;b++){
                    System.out.print(m7[a][b]+"  ");
                }
                System.out.println();
            }
        }
    }
}
