/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author PC
 */
public class NamesTest {

    private final Comparator<String> byLastName = (name1, name2) -> name2.split("\\s+")[1].compareTo(name1.split("\\s+")[1]);

    private final Comparator<String> byLength = (name1, name2) -> Integer.compare(name1.length(), name2.length());

   

    public void execute() {
        List<String> nameList = Arrays.asList("Barbara Lewis", "Maria Patterson", "Heather Evans", "Kelly Butler", "Jonathan Morgan", "Kevin Barnes", "Nicholas Hill", "Michael Coleman", "Donna Howard", "Jean Gonzalez");

        System.out.println("=========== Names order by length ==========");
        nameList.stream()
                .sorted(byLength)
                .forEach(name -> System.out.println(name + " --- " + name.length()));

        System.out.println("");
        System.out.println("");
        System.out.println("=========== Names order by lastname ==========");
        nameList.stream()
                .sorted(byLastName)
                .forEach(System.out::println);
        
        System.out.println("");
        System.out.println("");
        System.out.println("=========== First lastname and ==========");
        nameList.stream()
                .map(name -> name.split("\\s+")[1] + " " + name.split("\\s+")[0])
                .forEach(System.out::println);
    }

}
