package org.example.acmwwh.common.consts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.acmwwh.common.api.IndexedEnum;

@Getter
@AllArgsConstructor
public enum IntegerEnum implements IndexedEnum<IntegerEnum, Integer> {

    A(1)
    ;

    private final Integer index;
}
