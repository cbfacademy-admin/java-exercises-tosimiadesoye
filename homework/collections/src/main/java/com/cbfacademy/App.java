package com.cbfacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class App {
   
   
    public static void main(String[] args) {

        CollectionsAssignment collectionsAssignment = new CollectionsAssignment();
        List<String> list = Arrays.asList("Bob", "Alice", "Bob", "Carol", "Bob", "Jane");
        List<Integer> list2 = Arrays.asList(8, 12, 4, 10, 13, 5, 2, 12, 11, 14);
        String mostFrequentString = collectionsAssignment.mostFrequent(list);
        System.out.println(collectionsAssignment.containsDuplicates(list2));
        
    }
}
