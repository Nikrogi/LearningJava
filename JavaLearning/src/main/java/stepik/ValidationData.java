// На вход подаются целых три числа - день, месяц и год (по григорианскому календарю).
//Выведите true, если эти числа составляют валидную дату, и false - в противном случае.
package main.java.stepik;
import java.util.Scanner;
public class ValidationData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        boolean a; //проверка на високосный год
        if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            a = true; // true- високосный
        } else {
            a = false;
        }
        if ((day < 1 || year < 1 || month < 1 || day > 31 || month > 12)) {
            System.out.println("false");
        } else if ((month == 2 || month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            System.out.println("false");
        } else if (a && month == 2 && day > 29) {
            System.out.println("false");
        } else if (!a && month == 2 && day >28) {
            System.out.println("Invalid date");
        } else {
            System.out.println("Valid date");
        }
    }
}




