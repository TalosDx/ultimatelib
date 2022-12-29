package dev.talosdx.ultimatelib.safety.collection;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;
import java.util.Collection;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class CollectionUtils {

    public static <T> boolean isEmpty(Collection<T> collection) {
        return collection == null || collection.isEmpty();
    }

    public static <T> boolean isNotEmpty(Collection<T> collection) {
        return !isEmpty(collection);
    }


    public static <T> T[] toArray(Collection<T> collection, Class<T> typeClass) {
        T[] array = (T[]) Array.newInstance(typeClass, collection.size());

        return collection.toArray(array);
    }
}
