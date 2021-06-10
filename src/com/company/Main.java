package com.company;

public class Main {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        for (int i = 0; i < 100000 ; i++){
            System.out.print(i +" ");
        }
        stopWatch.stop();

        System.out.println("\n" +stopWatch.getElapsedTime());
    }
}
