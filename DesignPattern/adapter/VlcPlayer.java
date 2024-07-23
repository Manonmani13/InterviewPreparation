package com.proretention.scrm.Integration.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("Vlc Player "+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
