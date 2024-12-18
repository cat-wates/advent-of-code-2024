package adventofcode2024.day1;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static ArrayList<Integer> readFile(String filePath) { //input file into method
        ArrayList<Integer> fullList = new ArrayList<>();
        InputStream is = ClassLoader.getSystemResourceAsStream(filePath); //reads file as InputStream
        Scanner scanner = new Scanner(is); //scans through IS
        while (scanner.hasNext()) {
            String next = scanner.next();
                fullList.add(Integer.parseInt(next));
        }
        scanner.close();
        return fullList;
    }
}
