package com.step.threads.model;

/**
 *
 * @author sscerbatiuc
 */
public class Counter extends Thread {
    
    public int secunde = 0;
    
    public boolean active = true;

    @Override
    public void run() {
        while(active){
            try {
                Thread.sleep(1000);
                secunde++;
                System.out.print(".");
            } catch (InterruptedException ex) {
                
            }
        }
    } 
}

