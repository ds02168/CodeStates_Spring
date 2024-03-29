package com.codestates.example;

import reactor.core.publisher.Flux;

import java.util.List;

public class ReactiveGlossaryExample {
    public static void main(String[] args) {
        Flux
                .fromIterable(List.of(1,3,6,7,8,11))
                .filter(number -> number > 4 && (number % 2 == 0))
                .reduce((total, n) -> total + n)
                .subscribe(System.out::println);
    }
}
