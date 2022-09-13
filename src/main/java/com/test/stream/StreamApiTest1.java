package com.test.stream;

import com.test.common.Employee;
import com.test.common.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * jdk1.8 最大的两个改变就是 lambda 和 stream api
 *  1：Stream关注的是对数据的运行，与CPU打交道
 *  2：集合关注的是数据的存储，和内存打交道
 *
 * 可以执行非常复杂的查找、过滤和映射数据等操作。使用Stream API 对集合数据进行操作
 *
 *  3：
 *      Stream自己不会存储数据，
 *      Stream不会改变源对象，相反，他会返回一个持有结果的新stream
 *      Stream 操作时延迟的，这意味着他们需要等到结果的时候才能执行 惰性计算
 *  4：中间操作：过滤映射迭代
 *      终止操作
 */
public class StreamApiTest1 {

    //1: 创建 Stream方式一：通过集合
    @Test
    public void test(){
        List<Employee> employees = EmployeeData.getEmployees();

//        default Stream<E> stream() :
//        返回一个顺序流
        Stream<Employee> stream = employees.stream();


//        default Stream<E> parallelStream() :
//        返回一个并行流
        Stream<Employee> parallelStream = employees.parallelStream();
    }

    //2: 创建 Stream方式二：通过数组
    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4,5,6};
        //调用Arrays类的static <T> Stream<T> stream(T[] array): 返回一个流
        IntStream stream = Arrays.stream(arr);

        Employee e1 = new Employee(1001,"Hom");
        Employee e2 = new Employee(1002,"Nut");
        Employee[] arr1 = new Employee[]{e1,e2};

        Stream<Employee> stream1 = Arrays.stream(arr1);
    }
    //创建 Stream方式三：通过Stream的of()
    @Test
    public void test3(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
    }

    //创建 Stream方式四：创建无限流
    @Test
    public void test4(){
//      迭代
//      public static<T> Stream<T> iterate(final T seed, final UnaryOperator<T> f)
        //遍历前10个偶数
        Stream.iterate(0, t -> t + 2).limit(10).forEach(System.out::println);

//      生成
//      public static<T> Stream<T> generate(Supplier<T> s)
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }

}
