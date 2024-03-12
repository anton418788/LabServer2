package Lesson5;

import Lesson4.AddThreadList;
import Lesson4.DeleteThreadList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MixedOperationTest {

    @Test
    public void addList() throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        Thread firstThread = new Thread(new MixedAddThread(list), "firstThread");
        Thread secondThread = new Thread(new MixedDeleteThread(list), "secondThread");
        firstThread.start();
        secondThread.start();
        firstThread.join();
        secondThread.join();
        System.out.println(list);
    }
}
