package cn.ox0a.algorithm;

import cn.ox0a.algorithm.search.BinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    BinarySearch<Integer> searcher = new BinarySearch<Integer>();

    @Test
    public void find(){
        Integer[] data = new Integer[]{1, 2, 3, 8, 12, 22, 31, 33, 34};
        int res = searcher.find(data, 3);
        assertEquals(2, res);
    }

    @Test
    public void findLeftMost(){
        Integer[] data = new Integer[]{-1, 0, 1, 2, 2, 2, 3, 4, 31, 33, 34};
        // multi
        int res = searcher.findLeftMost(data, 2);
        assertEquals(3, res);
        // upper
        res = searcher.findLeftMost(data, 38);
        assertEquals(-1, res);
        // below
        res = searcher.findLeftMost(data, -3);
        assertEquals(-1, res);
        // not in
        res = searcher.findLeftMost(data, 7);
        assertEquals(-1, res);
        // lowest
        res = searcher.findLeftMost(data, -1);
        assertEquals(0, res);
        // highest
        res = searcher.findLeftMost(data, 34);
        assertEquals(10, res);
    }

    @Test
    public void findRightMost() {
        Integer[] data = new Integer[]{-1, 0, 1, 2, 2, 2, 3, 4, 31, 33, 34};
        // multi
        int res = searcher.findRightMost(data, 2);
        assertEquals(5, res);
        // below
        res = searcher.findRightMost(data, -3);
        assertEquals(-1, res);
        // upper
        res = searcher.findRightMost(data, 38);
        assertEquals(-1, res);
        // not in
        res = searcher.findRightMost(data, 8);
        assertEquals(-1, res);
        // lowest
        res = searcher.findRightMost(data, -1);
        assertEquals(0, res);
        // highest
        res = searcher.findRightMost(data, 34);
        assertEquals(10, res);
    }
}