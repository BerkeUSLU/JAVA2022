package Week1.miniProjeAsalSayi;

import java.util.Scanner;

// This program only calculates positive prime & non-prime numbers
// Bu program sadece pozitif asal ve asal olmayan sayıları hesaplar.

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = scan.nextInt();
        boolean isPrime = true;
        System.out.println("");
        if (number == 1) {
            isPrime = false;
        }
        if (number < 1) {
            System.out.println("Invalid input!");
            return;
        }
        for (int i = 2;i<number;i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("The given number is prime!");
        }
        else {
            System.out.println("The given number is not prime!");
        }
    }
}
