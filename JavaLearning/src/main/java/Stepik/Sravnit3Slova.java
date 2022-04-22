package stepik.usloviya;
import java.util.Scanner;
public class Sravnit3Slova {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int x = a.indexOf(' ');
        String b = a.substring(x + 1);
        int y = b.indexOf(' ');
        String c = b.substring(y + 1);
        String p = b.substring(0, y);
        String o = a.substring(0, x);
        char bc = b.charAt(0);
        char cc = c.charAt(0);
        char oc = o.charAt(0);
        if (bc < cc && bc < oc && cc < oc) {
            System.out.println(p);
            System.out.println(c);
            System.out.println(o);
        } else if (cc < bc && cc < oc && bc < oc) {
            System.out.println(c);
            System.out.println(p);
            System.out.println(o);
        } else if (bc < oc && bc < cc && oc < cc) {
            System.out.println(p);
            System.out.println(o);
            System.out.println(c);
        } else if (cc < bc && cc < oc && oc < bc) {
            System.out.println(c);
            System.out.println(o);
            System.out.println(p);
        } else if (oc < bc && oc < cc && bc < cc) {
            System.out.println(o);
            System.out.println(p);
            System.out.println(c);
        } else if (oc < bc && oc < cc && cc < bc) {
            System.out.println(o);
            System.out.println(c);
            System.out.println(p);
        } else {
            System.out.println("Chto to ne tak");
        }

    }


}
