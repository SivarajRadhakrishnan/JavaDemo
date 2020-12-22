package com.javademo.collections;

import com.javademo.abstraction.interfaces.bank.Customer;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 22/12/20
 * Time: 11:56 AM
 * To change this template use File | Settings | File and Code Templates.
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        listDemo();
        mapDemo();
        setDemo();
    }

    private static void listDemo()
    {
        System.out.println("------------------------------------");
        System.out.println("List Demo Start");
        System.out.println("------------------------------------\n");
        List<String> list1 = new ArrayList<String>();
        List<Customer> list2 = new ArrayList<Customer>();

        Map<String, String> map = null;
        Set<String> set = null;

        list1.add("Peter");
        list1.add("James");
        list1.add("Sunny");
        list1.add("James");
        list1.add("Albert");
        list1.add("James");
        list1.add("Ravi");

        System.out.println("List1 item at index 3 = " + list1.get(3));
        System.out.println("List1 size = " + list1.size());
        System.out.println("Is List1 contains \"Sunny\" = " + list1.contains("Sunny"));
        System.out.println("Is List1 contains \"sunny\" = " + list1.contains("sunny"));
        System.out.println("Is List1 contains \"ny\" = " + list1.contains("ny"));
        System.out.println("Index of \"Ravi\" in List1= " + list1.indexOf("Ravi"));
        System.out.println("Index of \"James\" in List1= " + list1.indexOf("James"));
        System.out.println("LastIndex of \"James\" in List1= " + list1.lastIndexOf("James"));
        System.out.println("Is List1 Empty = " + list1.isEmpty());
        System.out.println("Is List2 Empty = " + list2.isEmpty());
        System.out.println("------------------------------------");
        System.out.println("List Demo End");
        System.out.println("------------------------------------\n\n");
    }

    private static void mapDemo()
    {
        System.out.println("------------------------------------");
        System.out.println("Map Demo Start");
        System.out.println("------------------------------------\n");
        Map<String, String> employees = new HashMap<String, String>();
        Map<String, Customer> map2 = new HashMap<String, Customer>();

        employees.put("101", "James");
        employees.put("102", "Peter");
        employees.put("103", "Albert");
        employees.put("104", "Ravi");
        employees.put("105", "James");

        System.out.println("Employees map, value of key 101 = " + employees.get("101"));
        System.out.println("Employees map, value of key 105 = " + employees.get("105"));
        System.out.println("Employees map size = " + employees.size());
        System.out.println("Removing key at 105");
        employees.remove("105");
        System.out.println("Employees map size after removing key 101 = " + employees.size());
        System.out.println("Employees map, value of key 105 = " + employees.get("105"));
        System.out.println("Employees map, value of key 104 = " + employees.get("104"));
        System.out.println("Replacing value of key 104 with value \"Kumar\"");
        employees.put("104", "Kumar");
        System.out.println("Employees map, value of key 104 = " + employees.get("104"));
        System.out.println("Employees map, is contains key 104 = " + employees.containsKey("104"));
        System.out.println("Employees map, is contains value Albert = " + employees.containsValue("Albert"));
        System.out.println("------------------------------------");
        System.out.println("Map Demo End");
        System.out.println("------------------------------------\n\n");
    }

    private static void setDemo()
    {
        System.out.println("------------------------------------");
        System.out.println("Set Demo Start");
        System.out.println("------------------------------------\n");
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();
        set1.add("Peter");
        set1.add("James");
        set1.add("Sunny");
        set1.add("James");
        set1.add("Albert");
        set1.add("James");
        set1.add("Ravi");

        System.out.println("Set1 size= " + set1.size());
        System.out.println("Is Set1 contains \"Sunny\" = " + set1.contains("Sunny"));
        System.out.println("Is Set1 Empty = " + set1.isEmpty());
        System.out.println("Is Set2 Empty = " + set2.isEmpty());
        System.out.println("Removing \"Sunny\" from Set1");
        set1.remove("Sunny");
        System.out.println("Is Set1 contains \"Sunny\" = " + set1.contains("Sunny"));
        System.out.println("Removing all values in Set1");
        set1.removeAll(set1);
        System.out.println(set1.size());
        System.out.println("Converting Set to Array");
        Object[] arr = set1.toArray();
        System.out.println("Size of array extracted from Set1 = " + arr.length);
        System.out.println("------------------------------------");
        System.out.println("Set Demo End");
        System.out.println("------------------------------------");
    }
}