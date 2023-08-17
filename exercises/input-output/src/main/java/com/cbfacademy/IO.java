package com.cbfacademy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IO {

    public void readFile() {
        String filename = "exercises/input-output/src/main/resources/exercise.txt";
        String filename2 = "exercises/input-output/src/main/resources/exercise-output.txt";
        File file = new File(filename);
        File file2 = new File(filename2);
        String line;

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);

            Files.copy(Paths.get(filename), new FileOutputStream(file2, false));

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            writeFile(filename, file2);
            invertText(file2);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void writeFile(String filename, File file2) {

        try {
            if (!file2.exists() || file2.isDirectory()) {
                Files.copy(Paths.get(filename), new FileOutputStream(file2, false));
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public void invertText(File sourceFile) {
        String targetFile = "exercises/input-output/src/main/resources/inverted.txt";

        try {

            Scanner content = new Scanner(sourceFile);
            PrintWriter printWriter = new PrintWriter(targetFile);

            List<String> lines = new ArrayList<>();
            while (content.hasNextLine()) {
                lines.add(content.nextLine());

            }
            content.close();
            for (int i = lines.size() - 1; i >= 0; i--) {
                String line = lines.get(i);
                StringBuffer buffer = new StringBuffer(line);
                buffer = buffer.reverse();
                String reverseString = buffer.toString();
                printWriter.println(reverseString);
            }

            printWriter.close();
            System.out.println("File is copied successful!");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
