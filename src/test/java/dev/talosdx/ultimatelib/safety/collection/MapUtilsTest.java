package dev.talosdx.ultimatelib.safety.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapUtilsTest {

    @Test
    void isEmpty() {
        Assertions.assertTrue(() -> MapUtils.isEmpty(new HashMap<>()));
    }

    @Test
    void mapNullIsEmptyTrue() {
        Assertions.assertTrue(() -> MapUtils.isEmpty(null));
    }

    @Test
    void isNotEmpty() {
        Assertions.assertTrue(() -> {
            Map<String, String> catMap = Collections.singletonMap("Boris", "Black Cat");
            return MapUtils.isNotEmpty(catMap);
        });
    }

    @Test
    void toArray() {
        final Map<String, Double> catWeightMap = new LinkedHashMap<>();
        catWeightMap.put("Boris", 5.41);
        catWeightMap.put("Super Barsik", 4.38);
        catWeightMap.put("The Cat", 4.41);
        Map.Entry<String, Double>[] entries = MapUtils.toArray(catWeightMap);


        //noinspection ConstantConditions
        Assertions.assertTrue(() -> entries instanceof Map.Entry[]);
        //Throws
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> entries[4].getValue());
        //NOT Throws
        Assertions.assertDoesNotThrow(() -> entries[0].getValue() == 5.41);
    }
}