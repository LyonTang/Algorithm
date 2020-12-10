package cn.ox0a.algorithm.sort;

import cn.ox0a.algorithm.base.ISortAscAlgorithm;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void sortLogic() {
        ISortAscAlgorithm<Integer> sortAlgorithm = new QuickSort<Integer>();
        Integer[] data = new Integer[]{4, 1, 0, 10, 22, 1};
        sortAlgorithm.sort(data);

        data = new Integer[] {1, -1};
        sortAlgorithm.sort(data);
    }
}