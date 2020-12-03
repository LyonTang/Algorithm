package cn.ox0a.algorithm.base;

/**
 * @author Leon
 * @param <V>
 */
public interface ISearchAlgorithm<V extends Comparable<? super V>> {

    /**
     * 搜索
     * @param data 待查找数据
     * @param target target
     * @return index of target in data
     */
    int find(V[] data, V target);
}
