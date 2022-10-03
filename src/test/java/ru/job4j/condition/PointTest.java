package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test
    public void when00to02then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        double expected = 2.0;
        assertThat(dist).isEqualTo(expected);
    }

    @Test
    public void when40to03then5() {
        Point a = new Point(4, 0);
        Point b = new Point(0, 3);
        double dist = a.distance(b);
        double expected = 5.0;
        assertThat(dist).isEqualTo(expected);
    }
}