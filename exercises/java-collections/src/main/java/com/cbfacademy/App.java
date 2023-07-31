package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        int[] intArr = { 5, 8, 2, 9, 8, 0, 10, 7, 2 };

        float[] floatArr = { 9.8f, 12.5f, 16.0f, 20.4f, 5.0f, 3.7f, 6.8f, 1.3f, 0.4f, 9.2f, 4.8f, 30.6f, 7.3f };

        Double[] doubleArr = { 9.7, 0.4, 5.3, 1.4, 9.0, 5.6 };

        Boolean[] booleanArr = { true, false, false, true, true, false, false };

        CollectionsExercises colExercise = new CollectionsExercises();
        System.out.println(colExercise.useLinkedList());

        System.out.println(colExercise.useArrayDeque());
        colExercise.useStack();

        System.out.println("====================");
        System.out.println(floatArr[12]);
        System.out.println("====================");
        System.out.println(intArr[5]);
        System.out.println(floatArr[5]);
        System.out.println(doubleArr[5]);
        System.out.println(booleanArr[5]);

        Object[][] matrix = { { intArr, floatArr, doubleArr, booleanArr } };

        System.out.println("Hello World!");

    }
}
