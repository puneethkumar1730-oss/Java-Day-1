import java.util.*;
class Vowel{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the letter:");
    char l=sc.next().charAt(0);
      
        if(l=='a' || l=='e' || l=='i' || l=='o' || l=='u')
        {
           System.out.println("vowel"); 
        }
        else
        {
            System.out.println("consonant");
        }
    }
}