package dev.talosdx.ultimatelib.safety.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    @Test
    void isEmpty() {
        Assertions.assertTrue(() -> ArrayUtils.isEmpty(new String[0]));
    }

    @Test
    void isEmptyCheckNull() {
        //noinspection ConstantConditions
        Assertions.assertTrue(() -> ArrayUtils.isEmpty(null));
    }

    @Test
    void isNotEmpty() {
        Assertions.assertTrue(() -> ArrayUtils.isNotEmpty(new String[] {"1", "4"}));
    }

    @Test
    void isNotEmptyCheckNull() {
        //noinspection ConstantConditions
        Assertions.assertFalse(() -> ArrayUtils.isNotEmpty(null));
    }
}