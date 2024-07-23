package com.proretention.scrm.Integration.adapter;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer mediaPlayer;

    public MediaAdapter(String type)
    {
        if(type.equalsIgnoreCase("vlc"))
            mediaPlayer=new VlcPlayer();
        else if (type.equalsIgnoreCase("mp4"))
            mediaPlayer=new Mp4Player();

    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc"))
            mediaPlayer.playVlc(fileName);
        else if (audioType.equalsIgnoreCase("mp4"))
            mediaPlayer.playMp4(fileName);
    }
}
