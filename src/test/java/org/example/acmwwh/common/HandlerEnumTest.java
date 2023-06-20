package org.example.acmwwh.common;

import lombok.extern.slf4j.Slf4j;
import org.example.acmwwh.common.enums.str.StrHandlerClassEnum;
import org.example.acmwwh.common.enums.str.StrHandlerObjEnum;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class HandlerEnumTest {

    static final String words = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Test
    void objTest() {

        String replaceWords = handlerObjString(StrHandlerObjEnum.REPLACE, words);
        log.info("使用对象枚举方式替换后的值：{}", replaceWords);

        String lowerWords = handlerObjString(StrHandlerObjEnum.LOWER, words);
        log.info("使用对象枚举方式小写后的值：{}", lowerWords);
    }

    @Test
    void classTest() throws Exception {

        String replaceWords = handlerClassString(StrHandlerClassEnum.REPLACE, words);
        log.info("使用反射枚举方式替换后的值：{}", replaceWords);

        String lowerWords = handlerClassString(StrHandlerClassEnum.LOWER, words);
        log.info("使用反射枚举方式小写后的值：{}", lowerWords);
    }

    String handlerObjString(StrHandlerObjEnum objEnum, String words) {
        return objEnum.getHandler().handler(words);
    }

    String handlerClassString(StrHandlerClassEnum objEnum, String words)
            throws InstantiationException, IllegalAccessException {
        return objEnum.getHandler().newInstance().handler(words);
    }
}
