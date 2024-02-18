package org.example.acmwwh.demo.strategy.reflect;

import org.example.acmwwh.demo.strategy.StrHandler;
import org.example.acmwwh.demo.strategy.StrLowerHandler;
import org.example.acmwwh.demo.strategy.StrReplaceHandler;

/**
 * @description 字符串处理反射枚举类
 * @author linfan
 * @date 2023/6/20
 */
public enum StrHandlerClassEnum {
    REPLACE(StrReplaceHandler.class),

    LOWER(StrLowerHandler.class);

    private final Class<? extends StrHandler> clazz;

    StrHandlerClassEnum(Class<? extends StrHandler> clazz) {
        this.clazz = clazz;
    }

    public Class<? extends StrHandler> getHandler() {
        return this.clazz;
    }
}
