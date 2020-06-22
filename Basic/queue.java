import java.util.*;
/* If queue is empty, then front and rear are -1
 * Insertion will be from rear - Enqueue
 * Deletion will be from front - Dequeue
 */
public class Queue1{
    static Scanner sc = new Scanner(System.in);
    static int queue[], front, rear, max;
    public Queue1(int m){
        max = m;
        front = -1;
        rear = -1;
        queue = new int [max];
    }
    static void enqueue()
    {
        if(front ==-1 && rear == -1)
        {
            front = 0;
            rear = 0;
        }
        else if(front!= -1 && rear!=max) 
        rear ++;
        if(rear == max){
            System.out.println("Overflow");
            rear--;
            return;
        }
        System.out.print("Enter element:");
        int x = sc.nextInt();
        queue[rear] = x;
        System.out.print("Element enqued : "+queue[rear]);
    }
    static void dequeue()
    {
        if(front == -1 || front==max)
        {
            System.out.println("Underflow");
            return;
        }
        else if(front == 0 && rear == 0)
        {
            System.out.println("Element dequeued: " + queue[front]);
            front=-1;
            rear=-1;
        }
        
        else{
            System.out.println("Element dequeued: " + queue[front]);
            front ++;
            }
    }
    
    
    void display()
    {
        if(front == -1 && rear == -1 || front==max || rear == max)
        {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue : ");
       for(int i = front; i<=rear; i++)
       {
           System.out.print(queue[i]+" ");
     }
    }
    
    public static void main(String[]args){
      System.out.print("Enter size of the Queue : ");
      int max = sc.nextInt();
      Queue1 ob = new Queue1(max);
      int op = 0;
     do{
         System.out.println("\n1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Display");
        System.out.println("4. Exit");
      System.out.print("Enter option:");
      op = sc.nextInt();
      switch(op){
        case 1: ob.enqueue();
        break;
        case 2: ob.dequeue();
        break;
        case 3: ob.display();
        break;
        case 4: System.out.println("Exit.");
        System.exit(0);
        break;
        default: System.out.println("Wrong input.");
    } 
    }while(op>0);
   }
}
      
    
   
