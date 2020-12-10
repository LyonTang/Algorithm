package cn.ox0a.algorithm.base;

import com.sun.istack.internal.NotNull;

/**
 * @Description 用于比较的基类
 * @author leon
 * @Date 2020-12-07 15:54
 * @Version 1.0
 */
public abstract class Sorter<V extends Comparable<? super V>> implements ISortAscAlgorithm<V> {
    /**
     * 小于
     * @param d1 前
     * @param d2 后
     * @param <T> Comparable
     * @return true 前者小于后者
     */
    public static <T extends Comparable<? super T>> boolean less(@NotNull T d1, @NotNull T d2) {
        return d1.compareTo(d2) < 0;
    }

    /**
     * 大于
     * @param d1 前
     * @param d2 后
     * @param <T> Comparable
     * @return true 前者大于后者
     */
    public static <T extends Comparable<? super T>> boolean more(@NotNull T d1, @NotNull T d2){
        return d1.compareTo(d2) > 0;
    }

    /**
     * 交换（不做数据校验）
     * @param data 数组
     * @param i 0 =< i < data.length
     * @param j 0 =< j < data.length
     * @param <T> Target Type
     */
    public static <T> void swap(T[] data, int i, int j){
        T temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void sort(V[] data) {
        if(data.length <= 1) {
            return;
        }
        sortLogic(data, data.length);
    }

    public void sort(V[] data, int n) {
        if(data.length <= 1 || n <= 1) {
            return;
        }
        if(data.length < n){
            n = data.length;
        }
        sortLogic(data, n);
    }

    /**
     * 具体排序逻辑
     * @param data 数组
     * @param n sort from 0 to n
     */
    protected abstract void sortLogic(V[] data, int n);
}

