package Lesson4;
import java.util.List;

public class DeleteThreadList implements Runnable{
    private final List<Integer> list;
    private final Object lock;
    public DeleteThreadList(List<Integer> list, Object lock) {
        this.list = list;
        this.lock = lock;
    }
    @Override
    public void run() {
        try {
            int deletedNumber;
            for (int i = 0; i < 10000; i++) {
                synchronized (lock) {
                    if (list.size() == 0) lock.wait();
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
