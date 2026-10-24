package ru.mirea.example;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello,";
        String s2 = " mirea!";
        double x = 284395657;
        int y = 1979;
        int f, g, k, s, i;

        Scanner Begemot = new Scanner(System.in);  //Объект класса Scanner, который складывает f и g
        f = Begemot.nextInt();
        g = Begemot.nextInt();

        Scanner Korovev = new Scanner(System.in);
        k = Korovev.nextInt();
        s = Korovev.nextInt();
        if (s < 0){
            System.out.println("Error!");
        }

        Scanner Gella = new Scanner(System.in);
        i = Gella.nextInt();
        while (i < 10) {
            if (i < 0) {
                System.out.println("Error!");
            }
            System.out.println(i);
            i++;
        }

        int[] ar1 = {1,2,3,4,5,6,7,8,9,232,545,6,57,5,74234,6565,3333};
        int sum = 0;
        int len = ar1.length;
        for (int j = 0; j < ar1.length; j++){
            sum += ar1[j];
            System.out.println(ar1[j] + " ");

        }
        double avg = (double) sum / ar1.length;
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + avg);







        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Введите элементы:");
        int d = 0;
        do {
            arr[d] = sc.nextInt();
            d++;
        } while (d < n);

        int sum2 = 0, min = arr[0], max = arr[0];
        d = 0;
        while (d < n) {
            sum2 += arr[d];
            if (arr[d] < min) min = arr[d];
            if (arr[d] > max) max = arr[d];
            d++;
        }

        System.out.println("Сумма: " + sum2);
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);




        for (int l = 0; l < args.length; l++) {
            System.out.println("Аргумент " + l + ": " + args[l]);
        }






        DecimalFormat fmt = new DecimalFormat("0.0000");
        double sum3 = 0;
        for (int a = 1; a <= 10; a++) {
            sum3 += 1.0 / a;
            System.out.println(fmt.format(sum3));
        }


        System.out.println("sum="+(sum));
        System.out.println("Average="+(sum /len));

        System.out.println("\nh="+(f+g));
        System.out.println("\nL="+(((k%s)*f)-g));
        System.out.println("\n");
        System.out.println(s1+s2);
        System.out.println("\nHello, World!");
        System.out.println("\nz="+((x/y)*y));
        System.out.println("\nNYEHEHEHEHE");
    }
}