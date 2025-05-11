//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(checkLuckyNumber(29));
        }
        public static void Count(int n) {
        if(n<10){
            System.out.println(n);
            Count(n+1);
        }
        else {
            System.out.println(n);
        }
    }
    public static void stars(int n){
        if (n>0){
            System.out.print("* ");
            stars(n-1);
        }
    }
    public static int fibonacci(int size){
        if(size<=1){
            return size;
        }
            return fibonacci(size-1)+fibonacci(size-2);
    }

    public static int factorial(int n){
        if(n<=1){
            return n;
        }
        return factorial(n-1)*n;
    }

    public static boolean checkLuckyNumber(int n){
        if(n < 4 && n != 0){
            return false;
        }
        else if(n == 0){
            return true;
        }
        return checkLuckyNumber(n-4) || checkLuckyNumber(n-6) || checkLuckyNumber(n-9) || checkLuckyNumber(n-20);
    }
}