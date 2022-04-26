package main.java.stepik;
import java.util.Scanner;
public class ThreeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String threeWords = scan.nextLine();
        int x = threeWords.indexOf(' ');
        String twoWords = threeWords.substring(x + 1);
        int y = twoWords.indexOf(' ');
        String thirdWord = twoWords.substring(y + 1);
        String firstWord = threeWords.substring(0, x);
        String secondWord = twoWords.substring(0, y);
        char bc = secondWord.charAt(0); //получаем значение каждой первой буквы каждого слова
        char cc = thirdWord.charAt(0);//для последующего сравнения
        char oc = firstWord.charAt(0);
        if (bc < cc && bc < oc && cc < oc) {
            System.out.println(secondWord);
            System.out.println(thirdWord);
            System.out.println(firstWord);
        } else if (cc < bc && cc < oc && bc < oc) {
            System.out.println(thirdWord);
            System.out.println(secondWord);
            System.out.println(firstWord);
        } else if (bc < oc && bc < cc && oc < cc) {
            System.out.println(secondWord);
            System.out.println(firstWord);
            System.out.println(thirdWord);
        } else if (cc < bc && cc < oc && oc < bc) {
            System.out.println(thirdWord);
            System.out.println(firstWord);
            System.out.println(secondWord);
        } else if (oc < bc && oc < cc && bc < cc) {
            System.out.println(firstWord);
            System.out.println(secondWord);
            System.out.println(thirdWord);
        } else if (oc < bc && oc < cc && cc < bc) {
            System.out.println(firstWord);
            System.out.println(thirdWord);
            System.out.println(secondWord);
        }
    }
}

