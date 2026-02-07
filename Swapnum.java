public class Swapnum {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println(a=a*b);
        System.out.println(b=a/b);
        System.out.println(a=a/b);
    temp=a;
    a=b;
    b=temp;
    System.out.println(a);
    System.out.println(b);
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println(a);
    System.out.println(b);

    }
    
}
