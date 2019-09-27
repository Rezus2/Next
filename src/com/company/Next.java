package com.company;

import java.util.Scanner;

public class Next {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int a=x+((x+1)%2)+1;
        System.out.println(a);
    }
}
