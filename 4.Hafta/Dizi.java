package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i=0;
        int[] dizi= new int[10];
        Scanner oku=new Scanner(System.in);
        for (i=0; i<10;i++){
            System.out.println("Sayı girin: ");
            dizi[i]=oku.nextInt();
        }
        Arrays.sort(dizi);
        System.out.println(dizi[9]);
    }
}
