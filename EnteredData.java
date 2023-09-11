package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EnteredData {
    public String[] enterData() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println();
            System.out.println("Введите через пробел: Фамилия Имя Отчество датарождения номертелефона пол(male/female)");
            String data = scanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("НУ ведь не все данные ввел!");
            } else System.out.println("Вы ввели больше данных, чем положено( !");
        }
    }

}
