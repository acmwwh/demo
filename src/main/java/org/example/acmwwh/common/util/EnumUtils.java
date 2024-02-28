package org.example.acmwwh.common.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.example.acmwwh.common.api.IndexedEnum;

import java.util.Arrays;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EnumUtils {

    public static <E extends Enum<E> & IndexedEnum<E, T>, T> E ofThrowable(Class<E> enumType, T index) {

        return Arrays.stream(enumType.getEnumConstants()).filter(e -> e.getIndex().equals(index)).findAny()
            .orElseThrow(() -> new IllegalArgumentException("No enum constant " + enumType + "." + index));
    }
}
