package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Факторил какого числа нужно вычеслить?");
	Scanner in = new Scanner(System.in);
	int a=in.nextInt(), fac=1;
	for (int i=1; i<=a; ++i){
	    fac*=i;
    }
	System.out.println("Факториал числа "+a+" = "+fac);
    }
}
