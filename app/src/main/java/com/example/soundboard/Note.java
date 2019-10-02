package com.example.soundboard;

public class Note {
    private int soundId, intDelay;
    public Note(int soundId, int intDelay){
        this.soundId = soundId;
        this.intDelay = intDelay;

    }

    public int getSoundId(){
        return soundId;

    }

    public int getintDelay(){
        return intDelay;

    }

}
