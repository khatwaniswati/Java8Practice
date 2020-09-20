package com.imperativevsdeclarative;

import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.stream.IntStream;

@Slf4j
public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {

        // sum of integers for the range from 0 to 100
        /**
         * Imperative Style - how style of programming
         */
        LocalDateTime start = LocalDateTime.now();
        int sum = 0;
        for (int i = 0; i <= 1000000; i++) {
            sum += i; // shared mutable state and its sequential anf it will go step by step
            // and it will have issues if we try to run the code in multithreaded environment
        }
        LocalDateTime end = LocalDateTime.now();
        Duration diff = Duration.between(start, end);
        long millis = diff.toMillis();
        log.info("Sum is : {} in {} milliseconds", sum, millis);


        /**
         * Declarative style. (Functional programming uses the same style)
         * what style of programming.
         * You let the system do the job for you and get the result.
         */
        start = LocalDateTime.now();
        int sum1 = IntStream.rangeClosed(0, 1000000)
                //.parallel()
                .map(Integer::new)
                .sum();
        end = LocalDateTime.now();
        diff = Duration.between(start, end);
        millis = diff.toMillis();
        log.info("Sum is : {} in {} milliseconds", sum1, millis);

    }
}
