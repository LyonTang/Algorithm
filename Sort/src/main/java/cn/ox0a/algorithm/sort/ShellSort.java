package cn.ox0a.algorithm.sort;

import cn.ox0a.algorithm.base.Sorter;

/**
 * @Description 希尔排序
 * @author leon
 * @Date 2020-12-03 19:40
 * @Version 1.0
 */
public class ShellSort<V extends Comparable<? super V>> extends Sorter<V> {

    /**
     * [g-sorted经过k-sorting仍然是g-sorted]
     * 希尔排序的思想是把数据作为一个二维数组，将二维数组第二位下标一致的数据进行一次插入排序，
     * 经过多次分组排序，最后执行一次插入排序
     * k-sorting操作过后，数据的整体有序性会提高
     * @param data 数组
     * @param n n
     */
    @Override
    protected void sortLogic(V[] data, int n) {
        int gap = 1;
        // 动态步长，这个设计的好坏，会让程序效率有不一样的效果
        while (gap < n/3){
            gap = gap*3 + 1;
        }
        while (gap >= 1){
            for (int i = gap; i < n; i++){
                for (int j = i; j >= gap && less(data[j], data[j-gap]); j -= gap){
                    swap(data, j, j-gap);
                }
            }
            gap /= 3;
        }
    }
}
