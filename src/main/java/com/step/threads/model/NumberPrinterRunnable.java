package com.step.threads.model;

/**
 *
 * @author sscerbatiuc
 */
public class NumberPrinterRunnable implements Runnable {
    
    int a, b, pas;
    private Thread thread;

    public NumberPrinterRunnable(int a, int b, int pas) {
        this.a = a;
        this.b = b;
        this.pas = pas;
        if(thread == null){
            thread = new Thread(this);
        }
        thread.start();
    }
    
    @Override
    public void run(){
        for (int i = a; i < b; i += pas) {
            System.out.print(i + " ");
        }
    }
}
