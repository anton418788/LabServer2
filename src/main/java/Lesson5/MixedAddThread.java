package Lesson5;

import java.util.List;

public class MixedAddThread implements Runnable{
    private MixedOperation mixedOperation;
    public MixedAddThread(List<Integer> list) {
        this.mixedOperation = new MixedOperation(list);
    }

    @Override
    public void run() {
        mixedOperation.AddList();
    }
}
