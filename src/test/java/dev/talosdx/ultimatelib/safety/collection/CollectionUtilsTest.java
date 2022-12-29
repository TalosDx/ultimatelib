package dev.talosdx.ultimatelib.safety.collection;

import dev.talosdx.ultimatelib.safety.array.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionUtilsTest {

    @Test
    void isEmpty() {
        Assertions.assertTrue(() -> CollectionUtils.isEmpty(Collections.emptyList()));
    }

    @Test
    void isEmptyCheckNull() {
        //noinspection ConstantConditions
        Assertions.assertTrue(() -> CollectionUtils.isEmpty(null));
    }

    @Test
    void isNotEmpty() {
        Assertions.assertTrue(() -> CollectionUtils.isNotEmpty(Arrays.asList("1", "4")));
    }

    @Test
    void isNotEmptyCheckNull() {
        //noinspection ConstantConditions
        Assertions.assertFalse(() -> CollectionUtils.isNotEmpty(null));
    }

    @Test
    void toArray() {
        final List<BigDecimal> decimalList = new ArrayList<>(2);
        decimalList.add(BigDecimal.ZERO);
        final BigDecimal[] decimalArray = CollectionUtils.toArray(decimalList, BigDecimal.class);

        //noinspection ConstantConditions
        Assertions.assertTrue(() -> decimalArray instanceof BigDecimal[]);
        //Throws
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> decimalArray[1] = BigDecimal.TEN);
        //NOT Throws
        Assertions.assertDoesNotThrow(() -> BigDecimal.ZERO.equals(decimalArray[0]));
    }
}