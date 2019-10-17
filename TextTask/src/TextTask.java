import javax.management.ImmutableDescriptor;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class TextTask {
    public static void main(String[] arg) throws IOException {
        Scanner fileName = new Scanner(System.in);
        System.out.print("Введите название исходного файла: ");
        String inFile = fileName.nextLine();
        System.out.print("Введите название файла для записи: ");
        String outFile = fileName.nextLine();


        //File file = new File("Out");



        ///
        PrintWriter writer = new PrintWriter(new File (outFile));


        try {
            FileReader flReader = new FileReader(inFile);
            BufferedReader bfReader = new BufferedReader(flReader);
            String strLine = bfReader.readLine().toLowerCase();
            Map<Character, Integer> map = new HashMap<Character, Integer>(40);

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




            List<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet());
            entries.sort(new Comparator<Map.Entry<Character, Integer>>() {
                public int compare(Map.Entry<Character, Integer> a, Map.Entry<Character, Integer> b) {
                    return a.getValue().compareTo(b.getValue());
                }
            });
            Map<Character, Integer> sortedMap = new LinkedHashMap<>();
            for (Map.Entry<Character, Integer> entry : entries) {
                sortedMap.put(entry.getKey(), entry.getValue());

            }

           /* map.entrySet().stream()
                    .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                    //.forEach(writer.write("Буква \"" + Map.Entry.<Character, Integer>comparingByKey() + "\" повторяется " + Map.Entry.<Character, Integer>comparingByValue() + " раз \n"));

*/
            for(Map.Entry<Character, Integer> entry: sortedMap.entrySet())
            {
                        writer.write("Буква \"" + entry.getKey() + "\" повторяется " + entry.getValue() + " раз \n");
            }
            writer.flush();




           /*  NO WORK
            for(Map.Entry<Character, Integer> entry: map.entrySet())
            {
                //propertiesHM.put(entry.getKey(), entry.getValue());
                writer.write(Thread.currentThread().getName() + ":" + entry.getKey() + ":" + entry.getValue() + "\n");
            }*/


        }

        catch (FileNotFoundException e) {
            System.out.println("Не удается найти файл");
        }
        catch (NoSuchElementException e) {
            System.out.println("Входной файл " + inFile + " не содержит корректных данных для обработки.");
            //   System.out.println("Входной файл не содердит кор дан дл-
            //   я об");
        }
    }
}
