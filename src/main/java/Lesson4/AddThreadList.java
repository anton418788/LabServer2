package Lesson4;

import java.util.List;

public class AddThreadList implements Runnable{
    private final List<Integer> list;
    private final Object lock;
    public AddThreadList(List<Integer> list, Object lock) {
        this.list = list;
        this.lock = lock;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (lock) {
                list.add((int) (Math.random() * Integer.MAX_VALUE * 2 + 1) - Integer.MAX_VALUE);
                System.out.println("List has been added by " + Thread.currentThread().getName());
                lock.notify();
            }
        }
        System.out.println();
    }
}
