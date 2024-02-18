package org.example.acmwwh.demo.func;

/**
 * @author linfan
 * @description Sql语法抽象接口
 * @date 2024/02/18
 */
@FunctionalInterface
public interface SqlFunction<T> {

    /**
     * SQL 函数
     * 
     * @param params
     *            请求参数
     * @return 响应结果
     */
    T apply(Object... params);
}
