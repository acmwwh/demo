package org.example.acmwwh.demo.strategy;

/**
 * @description 字符串小写处理类
 * @author linfan
 * @date 2023/6/20
 */
public class StrLowerHandler extends StrAbstractHandler {

    @Override
    public String doHandler(String str) {
        return str.toLowerCase();
    }
}
