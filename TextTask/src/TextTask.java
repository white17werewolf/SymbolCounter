import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TextTask {
    public static void main(String[] arg) throws IOException {
        Scanner fileName = new Scanner(System.in);
        System.out.print("Введите название исходного файла: ");
        String inFile = fileName.nextLine();
       /* System.out.print("Введите название файла для записи: ");
        String outFile = fileName.nextLine();*/

        try {
            FileReader flReader = new FileReader(inFile);
            BufferedReader bfReader = new BufferedReader(flReader);
            String strLine = bfReader.readLine().toLowerCase();
            HashMap<Character, Integer> map = new HashMap<Character, Integer>(40);

           for (int i = 0; i < strLine.length(); ++i) {
                    char c = strLine.charAt(i);
                    //  проверяем является ли символ буквой
                    if (Character.isLetter(c)) {
                        if (map.containsKey(c)) {
                            map.put(c, map.get(c) + 1);
                        } else {
                            map.put(c, 1);
                        }
                    }
                }
           map.entrySet().stream()
                   .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                   .forEach(System.out::println);


        }
        /*catch (FileNotFoundException e) {
            System.out.println("Не удается найти файл");
        }*/
        catch (NoSuchElementException e) {
            System.out.println("Входной файл " + inFile + " не содержит корректных данных для обработки.");
            //   System.out.println("Входной файл не содердит кор дан дл-
            //   я об");
        }
    }
}
