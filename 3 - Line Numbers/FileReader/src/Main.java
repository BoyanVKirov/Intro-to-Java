/*Write a program that asks the user for the name of a file. The program should display only the first five lines of
 the file’s contents. If the file contains fewer than five lines, it should display the file’s entire contents.
 Make sure to handle possible errors.*/

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Main {
    public static void main(String[] args) throws IOException {

        final String fileName = "app.properties";

        try (LineNumberReader lineNumberReader
                     = new LineNumberReader(new FileReader("C:/Users/Boyan.Kirov/OneDrive - Adastra, s.r.o/Desktop/procenti gotovnost.docx"))) {

            //Print initial line number
            System.out.println("Line " + lineNumberReader.getLineNumber());

            //Setting initial line number
            lineNumberReader.setLineNumber(5);

            //Get current line number
            System.out.println("Line " + lineNumberReader.getLineNumber());

            //Read all lines now; Every read increase the line number by 1
            String line = null;
            while ((line = lineNumberReader.readLine()) != null) {
                System.out.println("Line " + lineNumberReader.getLineNumber() + ": " + line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        FileReader fr = null;
        LineNumberReader lnr = null;
        int i;

    }
}

