package org.example.acmwwh.demo.func;

/**
 * @author linfan
 * @description 模拟SQL函数
 * @date 2024/02/18
 */
public class SqlService {

    private static final String NIL_MSG = "nil";

    public static <T> T getSelf(T param) {

        return param;
    }

    public static <T> String getStr(T[] params) {

        if (null == params || 0 == params.length) {
            return NIL_MSG;
        }
        StringBuilder result = new StringBuilder();
        for (T param : params) {
            if (null != param) {
                result.append(param);
            } else {
                result.append(NIL_MSG);
            }
            result.append(" ");
        }
        return result.toString();
    }
}
