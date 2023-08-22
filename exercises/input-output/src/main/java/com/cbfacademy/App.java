package com.cbfacademy;

import java.io.IOException;

public class App {

    public static void main(String[] args) {
        IO readFile = new IO();
        readFile.readFile();
        readFile.readFileContentUsingIO("exercises/input-output/src/main/resources/exercise.txt");
        readFile.readFileContentUsingIO2();
        readFile.writeFileContentUsingIO("exercises/input-output/src/main/resources/exercise-output.txt");

        readFile.writeFileContentUsingIO2("exercises/input-output/src/main/resources/exercise.txt",
                "exercises/input-output/src/main/resources/exercise-output.txt");

    }
}
