package Lesson2;

public class ThreeThreadsThird implements Runnable{
    @Override
    public void run() {
        System.out.println("Third Thread name: " + Thread.currentThread().getName() + " started");
        try {
            System.out.println("||| 5sec to sleep... (3)|||");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Third Thread name: " + Thread.currentThread().getName() + " closed");
    }
}
