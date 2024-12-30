package Recursion;

public class descendingOrder {
    public static void descending(int n){
        if(n ==0){
            System.out.println("0");
        }else{
            System.out.print(n+ " ");
            descending(n-1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        descending(n);
    }
}
