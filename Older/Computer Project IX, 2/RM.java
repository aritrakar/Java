import java.util.Scanner;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
class RM{
    public static Scanner i = new Scanner(System.in); //Object reference variable for integer input
    public static Scanner c = new Scanner(System.in);//Object reference variable for character input
    public static Random rand = new Random();
    public static Date date = new Date();
    public static int seat_tot = 40;
    public static int berth_tot = 80; //Assuming that above every seat are 2 berths
    public static boolean des = true; 
    public static Passenger a = new Passenger();
    public static void main(){
       /*while(des == true){
          Passenger a = new Passenger(); //HOW DO I MAKE THIS PUBLIC?
          Core() ;   
        } */
        Core();
    }
    public static void Core(){
        System.out.print("\f");
        System.out.print("Enter name: ");
        a.name = c.nextLine(); //Can't find variable "a" because it's declaration isn't public
        int flag= 0;
        while(flag != 1){
          System.out.print("Enter age: ");
          a.age = i.nextInt(); 
          if(a.age >= 0 && a.age <= 116){flag = 1;} else {System.out.println("Invalid. Please try again.");}
        }
        int flag1= 0;
        while(flag1 != 1){
          System.out.print("Enter gender: ");
          a.gender = c.nextLine(); 
          switch(a.gender){
              case "Male": case "M": case "m": case "male": flag1 = 1; break;
              case "Female": case "F": case "f": case "female": flag1 = 1; break;
              default: System.out.println("Invalid. Please try again."); 
          }
        }
        int flag2 = 0;
        while(flag2 != 1){
          System.out.print("Do you want a berth or a seat?(Berth/Seat)");
          a.choice = c.nextLine();
          if(a.choice.equals("Seat") || a.choice.equals("seat")){
             seat_tot = seat_tot - 1;
             flag2 = 1; 
             break;
          }
          else if(a.choice.equals("Berth") || a.choice.equals("berth")){  
             berth_tot = berth_tot - 1;
             flag2 = 1; 
             break;
          }
          else {System.out.println("Invalid. Please try again.");}
        }
        int flag3 = 0;
        while(flag3 != 1){
          
          System.out.print("Enter preferred class(First,Chair Car,Sleeper):");
          a.comp = c.nextLine();
          if(a.comp.equals("First")|| a.comp.equals("FR")|| a.comp.equals("fr")){ 
              if(a.age < 5){
                a.cost = a.cost + 0; // no charge
                flag3 = 1; break;
              }
              else if(a.age >=5 && a.age <=11){
                a.cost = a.cost; //+ something
                flag3 = 1; break;
              }
              else if((a.age >=12 && a.age <=59) && a.gender.equals("M")){
                a.cost = a.cost; //+ something
                flag3 = 1; break;
              }
              else if((a.age >=12 && a.age <=57) && a.gender.equals("F")){
                a.cost = a.cost; //+ something
                flag3 = 1; break;
              }
              else if(a.age >=60 && a.gender.equals("M")){ //Male senior citizen case
                a.cost = a.cost; //+ something
                flag3 = 1; break;
              }
              else if(a.age >=58 && a.gender.equals("F")){//Female senior citizen case
                a.cost = a.cost; //+ something
                flag3 = 1; break;
              }
              //flag3 = 1; break;
            }
          else if(a.comp.equals("Chair Car")|| a.comp.equals("CC")|| a.comp.equals("cc")){ 
              if(a.age < 5){
                a.cost = a.cost + 0; // no charge
                flag3 = 1; break;
              }
              else if(a.age >=5 && a.age <=11){
                a.cost = a.cost; //+ something
                flag3 = 1; break;
              }
              else if((a.age >=12 && a.age <=59) && a.gender.equals("M")){
                a.cost = a.cost; //+ something
                flag3 = 1; break;
              }
              else if((a.age >=12 && a.age <=57) && a.gender.equals("F")){
                a.cost = a.cost; //+ something
                flag3 = 1; break;
              }
              else if(a.age >=60 && a.gender.equals("M")){ //Male senior citizen case
                a.cost = a.cost; //+ something
                flag3 = 1; break;
              }
              else if(a.age >=58 && a.gender.equals("F")){//Female senior citizen case
                a.cost = a.cost; //+ something
                flag3 = 1; break;
              }
              //flag3 = 1; break;
            }
          else if(a.comp.equals("Sleeper")|| a.comp.equals("SL")|| a.comp.equals("sl")){ 
              if(a.age < 5){
                a.cost = a.cost + 0; // no charge
                flag3 = 1; break;
              }
              else if(a.age >=5 && a.age <=11){
                a.cost = a.cost; //+ something
                flag3 = 1; break;
              }
              else if((a.age >=12 && a.age <=59) && a.gender.equals("M")){
                a.cost = a.cost; //+ something
                flag3 = 1; break;
              }
              else if((a.age >=12 && a.age <=57) && a.gender.equals("F")){
                a.cost = a.cost; //+ something
                flag3 = 1; break;
              }
              else if(a.age >=60 && a.gender.equals("M")){ //Male senior citizen case
                a.cost = a.cost; //+ something
                flag3 = 1; break;
              }
              else if(a.age >=58 && a.gender.equals("F")){//Female senior citizen case
                a.cost = a.cost; //+ something
                flag3 = 1; break;
              }
              //flag3 = 1; break;
            }
          else {System.out.println("Invaild. PLease try again.");}
        }
        System.out.print("Enter phone: ");
        a.phone = c.nextLine(); 
        int flag4 = 0;
        while(flag4 != 1){
          System.out.print("Enter destination(Delhi, Bangalore, Mumbai, Hyderabad): ");
          a.route = c.nextLine();
          switch(a.route){
             case "Bangalore": flag4 = 1; break;
             case "Delhi": flag4 = 1;  break;
             case "Mumbai": flag4 = 1; break;
             case "Hyderabad": flag4 = 1; break;
             default: System.out.println("Invalid. Please try again."); //break;
          }
        }
        Ticket();
    } 
    public static void Ticket(){
        int random = rand.nextInt(900000);
        String m = "Mr.", f= "Ms.";
        String gen = (a.gender.equals("Male")|| a.gender.equals("M") || a.gender.equals("m")) ? m : f;
        System.out.println();
        System.out.println("***Ticket***");
        System.out.println("Name: "+gen+a.name);
        System.out.println("Age: "+a.age);
        System.out.println("From: Kolkata");
        System.out.println("To: "+a.route);
        System.out.println("Type: "+a.choice); 
        System.out.println("Class: "+a.comp);
        System.out.println("Cost: ");
        System.out.println("Ticket no.: "+random);
        System.out.println("Printed at: "+date.toString());
        System.out.println("***Thank you for choosing Ark Rail!***");
        //System.out.println("**************************************");
        int flag5 = 0;
        while(flag5 != 1){
          System.out.print("Would you like to book again?");
          String d = c.nextLine();
          if(d.equals("Yes") || d.equals("Y") || d.equals("YES") || d.equals("y")|| d.equals("yes")){flag5 = 1;}
          else if(d.equals("No") || d.equals("NO") || d.equals("N") || d.equals("n") || d.equals("no")){des = false; flag5 = 1;}
          else {System.out.println("Please type Yes or No.");}
        }
    }
}