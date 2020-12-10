package cn.ox0a.algorithm.sort;

import cn.ox0a.algorithm.base.Sorter;

/**
 * @Description 插入排序
 * @author leon
 * @Date 2020-12-03 10:56
 * @Version 1.0
 */
public class InsertSort<V extends Comparable<? super V>> extends Sorter<V> {
    @Override
    protected void sortLogic(V[] data, int n) {
        sortMethod2(data, n);
    }

    public void sortMethod1(V[] data, int n){
        for(int i = 1; i < n; i++){
            for(int j = i; j > 0 && less(data[j], data[j-1]); j--){
                swap(data, j, j-1);
            }
        }
        /* for(int i = 1; i < n; i++){
            for(int j = i; j > 0; j--){
                if(less(data[j], data[j-1])){
                    swap(data, j, j-1);
                }else{
                    break;
                }
            }
        }*/
    }

    /**
     * 该方法在数据量大时效果会明显一点（省去了交换过程）
     * @param data 数据
     */
    public void sortMethod2(V[] data, int n){
        for(int i = 1; i < n; i++){
            // 移除
            V cur = data[i];
            int j = i;
            for(; j > 0 && less(cur, data[j-1]); j--){
                // 仅当当前值小于前一个数据才移位
                data[j] = data[j-1];
            }
            // 插入
            data[j] = cur;
        }
    }
}
