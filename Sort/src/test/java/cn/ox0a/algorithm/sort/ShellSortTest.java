package cn.ox0a.algorithm.sort;

import cn.ox0a.algorithm.base.ISortAscAlgorithm;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShellSortTest {

    @Test
    public void sort() {
        ISortAscAlgorithm<Integer> sortAlgorithm = new ShellSort<Integer>();
        Integer[] data = new Integer[]{4, 1, 0, 10, 22, 1, 10, 3, -1 , 6, 6, 333, 4, 33};
        sortAlgorithm.sort(data);

        data = new Integer[] {1, -1};
        sortAlgorithm.sort(data);
    }
}