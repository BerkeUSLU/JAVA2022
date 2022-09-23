package Week1.mukemmelSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //6 --> 1,2,3
        //28 --> 1,2,4,7,14
        /*System.out.print("Lütfen bir sayı giriniz : ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int originalNumber = number;
        int sum = 0;
        int i = 1;
        System.out.println("");
        while (number > i) {
            if (number % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        if (number == sum) {
            System.out.println(originalNumber + " mükemmel bir sayıdır!");
        }
        else {
            System.out.println(originalNumber + " mükemmel bir sayı değildir!");
        }*/
        int number = 6;
        int total = 0;
        for(int i = 1;i<number;i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number) {
            System.out.println("Mükemmel sayıdır!");
        }
        else {
            System.out.println("Mükemmel sayı değildir!");
        }
    }
}
