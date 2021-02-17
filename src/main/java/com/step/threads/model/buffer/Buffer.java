package com.step.threads.model.buffer;

/**
 *
 * @author sscerbatiuc
 */
public class Buffer implements Bufferable{

    private int number = -1;

    public int get() {
        return number;
    }

    public void put(int number) {
        this.number = number;
    }
}
