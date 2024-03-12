package Lesson4;


import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class DeleteThreadListTest {

    @Test
    public void run() throws InterruptedException {
        Object lock = new Object();
        List<Integer> list = new ArrayList<>();
        Thread firstThread = new Thread(new AddThreadList(list, lock), "firstThread");
        Thread secondThread = new Thread(new DeleteThreadList(list, lock), "secondThread");
        firstThread.start();
        secondThread.start();
        firstThread.join();
        secondThread.join();
        System.out.println(list);
    }
}
