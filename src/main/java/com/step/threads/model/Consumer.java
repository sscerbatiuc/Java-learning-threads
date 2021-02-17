package com.step.threads.model;

import com.step.threads.model.buffer.Bufferable;

/**
 *
 * @author sscerbatiuc
 */
public class Consumer extends Thread {

    private Bufferable buffer;

    public Consumer(Bufferable b) {
        buffer = b;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = buffer.get();
            System.out.println(" Consumatorul a primit :\t" + value);
        }
    }
}
