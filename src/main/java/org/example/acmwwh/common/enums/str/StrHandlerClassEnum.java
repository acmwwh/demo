package org.example.acmwwh.common.enums.str;

import org.example.acmwwh.common.util.str.StrHandler;
import org.example.acmwwh.common.util.str.StrLowerHandler;
import org.example.acmwwh.common.util.str.StrReplaceHandler;

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
