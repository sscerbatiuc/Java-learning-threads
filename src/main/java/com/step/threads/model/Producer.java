package com.step.threads.model;

import com.step.threads.model.buffer.Bufferable;

/**
 *
 * @author sscerbatiuc
 */
public class Producer extends Thread {

    private Bufferable buffer;

    public Producer(Bufferable b) {
        buffer = b;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.put(i);
            System.out.println(" Producatorul a pus :\t" + i);
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
    }
}
