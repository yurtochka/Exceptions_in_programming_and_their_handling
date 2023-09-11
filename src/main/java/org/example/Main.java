package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CheckingData checkingData = new CheckingData();
        String fileName = null;
        WriteFile writeFile = new WriteFile();

        HashMap<String, Object> data = checkingData.checkEnterData();
        while (data.size() != 6) {
            try {
                throw new ErrorData();
            } catch (ErrorData e) {
                data = checkingData.checkEnterData();
            }
        }

        fileName = data.get("lastName") + ".txt";
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }

        System.out.println(data);
        String filePath = fileName;
        System.out.println(filePath);
        writeFile.writeData(String.valueOf(sb), filePath);
    }
}