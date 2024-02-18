package org.example.acmwwh.demo.func;

/**
 * @author linfan
 * @description 简单的分库逻辑服务类
 * @date 2024/02/18
 */
public class SharedSqlService {

    public static <T> T sharedSql(SqlFunction<T> func, Object... params) {

        T result = null;
        try {
            result = func.apply(params);
        } catch (Exception ex) {
            for (int i = 0; i < 10; i++) {
                result = func.apply(params);
                if (null != result) {
                    break;
                }
            }
        }

        return result;
    }
}
