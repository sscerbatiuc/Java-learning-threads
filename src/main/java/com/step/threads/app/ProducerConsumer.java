package com.step.threads.app;

import com.step.threads.model.buffer.Buffer;
import com.step.threads.model.Producer;
import com.step.threads.model.Consumer;
import com.step.threads.model.buffer.Bufferable;
import com.step.threads.model.buffer.SynchronizedBuffer;
/**
 *
 * @author sscerbatiuc
 */
public class ProducerConsumer {

    public static void main(String[] args) {
        nonSynchronizedBuffer();
//        synchronizedBuffer();
    }
    
    public static void nonSynchronizedBuffer(){
        Bufferable b = new Buffer();
        Producer p1 = new Producer(b);
        Consumer c1 = new Consumer(b);
        p1.start();
        c1.start();
    }
    
    public static void synchronizedBuffer(){
         Bufferable b = new SynchronizedBuffer();
        Producer p1 = new Producer(b);
        Consumer c1 = new Consumer(b);
        p1.start();
        c1.start();
    }
}
