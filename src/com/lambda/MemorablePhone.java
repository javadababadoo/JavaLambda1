/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambda;

import java.util.HashMap;

import java.util.Map;

/**
 *
 *
 *
 * @author PC
 *
 */
public class MemorablePhone {

    public static HashMap<String, Integer> phoneNumberMap = new HashMap<>();

    /**
     *
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {

        HashMap<String, Integer> directory = new HashMap<>();
        phoneNumberMap.put("A", 2);
        phoneNumberMap.put("B", 2);
        phoneNumberMap.put("C", 2);
        phoneNumberMap.put("D", 3);
        phoneNumberMap.put("E", 3);
        phoneNumberMap.put("F", 3);
        phoneNumberMap.put("G", 4);
        phoneNumberMap.put("H", 4);
        phoneNumberMap.put("I", 4);
        phoneNumberMap.put("J", 5);
        phoneNumberMap.put("K", 5);
        phoneNumberMap.put("L", 5);
        phoneNumberMap.put("M", 6);
        phoneNumberMap.put("N", 6);
        phoneNumberMap.put("O", 6);
        phoneNumberMap.put("P", 7);
        phoneNumberMap.put("R", 7);
        phoneNumberMap.put("S", 7);
        phoneNumberMap.put("T", 8);
        phoneNumberMap.put("U", 8);
        phoneNumberMap.put("V", 8);
        phoneNumberMap.put("W", 9);
        phoneNumberMap.put("X", 9);
        phoneNumberMap.put("Y", 9);

        String[] arrayInput = new String[]{
            "4873279",
            "ITS-EASY",
            "888-4567",
            "3-10-10-10",
            "888-GLOP",
            "TUT-GLOP",
            "967-11-11",
            "310-GINO",
            "F101010",
            "888-1200",
            "-4-8-7-3-2-7-9-",
            "487-3279"
        };

        for (String phoneNumber : arrayInput) {
            System.out.println("");
            System.out.println("");
            System.out.println("Entro: " + phoneNumber);
            phoneNumber = phoneNumber.replace("-", "");
            phoneNumber = phoneNumber.toUpperCase();
            if (phoneNumber.length() == 7) {
                String standardPhoneNumber = convertPhoneNumberToDigit(phoneNumber);
                if (standardPhoneNumber != null) {
                    if (directory.containsKey(standardPhoneNumber)) {
                        directory.put(standardPhoneNumber, directory.get(standardPhoneNumber) + 1);
                    } else {
                        directory.put(standardPhoneNumber, 1);
                    }

                    System.out.println("Salio: " + standardPhoneNumber);
                }
            } else {
                System.out.println("Formato invalido");
            }
        }

        System.out.println("============= OUTPUT ==============");

        boolean phoneNumberNoDuplicated = false;
        for (Map.Entry<String, Integer> entry : directory.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + "  " + entry.getValue());
                phoneNumberNoDuplicated = true;
                System.out.println("");
            }
        }

        if (!phoneNumberNoDuplicated) {
            System.out.println("No duplicates");
        }
    }

    public static String convertPhoneNumberToDigit(String phoneNumber) {
        StringBuilder standardPhoneNumber = new StringBuilder();
        char[] toCharArray = phoneNumber.toCharArray();

        boolean invalidNumber = false;

        for (int i = 0; i < toCharArray.length; i++) {
            if (phoneNumberMap.containsKey(String.valueOf(toCharArray[i]))) {
                standardPhoneNumber.append(phoneNumberMap.get(String.valueOf(toCharArray[i])));
            } else {
                standardPhoneNumber.append(String.valueOf(toCharArray[i]));

                if (Character.isLetter(String.valueOf(toCharArray[i]).charAt(0))) {
                    invalidNumber = true;
                    System.out.println("Formato invalido: " + phoneNumber);
                    break;
                }
            }
        }
        if (invalidNumber) {
            return null;
        }

        standardPhoneNumber.insert(3, "-");
        return standardPhoneNumber.toString();
    }

}
