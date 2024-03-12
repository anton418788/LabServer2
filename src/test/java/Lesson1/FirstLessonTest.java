package Lesson1;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstLessonTest {

    @Test
    public void FirstsLessonTest() throws InterruptedException {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        System.out.println("Thread priority: " + Thread.currentThread().getPriority());
        System.out.println("ThreadGroup name: " + Thread.currentThread().getThreadGroup().getName());
        System.out.println("Is thread alive: " + Thread.currentThread().isAlive());
        System.out.println("Is thread interrupted: " + Thread.currentThread().isInterrupted());
        System.out.println("Is thread daemon: " + Thread.currentThread().isDaemon());

        Thread firstThread = new Thread(new FirstLesson(), "firstThread");
        firstThread.start();
        firstThread.join();
        System.out.println(Thread.currentThread().getName() +"successfully waited for the child thread to close");
    }
}
