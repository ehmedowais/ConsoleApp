package com.java.general;

import java.lang.ref.Cleaner;
import java.util.Vector;

public class CleanableRoom implements AutoCloseable{
    private static final Cleaner cleaner = Cleaner.create();
    private static class State implements Runnable {
        private int numJunkPiles;
        public State(int numJunkPiles){
            this.numJunkPiles = numJunkPiles;
        }
        @Override
        public void run() {
            System.out.println("Cleaning the room");
            numJunkPiles = 0;
        }
    }
    private final State state;
    private final Cleaner.Cleanable cleanable;
    Vector<Integer> v = new Vector<>(100000);
    public CleanableRoom(int numJunkPiles){
        state = new State(numJunkPiles);
        cleanable = cleaner.register(this, ()->{
            System.out.println("Cleaning from Lambda");
            v=null;
        });
    }
    public void createVectors() {
        v.add(10);
    }
    public void readVector(){
        System.out.println(v.get(0));
    }
    @Override
    public void close() throws Exception {
        cleanable.clean();
    }
}
