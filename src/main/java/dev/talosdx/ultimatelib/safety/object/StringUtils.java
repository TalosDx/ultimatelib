package dev.talosdx.ultimatelib.safety.object;

import dev.talosdx.ultimatelib.safety.array.ArrayUtils;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class StringUtils {

    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean isBlank(String str) {
        return isEmpty(str) || str.matches("[\\s|\\n]+");
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    public static boolean isAnyEmpty(String... strs) {
        if (ArrayUtils.isEmpty(strs))
            return true;

        return Arrays.stream(strs)
                .anyMatch(StringUtils::isEmpty);
    }

    public static boolean isAllEmpty(String... strs) {
        if (ArrayUtils.isEmpty(strs))
            return true;

        return Arrays.stream(strs)
                .allMatch(StringUtils::isEmpty);
    }

    public static boolean isAnyNotEmpty(String... strs) {
        if (ArrayUtils.isEmpty(strs))
            return false;

        return Arrays.stream(strs)
                .anyMatch(StringUtils::isNotEmpty);
    }

    public static boolean isAllNotEmpty(String... strs) {
        if (ArrayUtils.isEmpty(strs))
            return false;

        return Arrays.stream(strs)
                .allMatch(StringUtils::isNotEmpty);
    }

    public static String getOrDefault(String str, String defaultValue) {
        return str == null ? defaultValue : str;
    }

    public static String getOrEmpty(String str) {
        return getOrDefault(str, "");
    }

    public static <T> String toStringOrDefault(T obj, String defaultValue) {
        return obj == null ? defaultValue : obj.toString();
    }

    public static <T> String toStringOrEmpty(T obj) {
        return toStringOrDefault(obj, "");
    }

    public static <T> String deepToStringOrDefault(T obj, String defaultValue) {
        return Optional.ofNullable(obj)
                .map(Object::toString)
                .orElse(defaultValue);
    }

    public static <T> String deepToStringOrEmpty(T obj) {
        return Optional.ofNullable(obj)
                .map(Object::toString)
                .orElse("");
    }
}
