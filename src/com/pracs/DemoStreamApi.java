package com.pracs;

import java.util.Arrays;
import java.util.List;

public class DemoStreamApi {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11, 22, 33, 64, 15);
        long count = list.stream().filter(x -> x % 2 != 0).count();
        System.out.println("There are total "+count+" number which are even");

        long count1 = list.stream().count();
        System.out.println("The size of the list : "+count1);

    }
}
