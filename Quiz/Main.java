import java.util.Scanner;
import javax.swing.JOptionPane;
class Main{
    public static Scanner c = new Scanner(System.in);    
    public static Class9 c9 = new Class9();
    static String name;
    static String subject;
    public static void main() throws InterruptedException{
       System.out.print("\f");
       JOptionPane.showMessageDialog(null, "Welcome to Kar Academy!");
       System.out.print("What is your name?");
       name = c.nextLine();
       System.out.println("Hi "+name+", let's get started!"); 
       String choice = "";
       int count=0;
       boolean retry = true;
       while(retry == true){
         count++;
         if(count==1){
            System.out.println("Instructions:");
            System.out.println("For each question you'll have 2 options. Enter ONLY the alphabet\nbefore the option which you feel is correct.");
            System.out.println("For example:");
            System.out.println("Which one of these is a note taking software by Google?");
            System.out.println("Options: A.Keep  B.Evernote");
            System.out.println("Answer: A"); 
            System.out.println("This shows that you think option A is the correct answer."); 
            System.out.println("\nLet's go!");
            Thread.sleep(1500);
         }
         System.out.println("\nWhat do you want to study now?\n(Note: We currently have content only for 9th grade. Others coming soon!)");
         System.out.println("1.English 2.Math  3.Physics  4.Chemistry");
         System.out.println("5.Biology  6.History  7.Geography  8.Computer\n");
         System.out.print("Choice: ");
         subject= c.nextLine();
         switch(subject){
             case"1":case"English":case"english":case"ENGLISH": System.out.println("Starting English!");Thread.sleep(2000);c9.English();break;
             case"2":case"Math":case"math":case"MATH": System.out.println("Starting Math!");Thread.sleep(2000);c9.Math();break;
             case"3":case"Physics":case"physics":case"PHYSICS": System.out.println("Starting Physics!");Thread.sleep(2000);c9.Physics();break;
             case"4":case"Chemistry":case"chemistry":case"CHEMISTRY": System.out.println("Starting Chemistry!");Thread.sleep(2000);c9.Chemistry();break;
             case"5":case"Biology":case"biology":case"BIOLOGY":System.out.println("Starting Biology!");Thread.sleep(2000);c9.Biology();break;
             case"6":case"History":case"history":case"HISTORY": System.out.println("Starting History!");Thread.sleep(2000);c9.History();break;
             case"7":case"Geography":case"geography":case"GEOGRAPHY":System.out.println("Starting Geography!");Thread.sleep(2000);c9.Geography();break;
             case"8":case"Computer":case"computer":case"COMPUTER":System.out.println("Starting Computer!");Thread.sleep(2000);c9.Computer();break;
             default: System.out.print("Invalid."); 
         }
         int flag2=0;
         while(flag2==0){
           Thread.sleep(1500);
           System.out.print("\nDo you want to exit?");
           String choice2 = c.nextLine();
           if((choice2.equals("Yes"))||(choice2.equals("yes"))||(choice2.equals("YES"))){retry=false;flag2=1;}
           else if((choice2.equals("No"))||(choice2.equals("no"))||(choice2.equals("NO"))){System.out.println("\nI admire your determination!");flag2=1;c9=null;}
           else{System.out.println("I'm sorry. I didn't get what you said.");}
         }
       } 
       System.out.print("See you later then :)");
    }
}