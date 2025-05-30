package com.example;

import com.birdbrain.Finch;

public class FinchDemo {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        myFinch.playNote(60,0.5);

        for (int i = 0; i < 10; i++) {
            myFinch.playNote(60,3);

            myFinch.setBeak(100, 100, 100);
            myFinch.setMove("F", 20,100);
            myFinch.setTurn("L",90,100);
            System.out.println(myFinch.getDistance());

            
        }

        myFinch.stopAll();
        myFinch.disconnect();
    }
}