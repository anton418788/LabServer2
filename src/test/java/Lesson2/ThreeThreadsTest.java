package Lesson2;

import Lesson1.FirstLesson;
import org.junit.Test;

public class ThreeThreadsTest {

    @Test
    public void run() throws InterruptedException {
        Thread firstThread = new Thread(new ThreeThreadsOne(), "firstThread");
        firstThread.start();
        Thread secondThread = new Thread(new ThreeThreadsTwo(), "secondThread");
        secondThread.start();
        Thread thirdThread = new Thread(new ThreeThreadsThird(), "ThirdThread");
        thirdThread.start();

        firstThread.join();
        secondThread.join();
        thirdThread.join();

        System.out.println("Thread " + Thread.currentThread().getName() + " successfully waited for the child thread to close");
    }
}
