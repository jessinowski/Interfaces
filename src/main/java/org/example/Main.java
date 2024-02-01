package org.example;

public class Main {
    public static void main(String[] args) {
        //Step 5: In the 'main' method, initialize an object of the 'MusicPlayer' and 'VideoPlayer' classes with the 'Playable' interface (polymorphism).
        Playable boomBox = new MusicPlayer();
        Playable tv = new VideoPlayer();
        //Step 6: In the 'main' method, create an object of the 'MediaController' class and use it to play both a song and a video.
        MediaController chromecast = new MediaController();
        chromecast.playMedia(boomBox);
        chromecast.playMedia(tv);
    }
}