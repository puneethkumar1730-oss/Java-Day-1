import java.util.*;
class Armstrong{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num :");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp!=0)
        {
         int digit=temp%10;
         sum=sum+digit*digit*digit;
         temp=temp/10;
        }
        if(num==sum)
        {
        System.out.println("Armstrong");
        }
        else
        {
        System.out.println("not a Armstrong");
        }
    }
}
