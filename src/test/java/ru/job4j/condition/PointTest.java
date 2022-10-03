package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

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

    @Test
    public void when000to004Then4() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 4);
        double dist = a.distance3d(b);
        double expected = 4.0;
        assertThat(dist).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when040to003Then5() {
        Point a = new Point(0, 4, 0);
        Point b = new Point(0, 0, 3);
        double dist = a.distance3d(b);
        double expected = 5.0;
        assertThat(dist).isCloseTo(expected, offset(0.001));
    }
}