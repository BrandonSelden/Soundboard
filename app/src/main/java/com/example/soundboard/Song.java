package com.example.soundboard;

import java.util.ArrayList;

public class Song {
     private ArrayList<Integer> song;
     public Song(){
         song = new ArrayList<>();
     }
     public void addNote(int songId){
         song.add(songId);
     }
     public ArrayList<Integer> returnSong(){
         return song;
     }
     public void resetSong(){
         song.clear();
     }
     public int getLength(){
         return song.size();
     }
     public int getValue(int i){
         return song.get(i);
     }
}
