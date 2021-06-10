package com.company;

public class StopWatch {
    private long startTime =0;
    private long endTime =0;

    public StopWatch(){

    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        long elapsed;

        elapsed = (endTime - startTime);

        return elapsed;
    }

}
