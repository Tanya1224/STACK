package STACK;
import java.util.*;
public class QueueUsingStack {
   public static class Queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();
        static void push(int x){
            s1.add(x);
        }
        static int pop(){
            while(s1.isEmpty()){
                return -1;
            }
            while(s1.isEmpty()){
                s2.add(s1.pop());
            }
            int ans=s2.pop();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return ans;
        }
    };
    public static void main(String[] args) {
        Queue q=new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());

    }
}
