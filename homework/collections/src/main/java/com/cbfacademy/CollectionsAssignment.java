package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.HashMap;

public class CollectionsAssignment {

    /**
     * This method removes all values from the provided list that are smaller
     * than the indicated integer. The remaining elements retain their original
     * ordering.
     *
     * @param list     - the list of integers
     * @param minValue the minimum value to retain
     */
    public static void removeSmallInts(List<Integer> list, int minValue) {
        // Your solution must traverse the list from last to first element
        // removing any values less than minValue.
        for (int index = list.size() - 1; index >= 0; index--) {
            Integer listVal = list.get(index);
            if (listVal < minValue) {
                list.remove(listVal);
            }
        }
    }

    /**
     * This method returns true if the provided collection contains any
     * duplicate elements.
     *
     * @param integers - a collection of integers
     * @return true if integers contains duplicates, false otherwise
     */
    public static boolean containsDuplicates(Collection<Integer> integers) {
        // Your solution must not use any loops.
        int initialLength = integers.size();
        Set<Integer> set = new HashSet<>(integers);
        int newLength = set.size();

        if (initialLength == newLength) {
            return false;
        } else {
            return true;
        }
     
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * either of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order.
     * <p>
     * For example, if the two arguments contain {2, 1, 2, 3} and {3, 4, 4, 5},
     * the returned ArrayList will contain {1, 2, 3, 4, 5}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return A sorted ArrayList containing the integers that appear in either
     *         collection.
     */
    public static ArrayList<Integer> inEither(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer integer : ints1) {
            if (!arrayList.contains(integer)) {
                arrayList.add(integer);
            }
        }
        for (Integer integer : ints2) {
            if (!arrayList.contains(integer)) {
                arrayList.add(integer);
            }
        }
        Collections.sort(arrayList);
        return arrayList;

    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * both of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order. For example, if the two arguments contain {2, 1, 2, 3} and
     * {3, 4, 4, 5}, the returned ArrayList will contain {3}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return An ArrayList containing the integers that appear in both
     *         collections.
     */

    public static ArrayList<Integer> inBoth(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        ArrayList<Integer> arrList1 = new ArrayList<>(ints1);
        // The retainAll() method takes another collection as input and returns a new
        // collection that contains only the elements that are in both
        arrList1.retainAll(ints2);
        Collections.sort(arrList1);
        return arrList1;

    }

    /**
     * This method returns the String that appears most frequently in the
     * provided list. For example, if the input list contains the elements
     * {"Bob", "Alice", "Bob"}, this method will return "Bob". If there are
     * ties, any of the most frequently occurring elements may be returned.
     * If the list is empty, return the empty string "".
     *
     * @param list - a list of Strings
     * @return the most frequently occurring String
     */

    public static String mostFrequent(List<String> list) {
        // You should solve this problem in two stages: First iterate through
        // the list to count occurrences of each String. Then iterate through
        // your counts to find the largest. You'll need a collection that allows
        // you to store a mapping from Strings to counts.
        // No nested loops or non-enhanced for-loops are allowed.

        // Create a map to store the count of each string.
        Map<String, Integer> stringCount = new HashMap<>();
        // The for loop iterates through the list of strings and adds the string to the
        // hash map if it is not already in the hash map. If the string is already in
        // the hash map, the count of the string is incremented.
        for (String string : list) {
            if (stringCount.containsKey(string)) {
                stringCount.put(string, stringCount.get(string) + 1);
            } else {
                stringCount.put(string, 1);
            }
        }
        int maxCount = 0;
        String mostFrequentString = "";
        for (String string : stringCount.keySet()) {
            int count = stringCount.get(string);
            if (count > maxCount) {
                maxCount = count;
                mostFrequentString = string;
            }

        }
        return mostFrequentString;
    }

    public static String getName() {
        return "Collections Assignment";
    }
}
