package org.example.acmwwh.common.util.str;

import org.example.acmwwh.core.exception.BusinessException;

import java.util.Objects;

/**
 * @description 字符串处理抽象类
 * @author linfan
 * @date 2023/6/20
 */
public abstract class StrAbstractHandler implements StrHandler {

    @Override
    public String handler(String str) {
        if (Objects.isNull(str)) {
            throw new BusinessException("string cant be null");
        }
        return doHandler(str);
    }

    protected abstract String doHandler(String str);
}
