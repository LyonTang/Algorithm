package cn.ox0a.algorithm.sort;

import cn.ox0a.algorithm.base.ISortAscAlgorithm;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void sort() {
        ISortAscAlgorithm<Integer> sortAlgorithm = new BubbleSort<Integer>();
        Integer[] data = new Integer[]{4, 1, 0, 10, 22, 1};
        sortAlgorithm.sort(data);

        data = new Integer[] {1, -1};
        sortAlgorithm.sort(data);
    }

    @Test
    public void sortMethod2(){
        BubbleSort<Integer> sortAlgorithm = new BubbleSort<Integer>();
        Integer[] data = new Integer[]{4, 1, 0, 10, 22, 1};
        sortAlgorithm.sortMethod2(data);

        data = new Integer[] {1, -1};
        sortAlgorithm.sort(data);
    }

    @Test
    public void sortMethod3(){
        BubbleSort<Integer> sortAlgorithm = new BubbleSort<Integer>();
        Integer[] data = new Integer[]{4, 1, 0, 10, 22, 1};
        sortAlgorithm.sortMethod3(data);

        data = new Integer[] {1, -1};
        sortAlgorithm.sort(data);
    }
}