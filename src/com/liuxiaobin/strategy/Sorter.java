package com.liuxiaobin.strategy;

/**
 * @author liuxiaobin
 * @Description: 排序类
 * @date 2021/1/1518:26
 */
public class Sorter {

    public static void sort(int[] arr){
        for (int i=0;i<arr.length;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                minPos=arr[j]<arr[minPos]?j:minPos;
            }
            swap(arr,i,minPos);

        }
    }
    static void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
