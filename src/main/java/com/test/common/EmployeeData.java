package com.test.common;

import java.util.ArrayList;
import java.util.List;
/**
 * 提供用于测试的数据
 */
public class EmployeeData {

    public static List<Employee> getEmployees(){
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1001, "马1化腾", 34, 6000.38));
        list.add(new Employee(1002, "马1云", 12, 9876.12));
        list.add(new Employee(1003, "刘1强1东", 33, 3000.82));
        list.add(new Employee(1004, "雷军", 26, 7657.37));
        list.add(new Employee(1005, "李1彦宏", 65, 5555.32));
        list.add(new Employee(1006, "比1尔盖茨", 42, 9500.43));
        list.add(new Employee(1007, "任1正非", 26, 4333.32));
        list.add(new Employee(1008, "扎1克1伯格", 35, 2500.32));

        return list;
    }
}
