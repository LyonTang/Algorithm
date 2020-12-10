package cn.ox0a.algorithm.base;

import cn.ox0a.algorithm.sort.InsertSort;
import cn.ox0a.algorithm.sort.SelectSort;
import org.junit.Test;

import java.util.Random;

/**
 * 性能测试
 */
public class ISortAlgorithmTestSorted1 {
    private static final int performance_num = 50000;
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
    public void insertTime(){
        Integer[] copy = copyIt();
        InsertSort<Integer> sorter = new InsertSort<Integer>();
        long startTime = System.currentTimeMillis();
        sorter.sortMethod1(copy, copy.length);
        long endTime = System.currentTimeMillis();
        System.out.println("插入排序法1运行时间：" + (endTime - startTime) + "ms");
        copy = copyIt();
        startTime = System.currentTimeMillis();
        sorter.sortMethod2(copy, copy.length);
        endTime = System.currentTimeMillis();
        System.out.println("插入排序法2运行时间：" + (endTime - startTime) + "ms");
    }

    /**
     * most bad algorithm
     */
    @Test
    public void popUpTime(){

        /*Integer[] copy = copyIt();
        ISortAscAlgorithm<Integer> sort = new BubbleSort<Integer>();
        long startTime = System.currentTimeMillis();
        sort.sort(copy);
        long endTime = System.currentTimeMillis();
        System.out.println("冒泡排序运行时间：" + (endTime - startTime) + "ms");

        copy = copyIt();
        BubbleSort<Integer> sorter = new BubbleSort<Integer>();
        startTime = System.currentTimeMillis();
        sorter.sortMethod2(copy);
        endTime = System.currentTimeMillis();
        System.out.println("冒泡排序法2运行时间：" + (endTime - startTime) + "ms");

        copy = copyIt();
        startTime = System.currentTimeMillis();
        sorter.sortMethod3(copy);
        endTime = System.currentTimeMillis();
        System.out.println("冒泡排序法3运行时间：" + (endTime - startTime) + "ms");
        */
    }

    @Test
    public void selectTime(){
        Integer[] copy = copyIt();
        ISortAscAlgorithm<Integer> sort = new SelectSort<Integer>();
        long startTime = System.currentTimeMillis();
        sort.sort(copy);
        long endTime = System.currentTimeMillis();
        System.out.println("选择排序运行时间：" + (endTime - startTime) + "ms");
    }
}