package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(10, 15, 15);
        assertThat(result, is(15));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(6, 4, 2);
        assertThat(result, is(6));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(6, 4, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenAllSame() {
        int result = MultiMax.max(7, 7, 7);
        assertThat(result, is(7));
    }
}