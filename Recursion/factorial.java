package Recursion;

public class factorial {
    public static int factorialOfN(int n){
        if(n ==0){
            return 1;
        }
        return n*factorialOfN(n-1);
    }
    public static void main(String[] args) {
        int n = 12;
        System.out.println(factorialOfN(n));
    }
}
