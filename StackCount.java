
import java.util.Scanner;
import java.util.Stack;

class StackCount{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     Stack<Integer> sob=new Stack<>();
     while(n>0){
        sob.push(n%10);
        n=n/10;
     }int count=0;
     while(!sob.isEmpty()){
        sob.pop();
        count+=1;

     }
     System.out.println(count);
 }
}