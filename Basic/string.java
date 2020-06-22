import java.util.Scanner;
class Strings{
   public static Scanner i = new Scanner(System.in); 
   public static void anagram(){
        System.out.print("\f");
        System.out.print("Enter a word: ");
        String a = i.nextLine();
        int l1=a.length();
        System.out.print("Enter another word(anagram): ");
        String b = i.nextLine();
        int l2=b.length(); int count=0;
        if(l1==l2){
            for(int j=0;j<l1;j++){ 
                for(int k=0;k<l1;k++){
                    if(a.charAt(j) == b.charAt(k)){count++;break;}
                }
            }
            if(count==l1){System.out.print("Yes the strings are anagrams of each other.");}
            else{System.out.print("No the strings aren't anagrams.");}
        }
        else{System.out.print("Strings must be of same length.");}
   }
   public static void pigLatin(){
        System.out.print("\f");
        System.out.print("Enter a word: ");
        String a = i.nextLine();
        a=a.toUpperCase();
        int vowel_pos=0;
        for(int k=0;k<a.length();k++){
            if(a.charAt(k)=='A'||a.charAt(k)=='E'||a.charAt(k)=='I'||a.charAt(k)=='O'||a.charAt(k)=='U'){
                vowel_pos=k;break;
            }
        }
        String new_word = "";
        if(vowel_pos>0){
            new_word = a.substring(vowel_pos,a.length()) + a.substring(0, vowel_pos) + "AY";
        }
        else{new_word = a+ "AY";}
        System.out.print("Piglatin: "+new_word);
   }
   public static void reverse_in_sentence(){
        System.out.print("\f");
        System.out.print("Enter a string: ");
        String s = i.nextLine(); s.trim();
        String store[] = s.split(" ");
        int l = store.length;
        String n = "";
        for(int a=0;a<l;a++){
            for(int k=store[a].length()-1;k>=0;k--){n+=store[a].charAt(k);}
            n+=" ";
        }
        System.out.print("Reversed string is: "+n);
   }
   public static void encodeDecode(){
        System.out.print("\f");
        System.out.print("Enter a string: ");
        String s = i.nextLine();
        s=s.toUpperCase();
        System.out.print("Enter shift index: ");
        int si = i.nextInt();
        String ed="";
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)==' '){ed+=" ";}
            else{
                int n = (int)s.charAt(j) + si;
                ed+=Character.toString((char)n);
            }
        }
        System.out.print("Encoded string is: "+ed);
   }
}
