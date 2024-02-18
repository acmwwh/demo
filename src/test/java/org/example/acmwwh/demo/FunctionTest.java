package org.example.acmwwh.demo;

import lombok.extern.slf4j.Slf4j;

import org.example.acmwwh.demo.func.SharedSqlService;
import org.example.acmwwh.demo.func.SqlService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author linfan
 * @description 函数式编程测试类
 * @date 2024/02/18
 */
@Slf4j
@SpringBootTest
public class FunctionTest {

    @Test
    void funcTest() {

        String param1 = "Hello World!";
        Integer param2 = 100;

        log.info("\ngetSelf: \nparam: {}\nresult: {}\n", param1,
            SharedSqlService.sharedSql(SqlService::getSelf, param1));

        log.info("\ngetStr: \nparam: {}\nresult: {}\n", param1 + ", " + param2,
            SharedSqlService.sharedSql(SqlService::getStr, param1, param2));
    }
}
