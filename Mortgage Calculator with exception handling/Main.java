// Mortgage calculator
//Author : Shivang Kansal

/* Formula used below

          r(1 + r)^n
  M = P ---------------
          [(1+r)^n]-1
          
  M : Mortgage
  P : Principal
  r : rate per annum
  n : time period      */

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double principal;
        double rate;
        int time;
        double mortgage;

        while(true) {
            System.out.print("Principal ($1K to $1M): ");
            Scanner scanner = new Scanner(System.in);
            principal = scanner.nextLong();
            if(principal >= 1_000 && principal <=1_000_000)
                break;
            else
                System.out.println("Enter a number between 1,000 and 1,000,000.");
                continue;
        }

        while (true) {
            System.out.print("Annual Interest Rate : ");
            Scanner scanner1 = new Scanner(System.in);
            rate = scanner1.nextDouble();
            if(rate > 0 && rate <= 30)
                break;
            else
                System.out.println("Enter a value greater than 0 and less than or equal to 30.");
            continue;
        }

        while (true) {
        System.out.print("Period (Years) : ");
        Scanner scanner2 = new Scanner(System.in);
        time = scanner2.nextInt();
            if(time >= 1 && time <= 30)
                break;
            else
                System.out.println("Enter a value between 1 and 30.");
            continue;
        }


        double R = (rate / 12);
        double R1 = (R/100);                    // r            formula reference
        double R2 = (R1 + 1);                   // (1+r)        formula reference

        int n = (time*12);                      // n            formula reference

        double r = Math.pow(R2,n);              // (1+r)^n      formula reference

        mortgage = principal*(R1 * r/(r - 1));

        String amount = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage : " + amount + "\n");
    }
}
