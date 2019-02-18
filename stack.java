import java.util.*;
class Stack
{
    int TOP,MAX=5,p,stk[];
    Stack()
    {
        TOP=-1;
        stk=new int[5];
    }    
    public static void main(String args[])
    {
        Stack S=new Stack();
        Scanner Sc=new Scanner(System.in);
        boolean t=true;
        while(t)
        {
        System.out.println("\n1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.print("Enter your choice : ");
        int n=Sc.nextInt();
        switch(n)
        {
            case 1:
            S.push();
            break;
            
            case 2:
            S.pop();
            break;
            
            case 3:
            S.display();
            break;
            
            case 4:
            return;
                       
            default:
            System.out.println("\nWrong Choice! Try Again!"); 
        }     
    }
}

void push()
{
   ++TOP;
   if(TOP==MAX)
   {    
       System.out.print("\nStack Overflow! Cannot Add more item!");
       TOP--;
       return;
   }    
   Scanner Sc=new Scanner(System.in);
   System.out.print("Enter the number to Push : ");
   int n=Sc.nextInt(); 
   stk[TOP]=n;
   System.out.println("Number Pushed!");
}   

void pop()
{
    if(TOP==-1)
    {    
       System.out.println("Stack Underflow! Cannot Remove item!");
       return;
    } 
   System.out.println("\nElement Popped up : "+stk[TOP]);
   TOP--;
}

void display()
{
    System.out.println("\nItems in the Stack : ");
    if(TOP==-1)
    {
        System.out.println("Stack Empty!");
        return;
    }        
    for(int i=TOP;i>=0;i--)
    System.out.println(stk[i]);
}
}
