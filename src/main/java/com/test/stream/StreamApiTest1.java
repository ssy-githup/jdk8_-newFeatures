package com.test.stream;

/**
 * jdk1.8 最大的两个改变就是 lambda 和 stream api
 *  1：Stream关注的是对数据的运行，与CPU打交道
 *  2：集合关注的是数据的存储，和内存打交道
 *
 *  3：
 *      Stream自己不会存储数据，
 *      Stream不会改变源对象，相反，他会返回一个持有结果的新stream
 *      Stream 操作时延迟的，这意味着他们需要等到结果的时候才能执行 惰性计算
 *  4：中间操作：过滤映射迭代
 *      终止操作
 */
public class StreamApiTest1 {
}
