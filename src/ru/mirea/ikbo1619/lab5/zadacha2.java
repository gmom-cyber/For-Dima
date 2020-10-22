package ru.mirea.ikbo1619.lab5;

import java.util.Scanner;

public class zadacha2 {
    public void zadachaka2()
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = console.nextInt();
        for(int i=1; i<=n;i++){
            System.out.print(" "+i+" ");
        }
    }
}
