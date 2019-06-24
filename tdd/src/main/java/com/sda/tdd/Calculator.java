package com.sda.tdd;

import java.util.List;

public class Calculator {

    public int add(String numbers) {
        if (numbers.contains("-")) {
            throw new IllegalArgumentException("negatives not allowed");
        }
        int sum = 0;
        if ("".equals(numbers)) {   // nu apare null Pionter exeption;
            return 0;
        }
        String[] strings = numbers.split(",|\n");
//        {
//            if (strings.length > 2){
//                throw new IllegalArgumentException();
//            }
//        }

        for (String temp : strings) {
            sum += Integer.parseInt(temp);
        }
        return sum;
    }

    public long product(List<String> numbers) {
        if (numbers.size() == 0) {
            return 0;
        }

//        if (numbers.size() > 2) {
//            throw new IllegalArgumentException();
//        }
        long product = 1;
        for (String temp : numbers) {
            if (Integer.parseInt(temp) > 19) {
                System.out.println("Numarul " + temp + " nu e valid");
                continue; // cazul 2
            }
            // cazul 1
//                else {
            product *= Integer.parseInt(temp);
//            }

        }
        return product;
    }

}

