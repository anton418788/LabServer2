package Lesson1;

public class FirstLesson implements Runnable{   ///первое и второе задание на потоки
    @Override
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        System.out.println("Thread priority: " + Thread.currentThread().getPriority());
        System.out.println("ThreadGroup name: " + Thread.currentThread().getThreadGroup().getName());
        System.out.println("Is thread alive: " + Thread.currentThread().isAlive());
        try {
            System.out.println("||| 5sec to sleep... |||");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Is thread interrupted: " + Thread.currentThread().isInterrupted());
        System.out.println("Is thread daemon: " + Thread.currentThread().isDaemon());
    }
}
