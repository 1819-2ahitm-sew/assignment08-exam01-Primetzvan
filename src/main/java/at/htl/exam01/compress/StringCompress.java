package at.htl.exam01.compress;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StringCompress {

    private static final String FILE_NAME = "sample.txt";
    Scanner sc = new Scanner(System.in);

    /**
     * Main-Methode, hier wird das StringCompress-Objekt erstellt
     * und die Methoden des Objekts werden aufgerufen
     *
     * @param args
     */
    public static void main(String[] args) {
        StringCompress sc = new StringCompress();
        String[] text = sc.readFromFile(FILE_NAME);
        sc.print(text);
    }


    /**
     * Sämtliche Zeilen werden aus der Textdatei eingelesen
     * zB 5A
     * Nun wird in das String-Array AAAAA geschrieben
     * <p>
     * Bsp Testdatei
     * 5A
     * 3B
     * 4C
     * <p>
     * ergibt eine String-Array mit 3 Elementen
     * AAAAA
     * BBB
     * CCCC
     *
     * @param fileName
     * @return String-Array mit dem entpacktem Text
     */
    public String[] readFromFile(String fileName) {

        int i = getNoOfLines(FILE_NAME);
        String[] fertigeBuchstaben = new String[i];
//        int zahl;
//        String help3;
//        char buchstabe;

        try (Scanner sc = new Scanner(new FileReader(fileName))) {
//            for (int j = 0; j < i; j++) {
//                String eingelesen = sc.nextLine();
//                help3 = eingelesen.substring(1);
//                zahl = Integer.parseInt(help3);
//                buchstabe = eingelesen.charAt(0);
//                for (int x = 0; x < zahl; x++) {
//                    sb.append(buchstabe);
//                }
//                fertigeBuchstaben[j] = sb.toString();
//
//                for (int x = 0; x < zahl; x++) {
//                    sb.append(buchstabe);
//                }
            int lineNo = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                char letter = line.charAt(0);
                String noStr = line.substring(1);
                int zahl = Integer.parseInt(noStr);

                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < zahl; j++) {
                    sb.append(letter);
                }
                fertigeBuchstaben[lineNo] = sb.toString();


                lineNo++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return fertigeBuchstaben;
    }


    /**
     * Der Inhalt des String-Arrays wird zeilenweise auf der Console ausgegeben
     *
     * @param lines String-Array
     */
    public void print(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
        }


    }

    /**
     * Die Anzahl der Zeilen der übergebenen Textdatei wird bestimmt
     *
     * @param fileName
     * @return Anzahl der Zeilen in der Textdatei
     */
    public int getNoOfLines(String fileName) {

        int i = 0;

        try (Scanner sc = new Scanner(new FileReader(fileName))) {
            while (sc.hasNextLine()) {
                sc.nextLine();
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return i;
    }


}
