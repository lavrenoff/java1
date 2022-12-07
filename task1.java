// Вычислить n-ое треугольного число(сумма чисел от 1 до n)
package jv.seminar1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int numb = in.nextInt();
        int s = 0;

        for (int i = 1; i <= numb; i++) {
            s += i;
        }
        System.out.println("Треугольное число: " + s);
    }
}
