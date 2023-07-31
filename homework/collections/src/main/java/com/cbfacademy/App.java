package com.cbfacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class App {
   
   
    public static void main(String[] args) {

        CollectionsAssignment collectionsAssignment = new CollectionsAssignment();
        List<String> list = Arrays.asList("Bob", "Alice", "Bob", "Carol", "Bob", "Jane");
        String mostFrequentString = collectionsAssignment.mostFrequent(list);
        
    }
}
