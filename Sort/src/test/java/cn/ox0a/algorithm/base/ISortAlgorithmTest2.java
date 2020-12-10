package cn.ox0a.algorithm.base;

import cn.ox0a.algorithm.sort.*;
import org.junit.Test;

import java.util.Random;

/**
 * 性能测试
 */
public class ISortAlgorithmTest2 {
    private static final int performance_num = 100000;
    public static Integer[] data;
    static {
        Random seeder = new Random();
        data = new Integer[performance_num];
        for (int i = 0; i < performance_num; i++){
            data[i] = seeder.nextInt();;
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