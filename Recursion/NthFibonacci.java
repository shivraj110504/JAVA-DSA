package Recursion;

public class NthFibonacci {
    public static int fiboncci(int n){
        if(n==0 || n==1){
            return n;
        }
        return fiboncci(n-1) + fiboncci(n-2);
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fiboncci(n));
    }
}
