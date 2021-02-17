package com.step.threads.app;

import com.step.threads.model.NumberPrinter;

/**
 *
 * @author sscerbatiuc
 */
public class NumberPrinterDemo {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter(0, 100000, 5); // 0, 5, 10 ...
        NumberPrinter printer2 = new NumberPrinter(100000, 200000, 5);
        printer.start();
        printer2.start();
    }
}
