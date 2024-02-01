package org.example;

public class VideoPlayer implements Playable{
    //Step 3: Create a class 'VideoPlayer' that also implements the 'Playable' interface. Implement the 'play' method to play a video.
    @Override
    public void play() {
        System.out.println("Nice anime!");
    }
}
