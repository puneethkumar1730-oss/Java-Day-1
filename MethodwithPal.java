import java.util.Scanner;

class MethodwithPal {

    boolean display(int num) {
        int originalNum = num;
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        return originalNum == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        MethodwithPal ob = new MethodwithPal();

        boolean result = ob.display(num);

        System.out.println(result);
    }
}