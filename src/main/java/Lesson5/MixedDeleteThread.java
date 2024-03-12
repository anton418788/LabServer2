package Lesson5;

import java.util.List;

public class MixedDeleteThread implements Runnable{
    private MixedOperation mixedOperation;
    public MixedDeleteThread(List<Integer> list) {
        this.mixedOperation = new MixedOperation(list);
    }

    @Override
    public void run() {
        mixedOperation.DeleteList();
    }
}
