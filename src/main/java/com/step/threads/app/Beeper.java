package com.step.threads.app;

import java.io.IOException;

public class Beeper implements Runnable {
    @Override
    public void run() {
        while (true) {
            java.awt.Toolkit.getDefaultToolkit().beep();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class TestDaemon {
    public static void main(String[] args) throws IOException {
        Thread t = new Thread(new Beeper());
        t.setDaemon(true);
        t.start();

        System.out.println("Press enter...");
        System.in.read();
    }
}
