package Practice.PractSession01;

import java.util.Scanner;

public class oddEven{
    public static void main(String args[]){
        // int num = 10;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        scan.close();
        if (num % 2 == 0) {
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}