package zad1;

import java.util.Scanner;

// Napisz program wyliczający silnię podajnej liczby. Wiki.

public class zad1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj cyfrę z której chcesz obliczyć silnię");
        int silnia = sc.nextInt();
        int test = 1;

        for (int i = 1; i <= silnia; i++) {
            test *= i;
        }
        System.out.println("\nWynik silni " + silnia + " to " + test);
    }
}
