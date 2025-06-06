package com.mbfinchcsa;

import com.birdbrain.Finch;
public class Maze {

    public static void main(String[]args){
        MazeFinch bird = new MazeFinch();
        //goes from start to end of maze
        bird.completeMaze();
    
    //plays a snippet of jingle bells after completing the maze
    bird.victorySong();




        bird.stop();
        bird.disconnect();
    }
}