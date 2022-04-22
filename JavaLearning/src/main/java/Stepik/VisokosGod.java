// На вход подаются целых три числа - день, месяц и год (по григорианскому календарю).
//Выведите true, если эти числа составляют валидную дату, и false - в противном случае.
package stepik.usloviya;
import java.util.Scanner;
public class VisokosGod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        boolean a;
        if ((y % 4 == 0 && y % 100 != 0 || y % 400 == 0)) {
            a = true; // true- високосный
        } else {
            a = false;
        }
        if ((d < 1 || y < 1 || m < 1 || d > 31 || m > 12)) {
            System.out.println("false");
        } else if ((m == 2 || m == 4 || m == 6 || m == 9 || m == 11) && d > 30) {
            System.out.println("false");
        } else if (a == true && m == 2 && d > 29) {
            System.out.println("false");
        } else if (a == false && m == 2 && d >28) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

    }
}




