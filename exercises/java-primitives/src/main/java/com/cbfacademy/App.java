package com.cbfacademy;

public class App {
    public static void main(String[] args) {

        float operand1 = 0.3f;
        float operand2 = 0.9f;
        int number1 = 12;
        int number2 = 12;

        ArithmeticExercise exercise = new ArithmeticExercise();

        StringExercises stringExercises = new StringExercises();

        System.out.println(exercise.addFloat(operand1, operand2));
        System.out.println(exercise.substractFloat(operand1, operand2));
        System.out.println(exercise.divideFloat(operand1, operand2));
        System.out.println(exercise.multiplyFloat(operand1, operand2));
        System.out.println("========================");
        System.out.println(operand1 == operand2);
        System.out.println(operand1 < operand2);
        System.out.println(operand2 > operand1);
        System.out.println("========================");
        System.out.println(number1++);
        System.out.println(++number2);
        System.out.println("========================");
        System.out.println(stringExercises.howMany("Hello World", 'l'));

    }
}
