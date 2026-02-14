import java.util.*;
class LargeDyn{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
     System.out.println("enter the num :");
    int a=sc.nextInt();
    System.out.println("enter the num :");
    int b=sc.nextInt();
   System.out.println("enter the num :");
    int c=sc.nextInt();
   if(a>b && a>c)
   {
     System.out.println("largest num is a"+a);
   }
   else if (b>a && b>c)
{
    System.out.println("largest num is b"+b);
}
else
{
    System.out.println("largest num is c"+c);
}

}
}