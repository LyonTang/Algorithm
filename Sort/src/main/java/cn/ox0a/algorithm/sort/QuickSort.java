package cn.ox0a.algorithm.sort;

import cn.ox0a.algorithm.base.Sorter;

/**
 * @author Leon
 * @version 1.0
 * @description 快速排序
 * @date 2020-12-08 17:31
 */
public class QuickSort<V extends Comparable<? super V>> extends Sorter<V> {
    @Override
    protected void sortLogic(V[] data, int n) {
        quickSort(data, 0, n-1);
    }

    /**
     * 快排
     * @param data 数组
     * @param low 低位
     * @param high 高位
     */
    private void quickSort(V[] data, int low, int high){
        if(low >= high) { return; }
        // 查找数据索引
        int index = indexOf(data, low, high);
        // 递归设置和查找索引
        quickSort(data, low, index - 1);
        quickSort(data, index + 1, high);
    }

    /**
     * 查找并设置索引
     * @param data 数组
     * @param low 起
     * @param high 终
     * @return data[low]的正确索引位置
     */
    private int indexOf(V[] data, int low, int high){
        V base = data[low];
        while (low < high){
            if(less(base, data[high])){
                high--;
            }
            data[low] = data[high];

            if(low < high && more(base, data[low])){
                low++;
            }
            data[high] = data[low];
        }
        data[low] = base;
        return low;
    }

    private int highTraverse(V[] data, int low, int high, V base){
        while (low < high){
            if(more(base, data[high])){
                data[low] = data[high];
                break;
            }else{
                high--;
            }
        }
        return high;
    }

    private int lowTraverse(V[] data, int low, int high, V base){
        while (low < high){
            if(less(base, data[low])){
                data[high] = data[low];
                break;
            }else{
                low++;
            }
        }
        return low;
    }
}
