package cn.ox0a.algorithm.sort;

import cn.ox0a.algorithm.base.ISortAscAlgorithm;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void sortLogic() {
        ISortAscAlgorithm<Integer> sortAlgorithm = new MergeSort<Integer>();
        Integer[] data = new Integer[]{4, 1, 0, 10, 22, 1, 3,2,33,43,5,6,10,18};
        sortAlgorithm.sort(data);

        data = new Integer[] {1, -1};
        sortAlgorithm.sort(data);
    }
}