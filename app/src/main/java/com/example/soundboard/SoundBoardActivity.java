package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class SoundBoardActivity extends AppCompatActivity {
    private Button c, csh, d, dsh, e, f, fsh, g, gsh, a, ash, b;
    private SoundPool soundPool;
    private boolean isSoundPoolLoaded;
    private int cNote;
    private int ashNote;
    private int bNote;
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
        cNote = soundPool.load(this,R.raw.pizza, 1);
    }

    private void setListeners() {
        c.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager
                        .getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager
                        .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;
                // Is the sound loaded already?
                if (isSoundPoolLoaded) {
                    soundPool.play(cNote, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }
            }
        });
    }

//    public boolean onTouch(View v, MotionEvent event) {
//        if (event.getAction() == MotionEvent.ACTION_DOWN) {
//            // Getting the user sound settings
//            AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
//            float actualVolume = (float) audioManager
//                    .getStreamVolume(AudioManager.STREAM_MUSIC);
//            float maxVolume = (float) audioManager
//                    .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
//            float volume = actualVolume / maxVolume;
//            // Is the sound loaded already?
//            if (isSoundPoolLoaded) {
//                soundPool.play(cNote, volume, volume, 1, 0, 1f);
//                Log.e("Test", "Played sound");
//            }
//        }
//        return false;
//    }

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
}
