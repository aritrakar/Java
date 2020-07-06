import java.util.Scanner;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
class RailwayManagement{
    public static Scanner i = new Scanner(System.in); //Object reference variable for integer input
    public static Scanner c = new Scanner(System.in);//Object reference variable for character input
    public static Random rand = new Random();
    public static Date date = new Date();
    public static int seat_tot = 100;
    public static int berth_tot = 200;  
    public static Passenger a = new Passenger();
    public static void main(){
        a.cost = 250;
        JOptionPane.showMessageDialog(null, 
        "Welcome to Ark Railways Registration Portal! \n This is designed only for passengers travelling with us."+
        "\n Please enter the choices, when given, as said in the brackets.", "Welcome", JOptionPane.PLAIN_MESSAGE);
        Core();
    }
    public static void Core(){
        System.out.print("\f");
        System.out.print("Enter name: ");
        a.name = c.nextLine();
        int flag = 0;
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
          if(a.choice.equals("Seat") || a.choice.equals("seat") || a.choice.equals("s")){
            seat_tot = seat_tot - 1;
            flag2 = 1; 
            int flag3 = 0;
            while(flag3 != 1){
                System.out.print("Enter preferred class(AC, Non-AC):");
                a.comp = c.nextLine();
                if(a.comp.equals("AC")|| a.comp.equals("ac")){ 
                    if(a.age < 5){
                        flag3 = 1; break;
                    }
                    else if(a.age >=5 && a.age <=11){
                        a.cost = a.cost * 1.5;  
                        flag3 = 1; break;
                    }
                    else if((a.age >=12 && a.age <=59) && (a.gender.equals("M") || a.gender.equals("m"))){
                        a.cost = a.cost * 1.9;  
                        flag3 = 1; break;
                    }
                    else if((a.age >=12 && a.age <=57) && (a.gender.equals("F")|| a.gender.equals("f"))){
                        a.cost = a.cost * 1.7;  
                        flag3 = 1; break;
                    }
                    else if(a.age >=60 && (a.gender.equals("M")|| a.gender.equals("m"))){ //Male senior citizen case
                        a.cost = a.cost * 1.65;  
                        flag3 = 1; break;
                    }
                    else if(a.age >=58 && (a.gender.equals("F")|| a.gender.equals("f"))){//Female senior citizen case
                        a.cost = a.cost * 1.55;  
                        flag3 = 1; break;
                    }
                    flag3 = 1; break;
                }
                else if(a.comp.equals("Non-AC") || a.comp.equals("Non AC") || a.comp.equals("non ac")){ 
                    if(a.age < 5){
                        a.cost = a.cost + 0; // no charge
                        flag3 = 1; break;
                    }
                    else if(a.age >=5 && a.age <=11){
                        a.cost = a.cost * 1.1; 
                        flag3 = 1; break;
                    }
                    else if((a.age >=12 && a.age <=59) && (a.gender.equals("M")|| a.gender.equals("m"))){
                        a.cost = a.cost * 1.5;  
                        flag3 = 1; break;
                    }
                    else if((a.age >=12 && a.age <=57) && (a.gender.equals("F")|| a.gender.equals("f"))){
                        a.cost = a.cost * 1.3;  
                        flag3 = 1; break;
                    }
                    else if(a.age >=60 && (a.gender.equals("M")|| a.gender.equals("m"))){ //Male senior citizen case
                        a.cost = a.cost * 1.25;  
                        flag3 = 1; break;
                    }
                    else if(a.age >=58 && (a.gender.equals("F")|| a.gender.equals("f"))){//Female senior citizen case
                        a.cost = a.cost * 1.15;  
                        flag3 = 1; break;
                    }
                    flag3 = 1; break;
                }
                else {System.out.println("Invaild. PLease try again.");}
            }
            break;
          }
            else if(a.choice.equals("Berth") || a.choice.equals("berth")|| a.choice.equals("b")){  
            berth_tot = berth_tot - 1;
            flag2 = 1; 
            int flag3 = 0;
            while(flag3 != 1){
                System.out.print("Enter preferred class (First, Second, Third):");
                a.comp = c.nextLine();
                if(a.comp.equals("First")|| a.comp.equals("1st")|| a.comp.equals("1ST")|| a.comp.equals("f")){ 
                    if(a.age < 5){
                        a.cost = a.cost + 0; // no charge
                        flag3 = 1; break;
                    }
                    else if(a.age >=5 && a.age <=11){
                        a.cost = a.cost * 1.75;  
                        flag3 = 1; break;
                    }
                    else if((a.age >=12 && a.age <=59) && (a.gender.equals("M")|| a.gender.equals("m"))){
                        a.cost = a.cost * 2;  
                        flag3 = 1; break;
                    }
                    else if((a.age >=12 && a.age <=57) && (a.gender.equals("F")|| a.gender.equals("f"))){
                        a.cost = a.cost * 1.9;  
                        flag3 = 1; break;
                    }
                    else if(a.age >=60 && (a.gender.equals("M")|| a.gender.equals("m"))){ //Male senior citizen case
                        a.cost = a.cost * 1.75;  
                        flag3 = 1; break;
                    }
                    else if(a.age >=58 && (a.gender.equals("F")|| a.gender.equals("f"))){//Female senior citizen case
                        a.cost = a.cost * 1.65;  
                        flag3 = 1; break;
                    }
                    flag3 = 1; break;
                }
                else if(a.comp.equals("Second")|| a.comp.equals("2nd")|| a.comp.equals("2ND")|| a.comp.equals("s")){ 
                    if(a.age < 5){
                        a.cost = a.cost + 0; // no charge
                        flag3 = 1; break;
                    }
                    else if(a.age >=5 && a.age <=11){
                        a.cost = a.cost * 1.65;  
                        flag3 = 1; break;
                    }
                    else if((a.age >=12 && a.age <=59) && (a.gender.equals("M")|| a.gender.equals("m"))){
                        a.cost = a.cost * 1.9;  
                        flag3 = 1; break;
                    }
                    else if((a.age >=12 && a.age <=57) && (a.gender.equals("F")|| a.gender.equals("f"))){
                        a.cost = a.cost * 1.8;  
                        flag3 = 1; break;
                    }
                    else if(a.age >=60 && (a.gender.equals("M")|| a.gender.equals("m"))){ //Male senior citizen case
                        a.cost = a.cost * 1.65;  
                        flag3 = 1; break;
                    }
                    else if(a.age >=58 && (a.gender.equals("F")|| a.gender.equals("f"))){//Female senior citizen case
                        a.cost = a.cost * 1.55;  
                        flag3 = 1; break;
                    }
                    flag3 = 1; break;
                }
                else if(a.comp.equals("Third")|| a.comp.equals("3rd")|| a.comp.equals("3RD")|| a.comp.equals("t")){ 
                    if(a.age < 5){
                        a.cost = a.cost + 0; // no charge
                        flag3 = 1; break;
                    }
                    else if(a.age >=5 && a.age <=11){
                        a.cost = a.cost * 1.55;  
                        flag3 = 1; break;
                    }
                    else if((a.age >=12 && a.age <=59) && (a.gender.equals("M")|| a.gender.equals("m"))){
                        a.cost = a.cost * 1.8;  
                        flag3 = 1; break;
                    }
                    else if((a.age >=12 && a.age <=57) && (a.gender.equals("F")|| a.gender.equals("f"))){
                        a.cost = a.cost * 1.7;  
                        flag3 = 1; break;
                    }
                    else if(a.age >=60 && (a.gender.equals("M")|| a.gender.equals("m"))){ //Male senior citizen case
                        a.cost = a.cost * 1.55;  
                        flag3 = 1; break;
                    }
                    else if(a.age >=58 && (a.gender.equals("F")|| a.gender.equals("f"))){//Female senior citizen case
                        a.cost = a.cost * 1.45;  
                        flag3 = 1; break;
                    }
                    flag3 = 1; break;
                }
                else {System.out.println("Invaild. PLease try again.");}
            }
            break;
            }
            else {System.out.println("Invalid. Please try again.");}
        }
        System.out.print("Enter phone: ");
        a.phone = c.nextLine(); 
        int flag4 = 0;
        while(flag4 != 1){
          System.out.print("Enter destination (Delhi, Bangalore, Mumbai, Hyderabad, Chennai): ");
          a.route = c.nextLine();
          switch(a.route){
             case "Bangalore": 
                int b_flag = 0;
                while(b_flag != 1){
                System.out.println("Choose a route: \n1.Duronto Express 11:00 AM-04:00 PM\n2.Anga Express 11:30 PM-09:05 AM\n3.Yesvantpur Express 10:35 PM-07:15 AM");
                a.train = c.nextLine();
                switch(a.train){
                    case "Duronto Express": case "DE": case "1": a.cost = a.cost + 400; b_flag=1; break;
                    case "Anga Express": case "AE": case "2": a.cost = a.cost + 300; b_flag=1; break;
                    case "Yesvantpur Express": case "YE": case "3": a.cost = a.cost + 350; b_flag=1; break;
                    default: System.out.println("Invalid. Please try again.");
                }
              }
                flag4 = 1; break;
                
             case "Delhi": 
                int d_flag = 0;
                while(d_flag != 1){
                System.out.println("Choose a route: \n1.New Delhi Yuva Express 06:40 PM-11:25 AM\n2.Poorva Express 08:05 AM-07:25 AM \n3.Neelachal Express 12:00 AM-21:40 PM");
                a.train = c.nextLine();
                switch(a.train){
                    case "New Delhi Yuva Express": case "NDYE": case "1": a.cost = a.cost + 250; d_flag=1; break;
                    case "Poorva Express": case "PE": case "2": a.cost = a.cost + 100; d_flag=1; break;
                    case "Neelachal Express": case "NE": case "3": a.cost = a.cost + 150; d_flag=1; break;
                    default: System.out.println("Invalid. pLease try again.");
                }
              }
                flag4 = 1;  break;
                
             case "Mumbai": 
                int m_flag = 0;
                while(m_flag != 1){
                System.out.println("Choose a route: \n1.Mumbai Mail 11:00 PM-11:25 AM \n2.Duronto Express 08:20 AM -10:30 PM \n3.Gitanjali Express 01:50 PM -21:20 PMa");
                a.train = c.nextLine();
                switch(a.train){
                    case "Mumbai Mail": case "MM": case "1": a.cost = a.cost + 450; m_flag=1; break;
                    case "Duronto Express": case "DE": case "2": a.cost = a.cost + 350; m_flag=1; break;
                    case "Gitanjali Express": case "GE": case "3": a.cost = a.cost + 400;m_flag=1; break;
                    default: System.out.println("Invalid. PLease try again.");
                }
              }
                flag4 = 1; break;
                
             case "Hyderabad": 
                int h_flag = 0;
                while(h_flag != 1){
                System.out.println("Choose a route: \n1.Falaknuma Express 07:25 AM-09:35 AM\n2.East Coast Express 08:05-07:25 \n3.Shalimar-Secunderabad Express 12:23 PM -03:00 PM (Next day)");
                a.train = c.nextLine();
                switch(a.train){
                    case "Falaknuma Express": case "FE": case "1": a.cost = a.cost + 300; h_flag=1; break;
                    case "East Coast Express": case "ECE": case "2": a.cost = a.cost + 200; h_flag=1; break;
                    case "Neelachal Express": case "NE": case "3": a.cost = a.cost + 250; h_flag=1; break;
                    default: System.out.println("Invalid. Please try again.");
                }
              }
                flag4 = 1; break;
                
             case "Chennai": 
                int c_flag = 0;
                while(c_flag != 1){
                System.out.println("Choose a route: \n1.Coromandel Express 07:25 AM-09:35 AM\n2.Howrah-Tiruchirapalli Express 04:10-07:55 PM(Next day)");
                a.train = c.nextLine();
                switch(a.train){
                    case "Coromandel Express": case "CE": case "1": a.cost = a.cost + 350; c_flag=1; break;
                    case "Howrah Tirichirapalli Express": case "ECE": case "2": a.cost = a.cost + 250; c_flag=1;break;
                    default: System.out.println("Invalid. Please try again.");
                }
              }
                flag4 = 1; break;
             default: System.out.println("Invalid. Please try again."); 
          }
        }
        Ticket();
    } 
    public static void Ticket(){
        System.out.println("Printing bill...");
        int random = rand.nextInt(900000);
        String m = "Mr.", f= "Ms.";
        String gen = (a.gender.equals("Male")|| a.gender.equals("M") || a.gender.equals("m")) ? m : f;
        JOptionPane.showMessageDialog(null, "Name: "+gen+a.name+"\nAge: "
        +a.age+"\nFrom: Kolkata \nTo: "+a.route+"\nTrain: "+a.train+"\nType: "+a.choice+
        "\nClass: "+a.comp+"\nCost: "+(a.cost=a.cost*1.14)+"\nTicket no.: "+random+"\nPrinted at: "+date.toString()+
        "\nThank you for choosing Ark Rail!", "Bill", JOptionPane.INFORMATION_MESSAGE);
        int flag5 = 0;
        while(flag5 != 1){
          System.out.print("Would you like to book again?");
          String d = c.nextLine();
          if(d.equals("Yes") || d.equals("Y") || d.equals("YES") || d.equals("y")|| d.equals("yes")){ 
              a = null;
              if(seat_tot != 0 || berth_tot != 0){Core();}
              else {JOptionPane.showMessageDialog(null, "Sorry! We're out of seats for this train. Please try again later.");} // If there aren't anymore seats
            } 
          else if(d.equals("No") || d.equals("NO") || d.equals("N") || d.equals("n") || d.equals("no")){flag5 = 1; break;}
          else {System.out.println("Please type Yes or No.");}
        } 
    }
}