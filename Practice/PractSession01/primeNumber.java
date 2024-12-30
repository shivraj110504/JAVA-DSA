package Practice.PractSession01;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        scan.close();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return;
            }
        }
        System.out.println("Number is Prime");
    }
}
