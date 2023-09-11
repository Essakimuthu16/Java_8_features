package com.pracs;

import java.util.Arrays;
import java.util.List;

public class DemoStreamApi {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        long count = list.stream().filter(x -> x % 2 != 0).count();
        System.out.println("There are total "+count+" number which are even");
    }
}
