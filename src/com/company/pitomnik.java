package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class pitomnik {
    static Scanner in=new Scanner(System.in);
    static int n= in.nextInt();
    static ArrayList<dog> arrayList=new ArrayList<>();
    static int x=0;
    public static void add(dog dog1) {
        if (x < n) {
            arrayList.add(dog1);
            x++;
        }
        else
            System.out.println("error");
    }

}
