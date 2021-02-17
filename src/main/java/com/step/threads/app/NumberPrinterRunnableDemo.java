package com.step.threads.app;

import com.step.threads.model.NumberPrinterRunnable;

/**
 *
 * @author sscerbatiuc
 */
public class NumberPrinterRunnableDemo {
    public static void main(String[] args) {
       NumberPrinterRunnable numberPrinter = new NumberPrinterRunnable(0,100,5);
//       Thread thread = new Thread(numberPrinter);
//       thread.start();
//       numberPrinter.run();
       
       NumberPrinterRunnable numberPrinter2 = new NumberPrinterRunnable(100,200,5);
       numberPrinter2.run();
    }
}
