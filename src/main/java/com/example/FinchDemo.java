package com.example;

import com.birdbrain.Finch;

public class FinchDemo {
    public static void main(String[] args) {
        Finch myFinch = new Finch();
        myFinch.playNote(60,0.5);

        
        

        myFinch.stopAll();
        myFinch.disconnect();
    }
}