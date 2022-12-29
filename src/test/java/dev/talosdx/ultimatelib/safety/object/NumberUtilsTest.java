package dev.talosdx.ultimatelib.safety.object;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class NumberUtilsTest {

    @Test
    void safetyDecimalCheckEquals() {
        BigDecimal actualDecimal = NumberUtils.safetyDecimalOf(0.4D);

        BigDecimal exceptedDecimal = new BigDecimal("0.4");
        Assertions.assertEquals(
                exceptedDecimal,
                actualDecimal
        );
    }

    @Test
    void decimalCheckEquals() {
        BigDecimal actualDecimal = NumberUtils.decimalOf(0.4D);

        BigDecimal exceptedDecimal = new BigDecimal("0.4");
        Assertions.assertEquals(
                exceptedDecimal,
                actualDecimal
        );
    }


    @Test
    void safetyDecimalCheckNull() {
        BigDecimal actualDecimal = NumberUtils.safetyDecimalOf(null);

        BigDecimal exceptedDecimal = BigDecimal.ZERO;
        Assertions.assertEquals(
                exceptedDecimal,
                actualDecimal
        );
    }

    @Test
    void safetyDecimalCheckNotEqualsBrokenDecimal() {
        BigDecimal actualDecimal = NumberUtils.safetyDecimalOf(0.30000000000000004);

        //don't remove "UnpredictableBigDecimalConstructorCall"
        @SuppressWarnings("UnpredictableBigDecimalConstructorCall")
        BigDecimal brokenDecimal = new BigDecimal(0.30000000000000004);
        Assertions.assertNotEquals(
                brokenDecimal,
                actualDecimal
        );
    }

    @Test
    void decimalCheckNotEqualsBrokenDecimal() {
        BigDecimal actualDecimal = NumberUtils.decimalOf(0.30000000000000004);

        //don't remove "UnpredictableBigDecimalConstructorCall"
        @SuppressWarnings("UnpredictableBigDecimalConstructorCall")
        BigDecimal brokenDecimal = new BigDecimal(0.30000000000000004);
        Assertions.assertNotEquals(
                brokenDecimal,
                actualDecimal
        );
    }
}