package cn.ox0a.algorithm.base;

import com.sun.istack.internal.NotNull;

/**
 * @author Leon
 */
public interface ISortAscAlgorithm<V extends Comparable<? super V>> {
    /**
     * 升序排序
     * @param data 待排序数组
     */
    void sort(@NotNull V[] data);

    /**
     * 前n个数据排序
     * @param data 待排序数组
     * @param n 目标位置
     */
    void sort(@NotNull V[] data, int n);
}
