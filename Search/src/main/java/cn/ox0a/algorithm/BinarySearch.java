package cn.ox0a.algorithm;

import cn.ox0a.algorithm.base.ISearchAlgorithm;
import com.sun.istack.internal.NotNull;

/**
 * @Description 二分查找
 * @Author Leon
 * @Date 2020-12-02 14:58
 * @Version 1.0
 */
public class BinarySearch<V extends Comparable<? super V>> implements ISearchAlgorithm<V> {

    /**
     * 查找数组中是否存在某值
     * @param data 有序数组
     * @param target target
     * @return index of target in data, -1 if absent.
     */
    public int find(@NotNull V[] data, @NotNull V target) {
        if(data.length == 0){
            return -1;
        }
        int left = 0;
        int right = data.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            V midV = data[mid];
            if(midV.compareTo(target) == 0){
                return mid;
            }else if(midV.compareTo(target) < 0){
                // 丢弃midV
                left = mid + 1;
            }else if(midV.compareTo(target) > 0){
                // 丢弃midV
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 边缘查找（最左侧的target）
     * @param data 有序数组
     * @param target target
     * @return the most left index of target in data, -1 if absent.
     */
    public int findLeftMost(@NotNull V[] data, @NotNull V target){
        if(data.length == 0){
            return -1;
        }
        int left = 0;
        int right = data.length;
        while (left < right){
            int mid = (left + right) / 2;
            V value = data[mid];
            if(value.compareTo(target) == 0){
                right = mid;
            }else if(value.compareTo(target) < 0){
                left = mid + 1;
            }else if(value.compareTo(target) > 0){
                right = mid;
            }
        }
        return right != data.length && data[right].compareTo(target) == 0 ? right : -1;
    }

    /**
     * 边缘查找（最右侧的target）
     * @param data 有序数组
     * @param target 目标值
     * @return the most right index of target in data, -1 if absent.
     */
    public int findRightMost(@NotNull V[] data, @NotNull V target){
        if(data.length == 0){
            return -1;
        }
        int left = 0;
        int right = data.length;
        while (left < right){
            int mid = (left + right) / 2;
            V value = data[mid];
            if(value.compareTo(target) == 0){
                left = mid + 1;
            }else if(value.compareTo(target) < 0){
                left = mid + 1;
            }else if(value.compareTo(target) > 0){
                right = mid;
            }
        }
        return right > 0 && data[right-1].compareTo(target)  == 0 ? right - 1: -1;
    }
}
