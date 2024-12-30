package Recursion;

public class increasingOrder {
    
    public static void increasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }else{
            increasing(n-1);
            System.out.println(n);
            
        }
    }
    public static void main(String args[]){
       int n = 10;
        increasing(n);
    }
    
}
