package com.step.threads.model.buffer;

/**
 *
 * @author sscerbatiuc
 */
public class SynchronizedBuffer implements Bufferable {

    private int number = -1;
    private boolean hasData = false;

    public synchronized int get() {
        while (!hasData) {
            try {
                wait();
                // Asteapta producatorul sa puna o valoare
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hasData = false;
        notifyAll();
        return number;
    }

    public synchronized void put(int number) {
        while (hasData) {
            try {
                wait();
                // Asteapta consumatorul
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.number = number;
        hasData = true;
        notifyAll();
    }
}
