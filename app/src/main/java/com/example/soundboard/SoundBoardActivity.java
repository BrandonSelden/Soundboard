package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class SoundBoardActivity extends AppCompatActivity implements View.OnClickListener {
    private Button c, csh, d, dsh, e, f, fsh, g, gsh, a, ash, b, song1, scale;
    private SoundPool soundPool;
    private boolean isSoundPoolLoaded;
    private Note cNote, cshNote, dNote, dshNote, eNote, fshNote, fNote, gNote, gshNote, aNote, ashNote, bNote, hcNote, hcshNote, hdNote, hdshNote, heNote, hfshNote, hfNote, hgNote, hgshNote, laNote, lashNote, lbNote;
    private Map<Integer, Integer> noteMap;
    private Note[] notes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wireWidgets();
        setListeners();
        initializeSoundPool();
        notes = new Note[] {cNote, cshNote, dNote, dshNote, eNote, fNote, fshNote, gNote, gshNote, aNote, ashNote, bNote, hcNote, hcshNote, hdNote, hdshNote, heNote, hfshNote, hfNote, hgNote, hgshNote, laNote, lashNote, lbNote};

    }

    private void initializeSoundPool() {

        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                isSoundPoolLoaded = true;
            }
        });
        cNote = new Note(soundPool.load(this, R.raw.scalec, 1), 100);
        cshNote = new Note(soundPool.load(this, R.raw.scalecs, 1), 100);
        dNote = new Note(soundPool.load(this, R.raw.scaled, 1), 100);
        dshNote = new Note(soundPool.load(this, R.raw.scaleds, 1), 100);
        eNote = new Note(soundPool.load(this, R.raw.scalee, 1), 100);
        fNote = new Note(soundPool.load(this, R.raw.scalef, 1), 100);
        fshNote = new Note(soundPool.load(this, R.raw.scalefs, 1), 100);
        gNote = new Note(soundPool.load(this, R.raw.scaleg, 1), 100);
        gshNote = new Note(soundPool.load(this, R.raw.scalegs, 1), 100);
        aNote = new Note(soundPool.load(this, R.raw.scalehigha, 1), 100);
        ashNote = new Note(soundPool.load(this, R.raw.scalehighbb, 1), 100);
        bNote = new Note(soundPool.load(this, R.raw.scalehighb, 1), 100);
        hcNote = new Note(soundPool.load(this, R.raw.scalehighc, 1), 100);
        hcshNote = new Note(soundPool.load(this, R.raw.scalehighcs, 1), 100);
        hdNote = new Note(soundPool.load(this, R.raw.scalehighd, 1), 100);
        hdshNote = new Note(soundPool.load(this, R.raw.scalehighds, 1), 100);
        heNote = new Note(soundPool.load(this, R.raw.scalehighe, 1), 100);
        hfNote = new Note(soundPool.load(this, R.raw.scalehighf, 1), 100);
        hfshNote = new Note(soundPool.load(this, R.raw.scalehighfs, 1), 100);
        hgNote = new Note(soundPool.load(this, R.raw.scalehighg, 1), 100);
        hgshNote = new Note(soundPool.load(this, R.raw.scalehighgs, 1), 100);
        laNote = new Note(soundPool.load(this, R.raw.scalea, 1), 100);
        lashNote = new Note(soundPool.load(this, R.raw.scalebb, 1), 100);
        lbNote = new Note(soundPool.load(this, R.raw.scaleb, 1), 100);
        noteMap = new HashMap<>();
        noteMap.put(c.getId(), cNote.getSoundId());
        noteMap.put(csh.getId(), cshNote.getSoundId());
        noteMap.put(d.getId(), dNote.getSoundId());
        noteMap.put(dsh.getId(), dshNote.getSoundId());
        noteMap.put(e.getId(), eNote.getSoundId());
        noteMap.put(f.getId(), fNote.getSoundId());
        noteMap.put(fsh.getId(), fshNote.getSoundId());
        noteMap.put(g.getId(), gNote.getSoundId());
        noteMap.put(gsh.getId(), gshNote.getSoundId());
        noteMap.put(a.getId(), aNote.getSoundId());
        noteMap.put(ash.getId(), ashNote.getSoundId());
        noteMap.put(b.getId(), bNote.getSoundId());



    }

    private void delay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }

    private void setListeners() {
//
//        c.setOnClickListener(this);
//        csh.setOnClickListener(this);
//        d.setOnClickListener(this);
//        dsh.setOnClickListener(this);
//        e.setOnClickListener(this);
//        f.setOnClickListener(this);
//        fsh.setOnClickListener(this);
//        g.setOnClickListener(this);
//        gsh.setOnClickListener(this);
//        a.setOnClickListener(this);
//        ash.setOnClickListener(this);
//        b.setOnClickListener(this);
        scale.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                for(Note no : notes){
                    soundPool.play(no.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(500);
                }
            }
        });
        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isSoundPoolLoaded) {
                    soundPool.play(dNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(dNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(hdNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(aNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(375);
                    soundPool.play(gshNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(gNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(fNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(dNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(fNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(gNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125); //end of first phrase
                    soundPool.play(cNote.getSoundId(), 1, 1, 1, 0, 1);
                    delay(125);
                    soundPool.play(cNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(hdNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(aNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(375);
                    soundPool.play(gshNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(gNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(fNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(dNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(fNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(gNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);//end of second phrase
                    soundPool.play(lbNote.getSoundId(), 1, 1, 1, 0, 1);
                    delay(125);
                    soundPool.play(lbNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(hdNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(aNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(375);
                    soundPool.play(gshNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(gNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(fNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(dNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(fNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(gNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);//end of third phrase
                    soundPool.play(lashNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(lashNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(hdNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(aNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(375);
                    soundPool.play(gshNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(gNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(fNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(dNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(fNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(gNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);//end of fourth phrase
                    soundPool.play(dNote.getSoundId(), 1, 1, 1, 0, 1);
                    delay(125);
                    soundPool.play(dNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(hdNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(aNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(375);
                    soundPool.play(gshNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(gNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(fNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(dNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(fNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(gNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125); //end of first phrase
                    soundPool.play(cNote.getSoundId(), 1, 1, 1, 0, 1);
                    delay(125);
                    soundPool.play(cNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(hdNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(aNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(375);
                    soundPool.play(gshNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(gNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(fNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(dNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(fNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(gNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);//end of second phrase
                    soundPool.play(lbNote.getSoundId(), 1, 1, 1, 0, 1);
                    delay(125);
                    soundPool.play(lbNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(hdNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(aNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(375);
                    soundPool.play(gshNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(gNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(fNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(dNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(fNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(gNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);//end of third phrase
                    soundPool.play(lashNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(lashNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(hdNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(aNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(375);
                    soundPool.play(gshNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(gNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(fNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(250);
                    soundPool.play(dNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(fNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(gNote.getSoundId(), 1, 1, 1, 0, 1f);
                    delay(125);//end of fourth phrase

                }
            }
        });
        KeyboardListener keyboardListener = new KeyboardListener();
        c.setOnClickListener(keyboardListener);
        csh.setOnClickListener(keyboardListener);
        d.setOnClickListener(keyboardListener);
        dsh.setOnClickListener(keyboardListener);
        e.setOnClickListener(keyboardListener);
        f.setOnClickListener(keyboardListener);
        fsh.setOnClickListener(keyboardListener);
        g.setOnClickListener(keyboardListener);
        gsh.setOnClickListener(keyboardListener);
        a.setOnClickListener(keyboardListener);
        b.setOnClickListener(keyboardListener);
        ash.setOnClickListener(keyboardListener);
    }


    private void wireWidgets() {
        c = findViewById(R.id.button_main_c);
        csh = findViewById(R.id.button_main_csh);
        d = findViewById(R.id.button_main_d);
        dsh = findViewById(R.id.button_main_dsh);
        e = findViewById(R.id.button_main_e);
        f = findViewById(R.id.button_main_f);
        fsh = findViewById(R.id.button_main_fsh);
        g = findViewById(R.id.button_main_g);
        gsh = findViewById(R.id.button_main_gsh);
        a = findViewById(R.id.button_main_a);
        ash = findViewById(R.id.button_main_ash);
        b = findViewById(R.id.button_main_b);
        song1 = findViewById(R.id.button_main_song1);
        scale = findViewById(R.id.button_main_scale);
    }

    @Override
    public void onClick(View view) {


    }
    private class KeyboardListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            int songId = noteMap.get(view.getId());
            if(songId != 0){
                    soundPool.play(songId, 1, 1, 1, 0, 1);
            }
        }
    }
}
