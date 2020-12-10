package cn.ox0a.algorithm.sort;

import cn.ox0a.algorithm.base.Sorter;

/**
 * @author Leon
 * @version 1.0
 * @description 堆排序
 * @date 2020-12-10 15:06
 */
public class HeapSort<V extends Comparable<? super V>> extends Sorter<V> {
    @Override
    protected void sortLogic(V[] data, int n) {
        heapSort(data, n);
    }

    private void heapSort(V[] data, int length){
        // 从最后一个非叶子节点遍历，调整树为大根节点
        // R[2i+2]为右节点，所以length=2i+2时，i=(length-2)/2，i为最后一个非叶子节点
        for(int i = length/2 - 1; i >= 0; i--){
            toBigRootTree(data, i, length);
        }

        while (length > 0){
            length --;
            swap(data, 0, length);
            toBigRootTree(data, 0, length);
        }
    }

    /**
     * 将某一子树为大根树的节点做大根调整
     * @param tree 初始树
     * @param parent 父节点
     * @param length 最后一个节点索引
     */
    private void toBigRootTree(V[] tree, int parent, int length){
        int child = 2*parent + 1;
        while (child < length){
            if(child + 1 < length && less(tree[child], tree[child+1])){
                child++;
            }
            if(more(tree[parent], tree[child])){
                break;
            }
            swap(tree, parent, child);
            parent = child;
            child = 2*parent + 1;
        }
    }
}
