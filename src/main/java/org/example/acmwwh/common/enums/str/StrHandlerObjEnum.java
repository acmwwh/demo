package org.example.acmwwh.common.enums.str;

import org.example.acmwwh.common.util.str.StrHandler;
import org.example.acmwwh.common.util.str.StrLowerHandler;
import org.example.acmwwh.common.util.str.StrReplaceHandler;

/**
 * @description 字符串处理对象枚举类
 * @author linfan
 * @date 2023/6/20
 */
public enum StrHandlerObjEnum {
    REPLACE(new StrReplaceHandler()),

    LOWER(new StrLowerHandler());

    private final StrHandler handler;

    StrHandlerObjEnum(StrHandler handler) {
        this.handler = handler;
    }

    public StrHandler getHandler() {
        return this.handler;
    }
}
