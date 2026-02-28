import java.util.Scanner;

public class Stringmethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.println("enter the string name:"+str1);
        String str2=sc.nextLine();
        System.out.println("enter the another string name:"+str2);
        System.out.println("Length:"+str1.length());
        System.out.println("CharAt:"+str1.charAt(4));
        System.out.println("Uppercase:"+str1.toLowerCase());
        System.out.println("Lowercase:"+str1.toLowerCase());
        System.out.println("equal:"+str1.equals("str"));
        System.out.println("compareTo"+str1.compareTo("str"));
        System.out.println("start with:"+str1.startsWith("str2"));
        System.out.println("end with:"+str1.endsWith("str2"));
        System.out.println("contain:"+str1.contains("punee"));
        System.out.println("substring:"+str1.substring(0,3));
    }
    
}