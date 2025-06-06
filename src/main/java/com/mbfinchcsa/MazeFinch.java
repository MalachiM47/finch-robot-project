package com.mbfinchcsa;

import com.birdbrain.Finch;
public class MazeFinch extends Finch{
    
    public void turnCorner(String direct, int length){
        if(direct=="L"){
            setTurn("L", 90, 80);
       setMove("F", length, 80);
       setTurn("L", 90, 80);
        }else if(direct=="R"){
            setTurn("R", 90, 80);
       setMove("F",length, 80);
       setTurn("R", 90, 80);
        }
    }

    public void completeMaze(){
                //moves through the first big area avoiding the walls

        setMove("F",105, 80);

        //navigates around the short second area using left turns
        turnCorner("L", 35);
 
        //goes down and enters the left side of the maze preparing for a second big area
        setMove("F",30, 80);
        setTurn("R", 90, 80);
        setMove("F",54, 80);
 
        //turns and navigates the second big area
        turnCorner("R",125);
 
        //navigates around the wall that is blocking the end point
        setMove("F",18, 80);
       turnCorner("L", 20);
        setMove("F", 10, 80);
    }

    public void victorySong(){
    playNote(37,.125);
    pause(.25);
    playNote(69,.125);
    pause(.25);
    playNote(67,.125);
    pause(.25);
    playNote(65,.125);
    pause(.25);
    playNote(37,.375);
    pause(.75);
    playNote(37,.125);
    pause(.25);
    playNote(37,.125);
    pause(.25);
    playNote(69,.125);
    pause(.25);
    playNote(67,.125);
    pause(.25);
    playNote(65,.125);
    pause(.25);
    playNote(40,.375);
    pause(.75);
    playNote(40,.125);
    pause(.25);
    playNote(40,.125);
    pause(.25);
    playNote(70,.125);
    pause(.25);
    playNote(69,.125);
    pause(.25);
    playNote(67,.125);
    pause(.25);
    playNote(37,.375);
    pause(.75);
    playNote(37,.125);
    pause(.25);
    playNote(72,.125);
    pause(.25);
    playNote(72,.125);
    pause(.25);
    playNote(72,.125);
    pause(.25);
    playNote(72,.125);
    pause(.25);
    playNote(74,.125);
    pause(.25);
    playNote(72,.125);
    pause(.25);
    playNote(71,.125);
    pause(.25);
    playNote(67,.125);
    pause(.25);
    playNote(65,.2);
    pause(.3);
    playNote(60,.3);
    pause(.65);
    }
}
