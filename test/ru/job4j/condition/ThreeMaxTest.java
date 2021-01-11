package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ThreeMaxTest {
    @Test
    public void firstMax() {
        int rsl = ThreeMax.max(10, 10, 1);
        assertThat(rsl, is(10));
    }
}