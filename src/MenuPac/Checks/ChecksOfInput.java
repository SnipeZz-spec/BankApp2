package MenuPac.Checks;

import java.util.Scanner;

public class ChecksOfInput {

    //метод ввода и проверки числа int
    public int checkInt() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Некорректный ввод! Повторите попытку");
            sc.next();
        }
        var v = sc.nextInt();
        return v;
    }
}
