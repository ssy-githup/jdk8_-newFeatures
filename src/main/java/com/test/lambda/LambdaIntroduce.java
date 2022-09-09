package com.test.lambda;

import org.junit.Test;

/**
 * 1:速度更快
 * 2：代码更少
 * 3：强大的StreamApi
 * 便于并行
 * 最大化减少空指针异常 ：Optional
 * Nashorn 引擎，允许在jvm上运行js应用
 */
public class LambdaIntroduce {

    //lambda 新特性

    @Test
    public void testLambda(){

        Runnable run1 = new Runnable() {

            @Override
            public void run() {
                System.out.println(1111);
            }
        };
        run1.run();

        System.out.println("******************");

        Runnable run2 = () -> {
            System.out.println(22);
        };

    }
}
