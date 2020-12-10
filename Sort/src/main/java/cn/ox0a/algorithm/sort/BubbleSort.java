package cn.ox0a.algorithm.sort;

import cn.ox0a.algorithm.base.Sorter;

/**
 * @Description 冒泡排序（拉胯）
 * @author leon
 * @Date 2020-12-03 10:54
 * @Version 1.0
 */
public class BubbleSort<V extends Comparable<? super V>> extends Sorter<V> {

    @Override
    protected void sortLogic(V[] data, int n) {
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - 1 - i; j++){
                // 将小的置换到前面
                if(more(data[j], data[j+1])){
                    swap(data, j, j+1);
                }
            }
        }
    }

    // 由于其拉胯操作，我又看了看优化，写完测试却想把这个排序删了

    /**
     * 如果有一次没有执行交换，则说明此次已经完成了排序
     * 但是对于随机数据，这种优化并不会提升多少效率，反而有可能因为标志位的加入，造成更多时间的运算
     * 就算法而言，确实优化了
     * @param data 数组
     */
    public void sortMethod2(V[] data){
        boolean flag = true;
        int k = data.length;
        while (flag){
            flag = false;
            for (int i = 1; i < k; i++){
                if(more(data[i-1], data[i])){
                    swap(data, i-1, i);
                    flag = true;
                }
            }
            k--;
        }
    }

    /**
     * 每次记录最后交换的位置，交换的位置后面是有序的,再结合method2优化
     * 怎么看都觉得是3更具备优势，但是实际测试却总有误差
     * 甚至觉得自己在反向优化
     * @param data 数组
     */
    public void sortMethod3(V[] data){
        int k, lastSwapIndex;
        lastSwapIndex = data.length;
        while (lastSwapIndex > 0)
        {
            k = lastSwapIndex;
            lastSwapIndex = 0;
            for (int i = 1; i < k; i++) {
                if (more(data[i - 1], data[i])) {
                    swap(data, i - 1, i);
                    lastSwapIndex = i;
                }
            }
        }

    }
}
