package org.example.acmwwh.demo.strategy.instance;

import org.example.acmwwh.demo.strategy.StrHandler;
import org.example.acmwwh.demo.strategy.StrLowerHandler;
import org.example.acmwwh.demo.strategy.StrReplaceHandler;

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
