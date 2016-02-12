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

    private final Comparator<String> byLastName = (name1, name2) -> { 
        String[] nameArray1 = name1.trim().split("\\s+");
        String[] nameArray2 = name2.trim().split("\\s+");
        return (nameArray2.length > 1 ? nameArray2[1]: "").compareTo(nameArray1.length > 1 ? nameArray1[1]: "");
    };

    private final Comparator<String> byLength = (name1, name2) -> Integer.compare(name1.replaceAll(" ", "").trim().length(), name2.replaceAll(" ", "").trim().length());

    public void execute() {
        List<String> nameList = Arrays.asList("Barbara Lewis", "Maria Patterson", "Heather Evans", "Kelly Butler", "Jonathan Morgan", "Kevin Barnes", "Nicholas Hill", "Michael Coleman", "Donna Howard", "Jean Gonzalez");

        System.out.println("=========== Names order by length ==========");
        nameList.stream()
                .sorted(byLength)
                .forEach(name -> System.out.println(name.replaceAll("\\s+", " ").trim() + " --- " + name.replaceAll("\\s+", " ").trim().length()));

        System.out.println("");
        System.out.println("");
        System.out.println("=========== Names order by lastname ==========");
        nameList.stream()
                .sorted(byLastName)
                .forEach(name -> System.out.println(name.replaceAll("\\s+", " ").trim()));

        System.out.println("");
        System.out.println("");
        System.out.println("=========== First lastname and name ==========");
        nameList.stream()
                .map((name) -> {
                    String[] nameArray = name.trim().split("\\s+");
                    return nameArray.length > 1 ? (nameArray[1] + " " + nameArray[0]): nameArray[0];
                }).forEach(System.out::println);
    }

}
