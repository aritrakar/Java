import java.util.Scanner;
import java.io.IOException;
class Main{
    public static Scanner i = new Scanner(System.in);
    public static Customer c = new Customer();
    public static Employee e = new Employee();
    public static void main() throws IOException,InterruptedException{
        System.out.print("\f");
        System.out.println("*************************************Welcome to Arkham Bank*************************************");
        System.out.println("\t\t\t\t 'Your money is safe with us!'");
        int flag=0;
        while(flag==0){
            System.out.print("\nAre you one of our valued customers, an employee or just passing by?(c/e/p)");
            String a = i.nextLine();
            if(a.equals("c")){c.main(); c=null;}
            else if(a.equals("e")){e.main(); e=null;} //Logging back into the system after logout isn't possible.null not working so far.
            else {System.out.print("Bye then!");flag=1;break;}
        }
    }
}