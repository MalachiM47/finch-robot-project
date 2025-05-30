package com.mbfinchcsa;

import com.birdbrain.Finch;
public class Test {

    public static void main(String[]args){
        Finch bird = new Finch();
        int dis = bird.getDistance();
        if(dis<=5){
            bird.setTurn("L", 90, 100);
        }

        bird.stop();
        bird.disconnect();
    }


    }