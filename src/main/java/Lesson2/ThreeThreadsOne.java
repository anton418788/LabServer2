package Lesson2;

public class ThreeThreadsOne implements Runnable{
    @Override
    public void run() {
        System.out.println("First Thread name: " + Thread.currentThread().getName() + " started");
        try {
            System.out.println("||| 7sec to sleep... (1)|||");
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("First Thread name: " + Thread.currentThread().getName() + " closed");
    }
}
