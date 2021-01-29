package collections.additionaltask;

import java.io.*;
import java.util.*;

public class SecondPoem {

    public static void main(String[] args) {
        ArrayList<String> poem = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader("SecondPoem.txt"))) {
            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                poem.add(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(poem);

        Collections.sort(poem);
        System.out.println(poem);

    }
}


