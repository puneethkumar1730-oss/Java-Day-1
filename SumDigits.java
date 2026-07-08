import java.util.Scanner;
import java.util.Stack;
class SumDigits
{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);  
        Stack<Integer> stack=new Stack<>();
        int n=sc.nextInt();
        while(n>0)
        {
            stack.push(n%10);
            n=n/10;

        }
        int sum=0;
        while(!stack.isEmpty())
        {
            sum=sum+stack.pop();
        }
        System.out.println(sum);
    }
}