package com.test.stream;

import com.test.common.Employee;
import com.test.common.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/** Stream的中间操作：映射 */
public class StreamApiTestOperator2 {
  /**
   * map(Function f) 接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素。
   * mapToDouble(ToDoubleFunction f) 接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的DoubleStream。
   * mapToInt(ToIntFunction f) 接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的IntStream。
   * mapToLong(ToLongFunction f) 接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的LongStream。
   * flatMap(Function f) 接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流
   */

  @Test
  public void test() {
      //map
      List<Employee> list = EmployeeData.getEmployees();
      list.stream().map(employee -> { return employee.getAge();}).forEach(System.out::println);

      //flatMap
      list.stream().flatMap(employee -> {
          String name = employee.getName();
          return Arrays.asList(name.split("1")).stream();
      }).forEach(System.out::println);

  }

  @Test
  public void testSort(){
      //map
      List<Employee> list = EmployeeData.getEmployees();

      // 需要继承 Comparable 接口才能比较
      //list.stream().sorted().forEach(System.out::println);
      list.stream().sorted((e1,e2) ->{
         return Integer.compare( e1.getAge() , e2.getAge());
      }).forEach(System.out::println);


  }
}
