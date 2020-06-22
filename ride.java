//USACO Problem: ride
/*
ID: aritrok1
LANG: JAVA
TASK: ride
*/
import java.util.*; import java.io.*;
class ride{
  public static void main (String[] args) throws IOException {
    File f1 = new File("ride.in");
    File f2 = new File("ride.out");
    Scanner s1 = new Scanner(f1);
    FileWriter fw = new FileWriter("ride.out", true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter out = new PrintWriter(bw);
    String a[] = new String[2]; int count=0;
    while(s1.hasNextLine()){a[count]=s1.nextLine();System.out.print(a[count]+" "); count++;}
    for(int k=0;k<a.length;k++){System.out.print(a[k]+" ");}
    int ev1=1,ev2=1;
    for(int j=0;j<a[0].length();j++){
        char e1=a[0].charAt(j);
        int asc=((int)e1) - 64; 
        ev1*=asc;
    }
    for(int j=0;j<a[1].length();j++){
        char e2=a[1].charAt(j);
        int asc=((int)e2)-64; 
        ev2*=asc;
    }
    if(ev2%47==ev1%47){out.println("GO");}
    else{out.println("STAY");}
    out.close();
  }
}
