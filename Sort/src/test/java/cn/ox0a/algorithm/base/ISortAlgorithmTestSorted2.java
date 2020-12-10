package cn.ox0a.algorithm.base;

import cn.ox0a.algorithm.sort.HeapSort;
import cn.ox0a.algorithm.sort.MergeSort;
import cn.ox0a.algorithm.sort.QuickSort;
import cn.ox0a.algorithm.sort.ShellSort;
import org.junit.Test;

import java.util.Random;

/**
 * 性能测试
 */
public class ISortAlgorithmTestSorted2 {
    private static final int performance_num = 100000;
    public static Integer[] data;
    static {
        data = new Integer[performance_num];
        for (int i = 0; i < performance_num; i++){
            data[i] = i;
        }
    }

    private Integer[] copyIt(){
        Integer[] copy = new Integer[performance_num];
        for (int i = 0; i < performance_num; i++){
            copy[i] = data[i];
        }
        return copy;
    }

    @Test
    public void shellTime(){
        Integer[] copy = copyIt();
        ISortAscAlgorithm<Integer> sorter = new ShellSort<Integer>();
        long startTime = System.currentTimeMillis();
        sorter.sort(copy);
        long endTime = System.currentTimeMillis();
        System.out.println("希尔排序运行时间：" + (endTime - startTime) + "ms");
    }

    @Test
    public void mergeTime(){
        Integer[] copy = copyIt();
        ISortAscAlgorithm<Integer> sorter = new MergeSort<Integer>();
        long startTime = System.currentTimeMillis();
        sorter.sort(copy);
        long endTime = System.currentTimeMillis();
        System.out.println("归并排序运行时间：" + (endTime - startTime) + "ms");
    }

    /**
     * 快速排序对有序数据的排序是极其耗时且容易内存溢出的
     */
    @Test
    public void quickTime(){
        Integer[] copy = copyIt();
        ISortAscAlgorithm<Integer> sorter = new QuickSort<Integer>();
        long startTime = System.currentTimeMillis();
        sorter.sort(copy);
        long endTime = System.currentTimeMillis();
        System.out.println("快速排序运行时间：" + (endTime - startTime) + "ms");
    }

    @Test
    public void heapTime(){
        Integer[] copy = copyIt();
        ISortAscAlgorithm<Integer> sorter = new HeapSort<Integer>();
        long startTime = System.currentTimeMillis();
        sorter.sort(copy);
        long endTime = System.currentTimeMillis();
        System.out.println("堆排序运行时间：" + (endTime - startTime) + "ms");
    }

}