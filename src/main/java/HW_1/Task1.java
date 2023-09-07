// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

package HW_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float num = floatNumber();
        System.out.println("Ура) Наше дробное число: "+ num);
    }

    public static float floatNumber(){
        System.out.println("ПЖЛ, введите дробное число: ");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextFloat()){
            System.out.println("Ошибочка. Введи дробное число: ");
            scan.next();
        }
        float numb = scan.nextFloat();
        scan.close();
        return numb;
    }
}
