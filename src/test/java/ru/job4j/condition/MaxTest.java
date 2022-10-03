package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2To3To4Then4() {
        int number = new Max().max(1, 2, 3, 4);
        int expected = 4;
        assertThat(number).isEqualTo(expected);
    }

    @Test
    public void whenMax4To8To1To4Then8() {
        int number = new Max().max(4, 8, 1, 4);
        int expected = 8;
        assertThat(number).isEqualTo(expected);
    }

    @Test
    public void whenMax0To0To0To0Then0() {
        int number = new Max().max(0, 0, 0, 0);
        int expected = 0;
        assertThat(number).isEqualTo(expected);
    }
}