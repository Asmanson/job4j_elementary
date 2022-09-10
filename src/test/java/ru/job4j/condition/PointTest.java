package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected  = 2;
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when03to40then5() {
        double expected  = 5;
        int x1 = 0;
        int x2 = 3;
        int y1 = 4;
        int y2 = 0;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to11then1() {
        double expected  = 1;
        int x1 = 0;
        int x2 = 1;
        int y1 = 1;
        int y2 = 1;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when50to010then11dot18() {
        double expected  = 11.18;
        int x1 = 5;
        int x2 = 0;
        int y1 = 0;
        int y2 = 10;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}