package com.cbfacademy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        
        
        List<String> fileNames = Arrays.asList("App.java", "App.txt", null, "App.md");
        
        Map<String, Integer> fileExtentionMap = new HashMap<>();

        for (String fileName : fileNames) {
            try {
                int isJavaFile = new FileExtension().check(fileName);
                fileExtentionMap.put(fileName, isJavaFile);
            } catch (InvalidFileNameException e) {
                fileExtentionMap.put(fileName, -1);
            }
        }
        System.out.println(fileExtentionMap);
    }
}
