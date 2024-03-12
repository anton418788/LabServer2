package Lesson2;

public class ThreeThreadsTwo implements Runnable{
    @Override
    public void run() {
        System.out.println("Second Thread name: " + Thread.currentThread().getName() + " started");
        try {
            System.out.println("||| 3sec to sleep... (2)|||");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Second Thread name: " + Thread.currentThread().getName() + " closed");
    }
}
