import java.util.*;
class List{
   public Scanner Sc = new Scanner(System.in);
   class Node{int val; Node next;}
   Node head=null;   
   public void insertfirst(){
        System.out.print("Enter the number to Insert at first : ");
        int num=Sc.nextInt();
        if(head == null){
            Node temp = new Node();
            temp.val=num;
            temp.next=null;
            head = temp;
        }
        else{
            Node temp = new Node();
            temp.val=num;
            temp.next=head;
            head=temp;
        } 
   }    
    public void insertlast(){        
        System.out.print("Enter the number to Insert at last : ");
        int num=Sc.nextInt();
        if(head == null){
            Node temp = new Node();
            temp.val=num;
            temp.next=null;
            head = temp;
        }
        else{
            Node temp = new Node();
            temp.val=num;
            temp.next=null;
            Node t1,t2=null;            
            for(t1=head;t1!=null;t1=t1.next){t2=t1;}                           
            t2.next=temp;
        } 
   }  
   public void removefirst(){
        if(head == null){
            System.out.println("Linked List is Empty!");
            return; 
        }
        else{
            System.out.println("Item Removed : "+head.val);
            head = head.next;                
        }   
   }   
   public void removeparticular(){
        if(head == null){
            System.out.println("Linked List is Empty!");
            return; 
        }
        else{            
            System.out.print("Enter a no to delete : ");
            int n=Sc.nextInt();
            Node t1,t2=null,p,ptr;
            t1=head;
            if(t1.val==n){
               p=t1.next;
               t1=p;
               head=t1;
            }
            else{
                ptr=t1;
                t1=t1.next;
                while(t1!=null){
                    if(t1.val==n){
                        p=t1.next;
                        ptr.next=p;
                        break;
                    }
                    ptr=t1;
                    t1=t1.next;
                }
                if(t1==null){System.out.println("\nMatch not found\n");}
                else{System.out.println("Item Removed successfully!");}
            }          
        }   
   }     
   public void display(){  
    Node temp = head; 
    int sum=0,count=0;
    if(temp==null){
        System.out.println("Linked List is Empty!");
        return;
    }
    System.out.println("\nItems in the List : ");
    while (temp != null){  
        System.out.print(temp.val+" ");  
        sum=sum+temp.val;
        count++;
        temp = temp.next;  
    }  
    System.out.println("\nNo. of Nodes : "+count);  
    System.out.println("Sum of Nodes : "+sum);
   }       
    public static void main(String args[]){
      List L=new List();
      Scanner Sc=new Scanner(System.in);
      boolean t=true;
       while(t){
       System.out.println("\n1. Insert First");
       System.out.println("2. Insert Last");
       System.out.println("3. Remove First");
       System.out.println("4. Remove a Particular Node");
       System.out.println("5. Display List");
       System.out.println("6. Exit");
       System.out.print("Enter your choice : ");
       int n=Sc.nextInt();
       switch(n){
            case 1:L.insertfirst();break;            
            case 2:L.insertlast();break;            
            case 3:L.removefirst();break;            
            case 4:L.removeparticular(); break;
            case 5: L.display(); break;
            case 6: return;
            default:
            System.out.println("\nWrong Choice! Try Again!"); 
       }     
      }
   }   
}
