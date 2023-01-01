package STACK;
import java.util.*;
class Queue{
    static private int size,cap,front;
    static private int arr[];
    Queue(int c)
    {
        cap=c;
        size=0;
        arr=new int[cap];
    }
    public static  void enqueue(int x){
        if(isFull())return ;
        arr[size]=x;
        size++;
        
        System.out.println(x+" "+"enqueue");

        }
        public static  void dequeue(){
            if(isEmpty())return;
           
            for(int i=0;i<size-1;i++)
                arr[i]=arr[i+1];
            
            size--;
             System.out.println("dequeue");
           
        }
        public static  int getFront(){
            if(isEmpty()) return -1;
            else return 0;
        }
       public static   int getrear(){
            if(isFull())return -1;
            else return size-1;
        }
        public static   boolean isEmpty(){return size==0;}
        public static   boolean isFull()
        {
            return (size==cap);
        }
}
public class QueueImple {
    public static void main(String[] args) {
        Queue q=new Queue(5);
q.enqueue(10);
q.enqueue(20);
q.enqueue(20);
q.enqueue(40);

q.dequeue();
System.out.println(q.getFront());
System.out.println(q.getrear());
}
}
