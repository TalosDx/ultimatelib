package dev.talosdx.ultimatelib.safety.object;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class NumberUtils {

    public static BigDecimal safetyDecimalOf(Double num) {
        String strValue = StringUtils.deepToStringOrDefault(num, "0");

        return new BigDecimal(strValue);
    }

    public static BigDecimal decimalOf(double num) {
        String strValue = String.valueOf(num);

        return new BigDecimal(strValue);
    }
}
