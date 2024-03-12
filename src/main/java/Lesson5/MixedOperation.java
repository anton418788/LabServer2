package Lesson5;

import java.util.List;

public class MixedOperation {
    private final List<Integer> list;
    int deletedNumber;

    public MixedOperation(List<Integer> list) {
        this.list = list;
    }

    public void AddList() {
        for (int i = 0; i < 10000; i++) {
            synchronized (list) {
                list.add((int) (Math.random() * Integer.MAX_VALUE * 2 + 1) - Integer.MAX_VALUE);
                System.out.println("List has been added by " + Thread.currentThread().getName());
                list.notify();
            }
        }
        System.out.println();
    }
    public void DeleteList() {
        try {
            for (int i = 0; i < 10000; i++) {
                synchronized (list) {
                    if (list.size() == 0) list.wait();
                    deletedNumber = (int) (Math.random() * list.size());
                    list.remove(deletedNumber);
                    System.out.println("№ " + deletedNumber + " deleted by " + Thread.currentThread().getName());
                }
            }
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
