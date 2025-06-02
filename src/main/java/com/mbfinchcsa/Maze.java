package com.mbfinchcsa;

import com.birdbrain.Finch;
public class Maze {

    public static void main(String[]args){
        Finch bird = new Finch();
       bird.setMove("F",90, 80);
       bird.setTurn("L", 90, 80);
       bird.setMove("F",40, 80);
       bird.setTurn("L", 90, 80);
       bird.setMove("F",40, 80);
       bird.setTurn("R", 90, 80);
       bird.setMove("F",60, 80);



        bird.stop();
        bird.disconnect();
    }
}