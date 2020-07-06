import java.util.Scanner; 
import java.util.Random;
import javax.swing.JOptionPane;
class Hospital{
    public static String gender; // Here some class variables have 
    public static int age; //to be declared to store some data
    public static String accom; // which otherwise is local and hence 
    public static int g;//cannot be accessed outside 
    public static int ac_cost; //the blocks of code
    public static int cost = 0;
    public static Scanner chr = new Scanner(System.in); // Scanner object "chr" is for taking integer input
    public static Scanner inp = new Scanner(System.in); // Scanner object "inp" is for taking integer input
    public static void GenderCheck(){ //Custom method
        int flag = 0;
        while(flag == 0){ //Gender checking
           System.out.print("Enter patient's gender:");
           String pat_gen = chr.nextLine();
           if (pat_gen.equals("M") || pat_gen.equals("m")||pat_gen.equals("Male")||pat_gen.equals("MALE")){
                 flag = 1;gender = pat_gen; g = 0;}
           else if (pat_gen.equals("F")||pat_gen.equals("f")||pat_gen.equals("Female")||pat_gen.equals("FEMALE")){
                 flag = 1;gender = pat_gen;g = 1;}
           else {System.out.println("Invalid \n");}
        }
    }
    public static void AccomCheck(){ 
        int flag= 0;
        while (flag == 0){
          System.out.print("Accomodation type(General, Suite, HDU, ICU):");
          String acc_type = chr.nextLine(); 
            switch(acc_type){
                case "General": cost = 2500;flag=1; ac_cost = cost; accom = acc_type; break;
                case "Suite": cost = 7000; flag=1; ac_cost = cost; accom = acc_type; break;
                case "HDU": cost = 3600; flag=1; ac_cost = cost; accom = acc_type; break;
                case "ICU": cost = 5000; flag=1; ac_cost = cost; accom = acc_type; break;
                default: System.out.println("Invalid");
            }
        }
    }
    public static void main()throws InterruptedException{
        JOptionPane.showMessageDialog(null,"Alert!\nThis program is designed for patients who've stayed\nat Ark Memorial hospital only!");
        System.out.print("\f"); //Clears the console
        Random rand = new Random();
        System.out.print("Enter patient's name:");
        String pat_name = chr.nextLine();  
        GenderCheck(); //Calling the GenderCheck method
        int flag = 0;
        while(flag == 0){ //Age check
           System.out.print("Enter patient's age (in years):");
           int pat_age = inp.nextInt();
           if (pat_age >= 0 && pat_age <= 102){
               flag = 1;age = pat_age;}
           else {System.out.println("Invalid");}
        }
        System.out.print("Enter patient's address:");
        String address = chr.nextLine();
        System.out.print("Enter doctor's name: Dr.");
        String doc_name = chr.nextLine();
        System.out.print("Department:");
        String dep_name = chr.nextLine();
        System.out.print("Date of admission:");
        String date_adm = chr.nextLine();
        System.out.print("Date of release:");
        String date_rel = chr.nextLine();
        System.out.print("Nights of stay:");
        int nights = inp.nextInt();
        AccomCheck();//Calling the AccomCheck method
        System.out.print("Room number: ");
        String room = chr.nextLine(); 
        System.out.print("Diagnosis:");
        String diag = chr.nextLine(); 
        int  med_cost = 4500;
        double stay_cost = nights*cost; 
        double service_tax = (12.5 * (stay_cost + med_cost))/100;//Calculates the approx. service tax of 12.5%
        double grand_total = service_tax + stay_cost +  med_cost; //Calculates the approx. final bill 
        System.out.println("Printing bill...");
        Thread.sleep(1500); //Sleeps or pauses the "main" thread for 1500 milliseconds or 1.5 seconds
        //Prints the various parameters in a bill format
        System.out.println("***BILL***");
        System.out.print("Bill No.: "+(rand.nextInt(9000000))); //Prints a random number in the range 0-8999999
        System.out.println("Billed at: "+new java.util.Date()); //Prints the current time
        String m = "Mr.", f= "Ms.";
        String a = (g == 0) ? m : f;
        System.out.println("Patient Name: "+a+pat_name);
        System.out.println("Gender: "+(gender.toUpperCase()));
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
        System.out.println("Doctor's name: Dr."+doc_name);
        System.out.println("Department: "+dep_name);
        System.out.println("Date of admission: "+date_adm);
        System.out.println("Date of release: "+date_rel);
        System.out.println("Nights of stay: "+nights);
        System.out.println("Accomodation type: "+accom);
        System.out.println("Room number: "+room);
        System.out.println("Diagnostics: "+diag);
        System.out.println("Medicine cost: "+ med_cost);
        System.out.println("Stay cost: Rs."+stay_cost+" (No. of nights x "+ac_cost+")");
        System.out.println("Service tax: Rs."+service_tax);
        System.out.println("Grand total: Rs."+grand_total);
        System.out.println("***Thank you for healing with us!***");
    }
}