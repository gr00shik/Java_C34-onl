package org.example;

public class CounterThread implements Runnable {

    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            counter.inc();
            counter.descr();
        }
    }
}
