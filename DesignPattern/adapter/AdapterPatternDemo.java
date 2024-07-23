package com.proretention.scrm.Integration.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer() ;
        audioPlayer.play("mp3","song.mp3");
        audioPlayer.play("mp4","video.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");

    }
}
