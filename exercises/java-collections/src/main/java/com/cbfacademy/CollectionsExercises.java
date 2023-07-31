package com.cbfacademy;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {

        // TODO: create an empty linked list
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        // - add 4 as the first element of the list
        intLinkedList.add(0, 4);
        // - then add 5, 6, 8, 2, 9 to the the list
        intLinkedList.add(5);
        intLinkedList.add(6);
        intLinkedList.add(8);
        intLinkedList.add(2);
        intLinkedList.add(9);
        // - add another 2 as the last element of the list
        intLinkedList.add(2);
        // - add 4 as the 3rd element of the list
        intLinkedList.add(2, 4);
        // - invoke the method element() on the list and print the result on the screen
        System.out.println(intLinkedList.element());
        // - return the list
        return intLinkedList;

    }

    public Stack<Integer> useStack() {
        Integer[] arr = { 5, 6, 8, 9 };
        List<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
        // TODO: create an empty stack
        Stack<Integer> stack = new Stack<Integer>();
        // - add 5, 6, 8, 9 to the the stack
        stack.addAll(0, arrList);
        // - print the first element of the stack on the screen
        System.out.print(stack.firstElement());
        // - print the last element of the stack on the screen
        System.out.print(stack.lastElement());
        // - invoke the method pop() on the stack and print the result on the screen
        System.out.print(stack.pop());
        // - invoke the push(4) method on the stack
        stack.push(4);
        // - return the stack
        return stack;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        // - add 5, 6, 8, 9 to the the stack
        deque.add(5);
        deque.add(6);
        deque.add(8);
        deque.add(9);
        // - print the first element of the queue on the screen
        System.out.print(deque.getFirst());
        // - print the last element of the queue on the screen
        System.out.print(deque.getLast());
        // - invoke the method poll() on the queue and print the result on the screen
        System.out.print(deque.poll());
        // - invoke the element() method on the queue and print the result on the screen
        System.out.print(deque.element());
        // - return the queue
        return deque;
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        HashMap<Integer, String> hashMap = new HashMap<>();
        // - add {1, TypeScript} entry to the map
        hashMap.put(1, "TypeScript");
        // - add {2, Kotlin} entry to the map
        hashMap.put(2, "Kotlin");
        // - add {3, Python} entry to the map
        hashMap.put(3, "Python");
        // - add {4, Java} entry to the map
        hashMap.put(4, "Java");
        // - add {5, JavaScript} entry to the map
        hashMap.put(5, "JavaScript");
        // - add {6, Rust} entry to the map
        hashMap.put(6, "Rust");
        // - determine the set of keys from the map and print it on the screen
        System.out.print(hashMap.keySet());
        // - determine the set of keys from the map and print it on the screen
        System.out.print(hashMap.values());
        // - determine whether the map contains "English" as a language and print the
        // result on the screen
        System.out.print(hashMap.containsValue("English"));
        // - return the map
        return hashMap;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
