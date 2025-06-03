package com.mbfinchcsa;

import com.birdbrain.Finch;
public class Maze {

    public static void main(String[]args){
        Finch bird = new Finch();
    //     //moves through the first big area avoiding the walls
    //    bird.setMove("F",105, 80);

    //    //navigates around the short second area using left turns
    //    bird.setTurn("L", 90, 80);
    //    bird.setMove("F",35, 80);
    //    bird.setTurn("L", 90, 80);

    //    //goes down and enters the left side of the maze preparing for a second big area
    //    bird.setMove("F",30, 80);
    //    bird.setTurn("R", 90, 80);
    //    bird.setMove("F",54, 80);

    //    //turns and navigates the second big area
    //    bird.setTurn("R", 90, 80);
    //    bird.setMove("F",125, 80);
    //    bird.setTurn("R", 90, 80);

    //    //navigates around the wall that is blocking the end point
    //    bird.setMove("F",18, 80);
    //    bird.setTurn("L", 90, 80);
    //    bird.setMove("F",20, 80);
    //    bird.setTurn("L", 90, 80);
    //    bird.setMove("F", 10, 80);
    bird.playNote(37,.125);
    bird.pause(0.3);
    bird.playNote(69,.125);
    bird.pause(0.3);

    bird.playNote(67,.125);
    bird.pause(0.3);

    bird.playNote(65,.125);
    bird.pause(0.3);

    bird.playNote(37,.375);
    bird.pause(0.3);

    bird.playNote(37,.125);













        bird.stop();
        bird.disconnect();
    }
}