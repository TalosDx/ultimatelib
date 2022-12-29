package dev.talosdx.ultimatelib.safety.collection;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class MapUtils {

    public static <K, V> boolean isEmpty(Map<K, V> map) {
        return map == null || map.isEmpty();
    }

    public static <K, V> boolean isNotEmpty(Map<K, V> map) {
        return !isEmpty(map);
    }

    public static <K, V> Map.Entry<K, V>[] toArray(Map<K, V> map) {
        //noinspection unchecked
        Map.Entry<K, V>[] array = (Map.Entry<K, V>[]) Array.newInstance(Map.Entry.class, map.size());

        return map
                .entrySet()
                .toArray(array);
    }
}
