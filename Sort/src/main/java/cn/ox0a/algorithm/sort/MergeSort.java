package cn.ox0a.algorithm.sort;

import cn.ox0a.algorithm.base.Sorter;

/**
 * @Description 归并排序
 * @author leon
 * @date 2020-12-03 15:26
 * @version 1.0
 */
public class MergeSort<V extends Comparable<? super V>> extends Sorter<V> {

    @Override
    protected void sortLogic(V[] data, int n) {
        // 此处应开辟长度为n的数组，但是我并不知道怎么整- -
        V[] copy = data.clone();
        sortSequence(data, copy, 0, n-1);
    }

    private void sortSequence(V[] data, V[] res, int min, int max){
        if(min >= max) { return; }
        int mid = (min + max) / 2;
        // 左边排序
        sortSequence(data, res, min, mid);
        // 右边排序
        sortSequence(data, res, mid+1, max);
        // 合并排序好的左右两个序列
        mergeSequence(data, res, min, mid, max);
    }

    private void mergeSequence(V[] data, V[] res, int min, int mid, int max){
        int k = mid+1;
        int i = min, j = min;
        for(; i <= mid;){
            // 去左右两边较小的，右边取完则把左边的补充到res
            if(k <= max && more(data[i], data[k])){
                res[j++] = data[k++];
            }else{
                res[j++] = data[i++];
            }
        }
        // 右边未取完，补充到res
        for (; k <= max; k++){
            res[j++] = data[k];
        }
        System.arraycopy(res, min, data, min, j-min);
    }

}
