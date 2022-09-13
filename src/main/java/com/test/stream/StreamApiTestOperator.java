package com.test.stream;

import com.test.common.Employee;
import com.test.common.EmployeeData;
import org.junit.Test;

import java.util.List;

public class StreamApiTestOperator {

  /**
   * 1: filter(Predicate p) 接收Lambda ，从流中排除某些元素
   * 2: distinct() 筛选，通过流所生成元素的hashCode() 和equals() 去除重复元素
   * 3: limit(long maxSize) 截断流，使其元素不超过给定数量
   * 4: skip(long n) 跳过元素，返回一个扔掉了前n 个元素的流。若流中元素不足n个，则返回一个空流。与limit(n)互补
   */

  @Test
  public void test(){
      List<Employee> list = EmployeeData.getEmployees();
      // filter
      list.stream().filter(employee -> employee.getAge()>18).forEach(employee -> System.out.println(employee));
      System.out.println("+++++++++++limit++++++++++++");
      // limit
      list.stream().limit(3).forEach(System.out::println);


      System.out.println("+++++++++skip++++++++++++++");
      list.stream().skip(3).forEach(System.out::println);


  }


}
