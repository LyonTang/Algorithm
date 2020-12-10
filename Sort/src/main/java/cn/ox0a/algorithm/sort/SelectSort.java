package cn.ox0a.algorithm.sort;

import cn.ox0a.algorithm.base.Sorter;

/**
 * @Description 选择排序，将循环中最大值置于循环尾
 * @author leon
 * @Date 2020-12-03 10:55
 * @Version 1.0
 */
public class SelectSort<V extends Comparable<? super V>> extends Sorter<V> {

    @Override
    protected void sortLogic(V[] data, int n) {
        for (int i = n - 1; i > 0; i--){
            int max = 0;
            for (int j = 1; j <= i; j++){
                if(less(data[max], data[j])){
                    max = j;
                }
            }
            swap(data, max, i);
        }
    }
}
