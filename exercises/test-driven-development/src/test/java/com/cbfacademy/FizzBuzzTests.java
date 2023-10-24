package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.stream.Stream;


@DisplayName("The FizzBuzz class should")
public class FizzBuzzTests {
    @ParameterizedTest
    @MethodSource("exerciseArguements")
    @DisplayName("should return number, 'Fizz', 'Buzz'or'FizzBuzz'")

    public void shouldReturnCorrectOutput(Integer value, String expected) {
        final String actual = FizzBuzz.of(value);

        assertThat(actual, is(expected));
    }
        public static Stream<Arguments> exercise1Arguments(){
            return Stream.of(
                    Arguments.of(1, "1"),
                    Arguments.of(3, "Fizz"),
                    Arguments.of(6, "Fizz"),
                    Arguments.of(21, "Fizz")
                    );
        }
}