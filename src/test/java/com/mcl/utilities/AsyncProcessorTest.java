package com.mcl.utilities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsyncProcessorTest {

    private TestCallable testCallable;
    private ArrayList<TestCallable> testList;

    @Before
    public void setTestFields() {
        testCallable = new TestCallable(10, 20);
        testList = new ArrayList<>();
        for (Integer i = 0; i < 4; i++) {
            testList.add(new TestCallable(i, i));
        }
    }

    @Test
    public void testExecuteReturnsCorrectValue() throws ExecutionException, InterruptedException {
        AsyncProcessor processor = new AsyncProcessor();
        Future<Integer> future = processor.execute(testCallable);
        Integer result = (Integer) processor.extract(future);
        Assert.assertEquals((Integer) 200, result);
    }

    @Test
    public void testExecuteReturnsCorrectArrayList() throws ExecutionException, InterruptedException {
        AsyncProcessor processor = new AsyncProcessor();
        ArrayList<Integer> expectedList = new ArrayList<>();
        expectedList.add(0);
        expectedList.add(1);
        expectedList.add(4);
        expectedList.add(9);

        ArrayList<Future<Integer>> futureList = processor.execute(testList);
        ArrayList<Integer> resultList = processor.extract(futureList);
        Assert.assertEquals(expectedList, resultList);
    }

    private class TestCallable implements Callable<Integer> {

        private Integer x;
        private Integer y;

        private TestCallable(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public Integer call() {
            return x * y;
        }
    }

}
