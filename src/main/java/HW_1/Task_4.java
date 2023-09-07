// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package HW_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи прекрасную строку: ");
        String enterString = scan.nextLine();

        try{
            if (enterString.isEmpty()){
                throw new Exception("Пустая строка, ну как так то?! Обязательно введи строку.");
            }
            System.out.println("Отлично, правильно ввели строку: " + enterString);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}
