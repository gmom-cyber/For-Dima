package ru.mirea.ikbo1619.lab5;

import java.util.Scanner;

public class zadacha1 {
    public void zadacha1()
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = console.nextInt();
        int c;

        for (int k =1; k<=n;k++){
            c = k;
            while(c!=0)
            {
                System.out.print(" "+k+" ");
                c--;
            }

        }
    }
}
