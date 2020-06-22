//Not reading file properly. 
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.Random;
class Employee{
    public static String name;
    public static String password;
    public static long acc;
    public static long bal;
    public static int index;
    public static Random r = new Random();
    public static File c1 = new File("customer1.txt");//For log-in details
    public static File e1 = new File("e1.txt");//For log-in details of employee
    public static File ef = new File("employee_names.txt");//For storing names of employees
    public static File nf = new File("name.txt");//For storing names of customers
    public static File af = new File("account.txt");//For storing account no.
    public static File bf = new File("balance.txt");//For storing balance
    public static String e[] = new String[10]; //Employee password
    public static String p[] = new String[10];//Customer password
    public static String n[] = new String[10];//Customer names
    public static long a[] = new long[10];
    public static int b[] = new int[10];
    public static boolean exit = false;
    public static Scanner i = new Scanner(System.in);
    public static Scanner c = new Scanner(System.in);   
    public static void ini() throws IOException,InterruptedException{
        if (!c1.exists()) {c1.createNewFile();}
        if (!e1.exists()) {e1.createNewFile();}
        if (!ef.exists()) {ef.createNewFile();}
        if (!nf.exists()) {nf.createNewFile();}
        if (!af.exists()) {af.createNewFile();}
        if (!bf.exists()) {bf.createNewFile();}
        Scanner f1 = new Scanner(c1);
        Scanner f2 = new Scanner(nf);
        Scanner f3 = new Scanner(af);
        Scanner f4 = new Scanner(bf);
        Scanner f5 = new Scanner(e1);
        int count=0;
        boolean found=false;
        String var = name+","+password; 
        while(f1.hasNextLine()){p[count]=f1.nextLine();count++;}count=0;
        while(f2.hasNextLine()){n[count]=f2.nextLine();count++;}count=0;
        while(f3.hasNextLine()){a[count]=f3.nextLong();count++;}count=0;
        while(f4.hasNextLine()){b[count]=f4.nextInt();count++;}count=0;
        while(f5.hasNextLine()){e[count]=f5.nextLine();count++;}
        for(int x=0;x<=count-1;x++){ 
            if(var.equals(e[x])){
               index=x;found=true;
               System.out.println("\nPrinting account details of customers...");
               Thread.sleep(1000);
               view();
               int flag=0;
               while(flag==0){
                   System.out.print("Do you want to update records or exit this account?(r/e)");
                   String choice = c.nextLine();
                   if(choice.toLowerCase().equals("r")){record();} 
                   else if(choice.toLowerCase().equals("e")){flag=1;break;}
               }   
            }
        }
        if(found==false){System.out.println("Account doesn't exist!");}
    }
    public static void c_login(){
        System.out.print("Enter username: ");
        name = c.nextLine(); 
        System.out.print("Enter password: ");
        password = c.nextLine();
    }
    public static void view(){
        for(int j=0;j<10;j++){
            if((b[j]!=0)){ System.out.println((j+1)+". Name: "+n[j]+"\tAccount no.: "+a[j]+"\tBalance: "+b[j]+"\tUname,PWD: "+p[j]);}}
    }
    public static void record() throws IOException{ 
        System.out.print("\nEnter account number for record updation: ");
        long a_temp = i.nextLong();
        int flag=0;
        while(flag==0){
          System.out.println("Choose the number before the option you wish to select to select the option:");
          System.out.print("1.Update name\n2.Update balance\n3.Update password\n4.Exit\nChoice: ");
          int ch = i.nextInt();
          switch(ch){
            case 1: update_name(a_temp); flag=1;break;
            case 2: update_balance(a_temp); flag=1;break;
            case 3: update_pwd(a_temp); flag=1;break;
            case 4: flag=1;break;
            default: System.out.println("Please enter a proper option!\n");break;
          }
        }
    }
    public static void update_balance(long ac) throws IOException{ //Updating balances
        System.out.print("Enter new balance for account number "+ac+": ");
        int d = i.nextInt();
        int temp_i =0;
        for(int l=0;l<10;l++){if(a[l]==ac){temp_i=l;}}
        b[temp_i]=d;
        bf.delete();
        if (!bf.exists()){bf.createNewFile();}
        Scanner f6 = new Scanner("balance.txt");
        FileWriter fw6 = new FileWriter("balance.txt",true);
        BufferedWriter bw6 = new BufferedWriter(fw6);
        PrintWriter pw6 = new PrintWriter(bw6); 
        System.out.println("Balance updated for account no.: "+ac);
        System.out.println("New Balance: "+b[temp_i]);
        for(int l=0;l<10;l++){if((b[l]!=0)){if(b[l+1]==0){pw6.print(b[l]);bw6.flush();}else{pw6.println(b[l]);bw6.flush();}}}
    } 
    public static void update_name(long ac) throws IOException{ //Updating names
        System.out.print("Enter new name for account number "+ac+": ");
        String d = c.nextLine();
        int temp_i =0;
        for(int l=0;l<10;l++){if(a[l]==ac){temp_i=l;}}
        n[temp_i]=d;
        nf.delete();
        if (!nf.exists()){nf.createNewFile();}
        Scanner f7 = new Scanner("name.txt");
        FileWriter fw7 = new FileWriter("name.txt",true);
        BufferedWriter bw7 = new BufferedWriter(fw7);
        PrintWriter pw7 = new PrintWriter(bw7); 
        System.out.println("Name updated for account no.: "+ac);
        System.out.println("New name: "+n[temp_i]);
        for(int l=0;l<10;l++){
            if((!n[l].equals("0"))){
                if(!n[l+1].equals("0")){pw7.print(n[l]);bw7.flush();}
                else{pw7.println(n[l]);bw7.flush();}
            }
        }
    } 
    public static void update_pwd(long ac) throws IOException{ //Updating passwords
        System.out.print("Enter new password for account number "+ac+": ");
        String d = c.nextLine();
        int temp_i =0;
        for(int l=0;l<10;l++){if(a[l]==ac){temp_i=l;}}
        p[temp_i]=name+","+d;
        c1.delete();
        if (!c1.exists()){c1.createNewFile();}
        Scanner f8 = new Scanner("customer1.txt");
        FileWriter fw8 = new FileWriter("customer1.txt",true);
        BufferedWriter bw8 = new BufferedWriter(fw8);
        PrintWriter pw8 = new PrintWriter(bw8); 
        System.out.println("Password updated for account no.: "+ac);
        System.out.println("New password: "+p[temp_i]);
        for(int l=0;l<10;l++){if((!p[l].equals("0"))){if(!p[l+1].equals("0")){pw8.print(p[l]);bw8.flush();}else{pw8.println(p[l]);bw8.flush();}}}
    } 
    public static void main() throws IOException,InterruptedException{
        System.out.print("\f");
        System.out.println("\t\t\t\t\t Employee Login page");
        String w;
        while(exit==false){
            c_login();
            ini();
            System.out.println("\nDo you want to quit?(y/n)");
            w = c.nextLine();
            exit= w.equals("y")? true:false;
            //System.out.println();
        } 
        System.out.print("\f");
    }
}