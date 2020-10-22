package ru.mirea.ikbo1619.lab5;

import java.util.Scanner;

public class zadacha3 {
    public int zadachka3()
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = console.nextInt();
        System.out.print("Введите b: ");
        int b = console.nextInt();
        if(aOrb(a,b))
        {
            for(int i=a;i<= b;i++)
            {
                System.out.print(" "+i+" ");
            }
            return 0;
        }
        for(int i=a;i>= b;i--)
        {
            System.out.print(" "+i+" ");
        }
        return 0;

    }
    public boolean aOrb(int a, int b){
        if(a<b)
            return true;
        return false;
    }
}
