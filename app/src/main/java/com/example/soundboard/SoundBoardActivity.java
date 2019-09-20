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

public class SoundBoardActivity extends AppCompatActivity implements View.OnClickListener{
    private Button c, csh, d, dsh, e, f, fsh, g, gsh, a, ash, b;
    private SoundPool soundPool;
    private boolean isSoundPoolLoaded;
    private int cNote, cshNote, dNote, dshNote, eNote, fshNote, fNote, gNote, gshNote, aNote, ashNote, bNote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wireWidgets();
        setListeners();
        initializeSoundPool();
//        onTouch(c, );

    }
    private void initializeSoundPool(){

        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                isSoundPoolLoaded = true;
            }
        });
        cNote = soundPool.load(this,R.raw.scalec, 1);
        cshNote = soundPool.load(this,R.raw.scalecs, 1);
        dNote = soundPool.load(this,R.raw.scaled, 1);
        dshNote = soundPool.load(this,R.raw.scaleds, 1);
        eNote = soundPool.load(this,R.raw.scalee, 1);
        fNote = soundPool.load(this,R.raw.scalef, 1);
        fshNote = soundPool.load(this,R.raw.scalefs, 1);
        gNote = soundPool.load(this,R.raw.scaleg, 1);
        gshNote = soundPool.load(this,R.raw.scalegs, 1);
        aNote = soundPool.load(this,R.raw.scalea, 1);
        ashNote = soundPool.load(this,R.raw.scalebb, 1);
        bNote = soundPool.load(this,R.raw.scaleb, 1);
    }

    private void delay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }

    private void setListeners() {

        c.setOnClickListener(this);
        csh.setOnClickListener(this);
        d.setOnClickListener(this);
        dsh.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        fsh.setOnClickListener(this);
        g.setOnClickListener(this);
        gsh.setOnClickListener(this);
        a.setOnClickListener(this);
        ash.setOnClickListener(this);
        b.setOnClickListener(this);
    }


    private void wireWidgets()
    {
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
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_main_c : {
                if (isSoundPoolLoaded) {
                    soundPool.play(cNote, 1, 1, 1, 0, 1f);
                }
                break;
            }
            case R.id.button_main_csh : {
                if (isSoundPoolLoaded) {
                    soundPool.play(cshNote, 1, 1, 1, 0, 1f);
                }
                break;
            }
            case R.id.button_main_d : {
                if (isSoundPoolLoaded) {
                    soundPool.play(dNote, 1, 1, 1, 0, 1f);
                }
                break;
            }
            case R.id.button_main_dsh : {
                if (isSoundPoolLoaded) {
                    soundPool.play(dshNote, 1, 1, 1, 0, 1f);
                }
                break;
            }
            case R.id.button_main_e : {
                if (isSoundPoolLoaded) {
                    soundPool.play(eNote, 1, 1, 1, 0, 1f);
                }
                break;
            }
            case R.id.button_main_f : {
                if (isSoundPoolLoaded) {
                    soundPool.play(fNote, 1, 1, 1, 0, 1f);
                }
                break;
            }
            case R.id.button_main_fsh : {
                if (isSoundPoolLoaded) {
                    soundPool.play(fshNote, 1, 1, 1, 0, 1f);
                }
                break;
            }
            case R.id.button_main_g : {
                if (isSoundPoolLoaded) {
                    soundPool.play(gNote, 1, 1, 1, 0, 1f);
                }
                break;
            }
            case R.id.button_main_gsh : {
                if (isSoundPoolLoaded) {
                    soundPool.play(gshNote, 1, 1, 1, 0, 1f);
                }
                break;
            }
            case R.id.button_main_a : {
                if (isSoundPoolLoaded) {
                    soundPool.play(aNote, 1, 1, 1, 0, 1f);
                }
                break;
            }
            case R.id.button_main_ash : {
                if (isSoundPoolLoaded) {
                    soundPool.play(ashNote, 1, 1, 1, 0, 1f);
                }
                break;
            }
            case R.id.button_main_b : {
                if (isSoundPoolLoaded) {
                    soundPool.play(bNote, 1, 1, 1, 0, 1f);
                }
                break;
            }

        }
    }
}
