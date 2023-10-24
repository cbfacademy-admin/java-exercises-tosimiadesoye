package com.cbfacademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
                // System.out.println(line);
            }

            writeFile(filename, file2);
            invertText(file2);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void readFileContentUsingIO(String filePathString) {
        Path filePath = FileSystems.getDefault().getPath(".", filePathString);

        try {
            byte[] byteArray = Files.readAllBytes(filePath);

            String s = new String(byteArray, StandardCharsets.UTF_8);
            // System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void writeFileContentUsingIO(String filePathString) {
        Path filePath = FileSystems.getDefault().getPath(".", filePathString);

        try {
            byte[] byteArray = Files.readAllBytes(filePath);
            System.out.println();
            Path writeFile = Files.write(filePath, byteArray);
            // System.out.println(writeFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readFileContentUsingIO2() {
        String filePath = "exercises/input-output/src/main/resources/exercise.txt";

        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void writeFileContentUsingIO2(String descPath, String sourcePath) {
        try (Stream<String> stream = Files.lines(Paths.get(sourcePath))) {
            Files.write(Paths.get(descPath), (Iterable<String>) stream::iterator,
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void invertFileContent(String sourcePath, String descPath) {
        Path source = Paths.get(sourcePath);
        Path desc = Paths.get(descPath);
    //      Path source = Paths.get(sourcePath);
    // Path desc = Paths.get(descPath);
    // try {
    //     List<String> lines = Files.readAllLines(source);
    //     Collections.reverse(lines);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(descPath));) {

            List<String> lines = Files.readAllLines(source);
            Collections.reverse(lines);
            System.out.println(lines);

            Path newFile = Files.createFile(desc);
            Files.write(newFile, lines);
        } catch (IOException e) {
            // TODO: handle exception
        }

        // try (Stream<String> stream = Files.lines(Paths.get(sourcePath))) {
        // List<String> lines = stream.collect(Collectors.toList());

        // for (int i = lines.size() - 1; i >= 0; i--) {
        // String invertedString = new StringBuffer(lines.get(i)).reverse().toString();
        // byte[] stringToByte = invertedString.getBytes(StandardCharsets.UTF_8);
        // Files.write(Paths.get(descPath), stringToByte);
        // }

        // } catch (IOException e) {
        // e.printStackTrace();
        // }

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
                System.out.println("buffer" + buffer);
                String reverseString = buffer.toString();
                printWriter.println(reverseString);
            }

            printWriter.close();
            // System.out.println("File is copied successful!");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
