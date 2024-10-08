package ru.job4j.tracker.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TriangleTest {

    @Test
    void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 8;
        assertThat(result).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void when020and02and08ThenMinus1() {
        Point a = new Point(0, 20);
        Point b = new Point(0, 2);
        Point c = new Point(0, 8);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = -1;
        assertThat(result).isEqualTo(expected, withPrecision(0.001));
    }
}