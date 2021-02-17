package com.step.threads.model;

/**
 *
 * @author sscerbatiuc
 */
public class NumberPrinter extends Thread {
    
    int a, b, pas;

    public NumberPrinter(int a, int b, int pas) {
        this.a = a;
        this.b = b;
        this.pas = pas;
    }
    
    public void run(){
        for (int i = a; i < b; i += pas) {
            System.out.print(i + " ");
        }
    }
}
