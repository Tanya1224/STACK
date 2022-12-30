package STACK;
import java.sql.PseudoColumnUsage;
import java.util.*;
public class PrevGreater {
    
    public static void previous(int arr[],int n) {
        Stack<Integer> s=new Stack<>();
        s.add(arr[0]);
        for(int i=0;i<n;i++){
            while(s.isEmpty()==false && s.peek()<=arr[i])
            s.pop();
            int p=s.isEmpty()?-1:s.peek();
            System.out.println(p+" ");
            s.add(arr[i]);
        }
    }
      public static void main(String[] args) {
        int[] arr=new int[]{20,30,10,5,15};
        previous(arr, arr.length);
      }
}
