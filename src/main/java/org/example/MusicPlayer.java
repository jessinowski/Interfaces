package org.example;

public class MusicPlayer implements Playable{
    //Step 2: Create a class 'MusicPlayer' that implements the 'Playable' interface. Implement the 'play' method to play a song.
    @Override
    public void play() {
        System.out.println("Play metal music!");
    }
}
