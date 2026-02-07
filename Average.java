import java.util.Scanner;

public class Average{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value:");
        int a=sc.nextInt();
        System.out.println("enter b value:");
        int b=sc.nextInt();
        System.out.println("enter c value:");
        int c=sc.nextInt();
        System.out.println("average of three num:");
        float Avg=(a+b+c)/3;
        System.out.println(Avg);
        System.out.println("sum of three num:");
        int sum=a+b+c;
        System.out.println(sum);
        

    }
    
}
