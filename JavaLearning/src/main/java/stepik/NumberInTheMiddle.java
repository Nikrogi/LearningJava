package main.java.stepik;
//На вход подаётся три целых числа. Выведите среднее из них (т.е. не минимальное и не максимальное).
import java.util.Scanner;
public class NumberInTheMiddle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if ((a >= b && a <= c) || (a <=b && a >= c)) {
            System.out.println(a);
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        }
        }


