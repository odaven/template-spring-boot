package com.example.templatespring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumTest {

    @Test
    void test() {
        var sum = new Sum();

        assertEquals(3, sum.sum(1, 2));
    }
}
