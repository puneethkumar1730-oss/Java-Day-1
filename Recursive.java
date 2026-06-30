class Recursive {
    static int sum(int n){
        if(n==0)
        return 0;
     return (n%10) +sum (n/10);
    }
    public static void main(String[] args) {
        int number=12345;
        System.out.println("sumofdigit="+sum(number));
    }
}  