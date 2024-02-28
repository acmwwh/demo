package org.example.acmwwh.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.example.acmwwh.common.consts.IntegerEnum;
import org.example.acmwwh.common.util.EnumUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Slf4j
@SpringBootTest
class EnumTest {

    @Test
    void ofTest() {

        assertEquals(IntegerEnum.A, EnumUtils.ofThrowable(IntegerEnum.class, 1));
        assertThrows(IllegalArgumentException.class, () -> EnumUtils.ofThrowable(IntegerEnum.class, 0));
    }
}
