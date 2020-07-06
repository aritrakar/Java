import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.Random;
class Customer{
    public static String name;
    public static String password;
    public static long acc;
    public static long bal;
    public static int index;
    public static Random r = new Random();
    public static File c1 = new File("customer1.txt");//For log-in details
    public static File nf = new File("name.txt");//For storing name
    public static File af = new File("account.txt");//For storing account no.
    public static File bf = new File("balance.txt");//For storing balance
    public static File tf = new File("acc_type.txt");//For storing account type
    public static String p[] = new String[10];
    public static String n[] = new String[10];
    public static String type[] = new String[10];
    public static long a[] = new long[10];
    public static int b[] = new int[10];
    public static boolean exit = false;
    public static Scanner i = new Scanner(System.in);
    public static Scanner c = new Scanner(System.in);   
    public static void check() throws IOException,InterruptedException{
        if (!c1.exists()) {c1.createNewFile();}
        if (!nf.exists()) {nf.createNewFile();}
        if (!af.exists()) {af.createNewFile();}
        if (!bf.exists()) {bf.createNewFile();}
        if (!tf.exists()) {tf.createNewFile();}
        FileWriter fw = new FileWriter("customer1.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw); 
        FileWriter fw2 = new FileWriter("name.txt",true);
        BufferedWriter bw2 = new BufferedWriter(fw2);
        PrintWriter pw2 = new PrintWriter(bw2);
        FileWriter fw3 = new FileWriter("account.txt",true);
        BufferedWriter bw3 = new BufferedWriter(fw3);
        PrintWriter pw3 = new PrintWriter(bw3);
        FileWriter fw4 = new FileWriter("balance.txt",true);
        BufferedWriter bw4 = new BufferedWriter(fw4);
        PrintWriter pw4 = new PrintWriter(bw4);
        Scanner f1 = new Scanner(c1);
        Scanner f2 = new Scanner(nf);
        Scanner f3 = new Scanner(af);
        Scanner f4 = new Scanner(bf);
        Scanner f5 = new Scanner(tf);
        int count=0;
        boolean found=false;
        String var = name+","+password; 
        while(f1.hasNextLine()){p[count]=f1.nextLine();count++;}count=0;
        while(f2.hasNextLine()){n[count]=f2.nextLine();count++;}count=0;
        while(f3.hasNextLine()){a[count]=f3.nextLong();count++;}count=0;
        while(f4.hasNextLine()){b[count]=f4.nextInt();count++;}count=0;
        while(f5.hasNextLine()){type[count]=f5.nextLine();count++;} 
        for(int x=0;x<=count-1;x++){ if(var.equals(p[x])){index=x;found=true;welcome();}}
        if(found==false){ //Check working of new account creation
            System.out.println("Creating account...");
            Thread.sleep(1500);
            acc = Math.abs(r.nextLong());
            welcome_new();
            pw.println(name+","+password);
            pw2.println(name);
        }
        pw.close();fw.close();bw.close();
        pw2.close();fw2.close();bw2.close();
        pw3.close();fw3.close();bw3.close();
        pw4.close();fw4.close();bw4.close();
        f1.close();f2.close(); f3.close();f4.close();
    }
    public static void c_login(){
        System.out.print("Enter username: ");
        name = c.nextLine(); 
        System.out.print("Enter password: ");
        password = c.nextLine();
    }
    public static void welcome() throws IOException{
        System.out.print("\f");
        System.out.println("\nWelcome to your "+type[index]+" account, "+name+"!\nYour account details are as follows:");
        acc=a[index];
        System.out.println("Account No.: "+acc);
        System.out.println("Balance: "+b[index]);
    }
    public static void welcome_new() throws IOException{
        System.out.print("\f");
        System.out.println("Welcome to your new account, "+name+"!");
        System.out.println("What is your starting balance?");
        bal = i.nextLong();
        System.out.println("You account details are as follows:");
        System.out.println("Account No.: "+acc);
        System.out.println("Balance: "+bal);
        action();
    }
    public static void maturity(){
        System.out.println("\nMaturity Value Calculation ");
        System.out.print("Enter principal: ");
        int pr = i.nextInt();
        System.out.print("Enter number of months: ");
        int t = i.nextInt();
        System.out.print("The maturity value of the entered principal at 7.5% rate is "+(pr*t + (float)(pr*t*(t+1)*7.5/2400)));
    }
     public static void monthly(){ //Check formula
        System.out.println("\nMonthly Installment Calculation ");
        System.out.print("Enter maturity value: ");
        float m = i.nextFloat();
        System.out.print("Enter number of months: ");
        int t = i.nextInt();
        float I = (float)(100*t*(t+1)*7.5/2400);
        System.out.print("The monthly installment should be "+(float)(100/(t*100 + I))*m);
    }
    public static void action(){
        boolean t=true;
        while(t==true){
            System.out.println("What would you like to do now: withdraw,weposit, take a loan,"+
            "calculate maturity value or monthly installment for recurring deposit or exit?");
            String choice = c.nextLine();
            switch(choice.toLowerCase()){
                case "withdraw": case "w": withdraw();break;
                case "deposit": case "d": deposit();break;
                case "loan": case "l": loan();break;
                case "maturity": case "mat": maturity();break;
                case "monthly": case "mon": monthly();break;
                case "exit": case "e": t=false;break;
            }
        }
    }
    public static void withdraw(){
        int flag=0;
        while(flag==0){
          System.out.print("How much would you like to withdraw?\nAmount:");
          long amt = i.nextLong();
          if(amt<b[index]){b[index]-=amt;flag=1;break;}
          else{System.out.print("Withdraw amount is greater than balance!");}
        }
        System.out.println("Your balance will be updated shortly.");
    }
    public static void deposit(){
        System.out.print("How much would you like to deposit?\nAmount:");
        long amt = i.nextLong();
        b[index]+=amt;
    }
    public static void loan(){
        System.out.print("How much would you like to take as a loan?\nAmount: ");
        long p = i.nextLong();
        System.out.println("In how many months can you repay the loan?\nTime:");
        float time = i.nextFloat();
        System.out.print("The amount you should repay by "+time+" months, is "+(p*3.5*time/1200));
    }
    public static void update_balance() throws IOException,InterruptedException{
        System.out.print("Updating balance...");
        Thread.sleep(1000);
        bf.delete();
        if (!bf.exists()){bf.createNewFile();}
        Scanner f6 = new Scanner("balance.txt");
        FileWriter fw6 = new FileWriter("balance.txt",true);
        BufferedWriter bw6 = new BufferedWriter(fw6);
        PrintWriter pw6 = new PrintWriter(bw6); 
        System.out.println("Balance updated for account no.: "+acc);
        System.out.println("New Balance: "+b[index]);
        for(int l=0;l<10;l++){if((b[l]!=0)){if(b[l+1]==0){pw6.print(b[l]);bw6.flush();}else{pw6.println(b[l]);bw6.flush();}}}
    }
    public static void main() throws IOException, InterruptedException{
        System.out.print("\f");
        System.out.println("*************************************Welcome to Arkham Bank*************************************");
        System.out.println("\t\t\t\t\t Customer Login page");
        System.out.println("To quit please type : 'Terminate session' or 'ts'");
        String w="";
        while(exit==false){
            c_login();
            check();
            action();
            update_balance();
            System.out.println("\nDo you want to quit or login into another account?");
            w = c.nextLine();
            exit= w.equals("ts") || w.equals("q")? true:false;
        } 
        System.out.print("Thank you for choosing us!");
        Thread.sleep(1500);
        System.out.print("\f");
    }
}
