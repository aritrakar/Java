import java.util.Scanner;
class Array_1D{
    public static Scanner i = new Scanner(System.in);
    public static Scanner c = new Scanner(System.in);
    public static void sort(){
        System.out.print("\f");
        System.out.print("Sorting choice menu:\n1.Numbers\t2.Strings");
        System.out.print("\nEnter your choice: ");
        int choice = i.nextInt();
        switch(choice){
            case 1: num_sort(); break;
            case 2: alpha_sort(); break;
            default: System.out.print("Invalid option."); break;
        }
    }
    public static void num_sort(){
        System.out.print("Enter length of the array: ");
        int l = i.nextInt();
        int a[] = new int[l];
        System.out.println("Please enter values for the array:-");
        for(int j=0;j<l;j++){
            System.out.print("Element "+j+": ");
            a[j] = i.nextInt();
        }
        int temp=0,small=0;  
        for(int x=0;x<l-1;x++){
            small=a[x];
            int pos=x;
            for(int y=x+1;y<l;y++){
                if(a[y]<small){pos=y;small=a[y];}
                temp=a[pos];
                a[pos]=a[x];
                a[x]=temp;
            }
        }
        System.out.print("Printing sorted array: ");
        for(int k=0;k<l;k++){System.out.print(a[k]+" ");}
    }
    public static void alpha_sort(){//PROBLEM: DOESN'T SORT PROPERLY
        System.out.print("Enter a string: ");
        String s = c.nextLine(); s.trim();s+=" ";
        //String c_s = s.toUpperCase();
        int spaces=0;
        for(int k=0;k<s.length();k++){if(s.charAt(k)==' '){spaces++;}}//Count number of words
        String[] w = new String[spaces];
        String[] c = w;
        int count=0;String b="", temp="";
        for(int k=0;k<s.length();k++){//Store words in w[]
            if(s.charAt(k)==' '){w[count]=b;b="";count++;}
            else{b+=s.charAt(k);}
        }
        for(int j=0;j<w.length-1;j++){//Bubble sort
            for(int k=0;k<w.length-1-j;k++){
                if(w[k].compareTo(w[k+1])>0){
                    temp=w[k];
                    w[k]=w[k+1];
                    w[k+1]=temp;
                }
            }
        }
        System.out.print("Printing sorted string: ");
        for(int k=0;k<count;k++){System.out.print(c[k]+" ");}
    }
    public static void duplicate(){
        System.out.print("\f");
        System.out.print("Enter the length of the array 1: ");
        int l1 = i.nextInt(); int a[] = new int[l1];
        System.out.println("Please enter values for the array:-");
        for(int j=0;j<l1;j++){
            System.out.print("Element "+j+": ");  a[j] = i.nextInt();
        }
        System.out.print("Enter the length of the array 2: ");
        int l2 = i.nextInt(); int b[] = new int[l2];
        System.out.println("Please enter values for the array:-");
        for(int j=0;j<l2;j++){
            System.out.print("Element "+j+": "); b[j] = i.nextInt();
        }
        int max = Math.max(l1,l2), min = Math.min(l1,l2);
        int c[] = new int[max]; int count=0;
        for(int j=0;j<min;j++){
            for(int k=0;k<max;k++){
                if(a[j]==b[k]){c[count]=b[k];count++;}
            }
        }
        System.out.print("The common element(s) are: ");
        for(int j=0;j<count;j++){System.out.print(c[j]+" ");}
        int d[] = new int[l1+l2]; count=0;
        for(int j=0;j<l1;j++){d[count]=a[j]; count++;}
        for(int j=0;j<l2;j++){d[count]=b[j];count++;}
    }
    public static void remove_duplicates(){
        System.out.print("\f");
        System.out.print("Enter the length of the array 1: ");
        int l = i.nextInt(); int a[] = new int[l];
        System.out.println("Please enter values for the array:-");
        for(int j=0;j<l;j++){
            System.out.print("Element "+j+": ");  a[j] = i.nextInt();
        }
        for(int j=0;j<l-1;j++){
            for(int k=j+1;k<l;k++){
                if(a[j]==a[k]){l--;for(int n=j;n<l;n++){a[n]=a[n+1];}}
            }
        }
        System.out.println("Printing new array...");
        for(int j=0;j<l;j++){System.out.print(a[j]+" ");}
    }
    public static void int_sort(){//+ve elements appear before -ve ones
        System.out.print("Enter length of the array : ");
        int l1 = i.nextInt();
        int a[] = new int[l1]; int temp=0;
        System.out.println("Please enter values for the array:-");
        for(int j=0;j<l1;j++){
            System.out.print("Element "+j+": ");
            a[j] = i.nextInt();
        }
        int p[] = new int[a.length]; int c1=0;
        int n[] = new int[a.length]; int c2=0;
        for(int j=0; j < a.length; j++){
            if(a[j] > 0){p[c1] = a[j]; c1++;}
            else if(a[j] <= 0){n[c2] = a[j]; c2++;}
        }
        for(int j=0;j<c1-1;j++){//Bubble sort
            for(int k=0;k<c1-1-j;k++){
                if(p[k]<p[k+1]){  temp=p[k];  p[k]=p[k+1];  p[k+1]=temp;}
            }
        }
        for(int j=0;j<c2-1;j++){//Bubble sort
            for(int k=0;k<c2-1-j;k++){
                if(n[k]<n[k+1]){  temp=n[k]; n[k]=n[k+1];  n[k+1]=temp;}
            }
        }
        System.out.println("Printing sorted array...");
        for(int j=0; j<c1; j++){System.out.print(p[j]+" ");}
        for(int j=0; j<c2; j++){System.out.print(n[j]+" ");}
    }
    public static void sum_duplet(){
        System.out.print("Enter length of the array : ");
        int l1 = i.nextInt(); int a[] = new int[l1]; 
        System.out.println("Please enter values for the array:-");
        for(int j=0;j<l1;j++){ System.out.print("Element "+j+": ");  a[j] = i.nextInt(); }
        System.out.print("Enter target value: ");  int t = i.nextInt();
        System.out.println("Suitable values are: "); boolean found=false;
        for(int j=0;j<l1;j++){
            for(int k=j+1;k<l1;k++){
                if(a[j]+a[k]==t){System.out.println("Found: "+a[j]+" and "+a[k]);found=true;}
            }
        }
        if(found==false){System.out.print("None.");}
    }
    public static void sum_triplet(){
        System.out.print("Enter length of the array : ");
        int l1 = i.nextInt();
        int a[] = new int[l1]; 
        System.out.println("Please enter values for the array:-");
        for(int j=0;j<l1;j++){  System.out.print("Element "+j+": ");  a[j] = i.nextInt(); }
        System.out.print("Enter target value: ");  int t = i.nextInt();
        System.out.println("Suitable values are: "); boolean found=false;
        for(int j=0;j<l1;j++){
            for(int k=j+1;k<l1;k++){
                for(int l=k+1;l<l1;l++){
                     if(a[j]+a[k]+a[l]==t){System.out.println("Found: "+a[j]+","+a[k]+" and "+a[l]);found=true; break;}
                }
            }
        }
        if(found==false){System.out.print("None.");}
    }
    public static void longest(){//What to do about 0?
        System.out.print("\f");
        System.out.print("Enter length of the array : ");
        int l1 = i.nextInt();
        int a[] = new int[l1]; int c[] = new int[l1]; int f=0,l2=0;
        System.out.println("Please enter values for the array:-");
        for(int j=0;j<l1;j++){  System.out.print("Element "+j+": ");  a[j] = i.nextInt(); }
        for(int j=0;j<l1-1;j++){
            for(int k=j+1;k<l1;k++){
                if(a[j]-a[k]==1 || a[k]-a[j]==1){c[f]=a[j]; f++; c[f]=a[k]; f++; break;}
            }
        } 
        for(int j=0;j<l1;j++){if(c[j]!=0){l2++;}}
        for(int j=0;j<l1;j++){System.out.print(c[j]+" ");}
        System.out.print("\nLength of longest array of consecutive elements is "+l2);
    }
    public static void average(){//Avg of all elements except largest and smallest
        System.out.print("\f");
        System.out.print("Enter length of the array : ");
        int l = i.nextInt();
        int a[] = new int[l]; 
        System.out.println("Please enter values for the array:-");
        for(int j=0;j<l;j++){  System.out.print("Element "+j+": ");  a[j] = i.nextInt(); }
        int max=a[0],min=a[0], avg=0;
        for(int j=0;j<l;j++){
            if(a[j]>max){max=a[j];}
            else if(a[j]<min){min=a[j];}
            avg+=a[j];
        }
        System.out.println("Max: "+max+" Min: "+min);
        float f = (float)(avg-max-min)/(l-2);
        System.out.print("Average without maximum and minimum elements is "+f);
    }
}
