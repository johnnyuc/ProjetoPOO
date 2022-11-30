package modulos.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {

    // Test
    public static void readFromFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
