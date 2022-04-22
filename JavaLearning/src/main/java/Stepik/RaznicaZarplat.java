// ООО "Круче Гугла" наняло трёх разработчиков. Внезапно разработчики узнали, что их зарплаты
// различаются. Разработчики решили объявить забастовку, если разница максимальной и минимальной
// зарплаты превысит определённый уровень. Определите, грозит ли ООО "Круче Гугла" забастовка.

//Формат ввода:
//
//В первой строке - зарплаты разработчиков через пробел, три целых числа.
//
//Во второй строке - разница, при превышении которой будет объявлена забастовка.
//
//Формат вывода:
//
//"Ура, бастуем!" - если критический уровень превышен;
//
//"За работу, Солнце ещё высоко" - если критический уровень не превышен.

package stepik.usloviya;
import java.util.Scanner;
public class RaznicaZarplat {
    static int maxZp;
    static int minZp;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstZp = scan.nextInt();
        int secondZp = scan.nextInt();
        int thirdZp = scan.nextInt();
        int raznica = scan.nextInt();

        if (firstZp >= secondZp && firstZp >= thirdZp) {
            maxZp = firstZp;
        } else if (secondZp >= firstZp && secondZp >= thirdZp) {
            maxZp = secondZp;
        } else if (thirdZp >= firstZp && thirdZp >= secondZp) {
            maxZp = thirdZp;
        }
        // определили макс зп

        if (firstZp <= secondZp && firstZp <= thirdZp) {
            minZp = firstZp;
        } else if (secondZp <= firstZp && secondZp <= thirdZp) {
            minZp = secondZp;
        } else if (thirdZp <= firstZp && thirdZp <= secondZp) {
            minZp = thirdZp;
        }
        //определили мин зп
        if ((maxZp - minZp) > raznica) {
            System.out.println("Ура, бастуем!");
        } else {
            System.out.println("За работу, Солнце ещё высоко");
        }
    }
}
