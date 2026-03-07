import java.util.*;
class Testcases {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
        int num=sc.nextInt();
        int originalNum = num;
        int reverse = 0;
        while (num != 0) 
        {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        if(originalNum == reverse)
        {
        System.out.println("Palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
        }
    }
}