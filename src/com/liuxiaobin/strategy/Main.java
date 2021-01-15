package com.liuxiaobin.strategy;

import java.util.Arrays;

/**
 * @author liuxiaobin
 * @Description: 主类
 * @date 2021/1/1518:32
 */
public class Main {
    public static void main(String[] args) {
        int[] a={9,2,11,1,4,23};
        Sorter.sort(a);
        System.out.println(Arrays.toString(a));

    }
}
