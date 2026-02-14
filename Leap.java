import java.util.*;
class Leap{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the num :");
    int a=sc.nextInt();
        if(a<=365)
        {
           System.out.println("Not a leap year"); 
        }
        else 
        {
            System.out.println("Leap year");
        }
    }
}