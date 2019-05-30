package com.mcl.utilities;

import java.util.ArrayList;
import java.util.concurrent.*;

public class AsyncProcessor {

    private ExecutorService executor;

    public AsyncProcessor() {
        this.executor = Executors.newCachedThreadPool();
    }

    public AsyncProcessor(int threads) {
        this.executor = Executors.newFixedThreadPool(threads);
    }

    public <T extends Callable, V> Future<V> execute(T task) {
        return executor.submit(task);
    }

    public <T extends Callable, V> ArrayList<Future<V>> execute(ArrayList<T> tasks) {
        ArrayList<Future<V>> futures = new ArrayList<>();
        if (tasks.size() > 0) {
            for (T task : tasks) {
                futures.add(executor.submit(task));
            }
        }
        return futures;
    }

    public <V> V extract(Future<V> future) throws ExecutionException, InterruptedException{
        return future.get();
    }

    public <V> ArrayList<V> extract(ArrayList<Future<V>> futures) throws ExecutionException, InterruptedException {
        ArrayList<V> results = new ArrayList<>();
        for (Future<V> future : futures) {
            results.add(future.get());
        }
        return results;
    }

    public void shutdown() {
        executor.shutdown();
    }

}
