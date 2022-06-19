// Mortgage calculator
//Author : Shivang Kansal
//formula used below
/*
          r(1 + r)^n
  M = P ---------------
          [(1+r)^n]-1

  M : Mortgage
  P : Principal
  r : rate per annum
  n : time period

*/

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double principal;
        double rate;
        int time;
        double mortgage;

        System.out.print("Principal : ");
        Scanner scanner = new Scanner(System.in);
        principal = scanner.nextLong();


        System.out.print("Annual Interest Rate : ");
        Scanner scanner1 = new Scanner(System.in);
        rate = scanner1.nextDouble();


        System.out.print("Period (Years) : ");
        Scanner scanner2 = new Scanner(System.in);
        time = scanner2.nextInt();


        double R = (rate / 12);
        double R1 = (R/100);                    // r            formula reference
        double R2 = (R1 + 1);                   // (1+r)        formula reference

        int n = (time*12);                      // n            formula reference

        double r = Math.pow(R2,n);              // (1+r)^n      formula reference

        mortgage = principal*(R1 * r/(r - 1));

        String amount = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage : " + amount);
    }
}
