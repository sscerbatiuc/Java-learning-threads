package com.step.threads.app;

import com.step.threads.model.Counter;

import java.io.IOException;

/**
 * @author sscerbatiuc
 */
public class CounterDemo {
    public static void main(String[] args) throws IOException {
        Counter counter = new Counter();
        counter.start();
        System.out.println("Apasati tasta enter");
        System.in.read();

        counter.active = false;
        System.out.println("S-au scurs: " + counter.secunde + " secunde");
    }
}