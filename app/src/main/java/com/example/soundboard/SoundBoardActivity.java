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

public class SoundBoardActivity extends AppCompatActivity implements View.OnClickListener {
    private Button c, csh, d, dsh, e, f, fsh, g, gsh, a, ash, b, octave, song1;
    private SoundPool soundPool;
    private boolean isSoundPoolLoaded, octaveHigh;
    private int cNote, cshNote, dNote, dshNote, eNote, fshNote, fNote, gNote, gshNote, aNote, ashNote, bNote, hcNote, hcshNote, hdNote, hdshNote, heNote, hfshNote, hfNote, hgNote, hgshNote, laNote, lashNote, lbNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wireWidgets();
        setListeners();
        initializeSoundPool();

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
        cNote = soundPool.load(this, R.raw.scalec, 1);
        cshNote = soundPool.load(this, R.raw.scalecs, 1);
        dNote = soundPool.load(this, R.raw.scaled, 1);
        dshNote = soundPool.load(this, R.raw.scaleds, 1);
        eNote = soundPool.load(this, R.raw.scalee, 1);
        fNote = soundPool.load(this, R.raw.scalef, 1);
        fshNote = soundPool.load(this, R.raw.scalefs, 1);
        gNote = soundPool.load(this, R.raw.scaleg, 1);
        gshNote = soundPool.load(this, R.raw.scalegs, 1);
        aNote = soundPool.load(this, R.raw.scalehigha, 1);
        ashNote = soundPool.load(this, R.raw.scalehighbb, 1);
        bNote = soundPool.load(this, R.raw.scalehighb, 1);
        hcNote = soundPool.load(this, R.raw.scalehighc, 1);
        hcshNote = soundPool.load(this, R.raw.scalehighcs, 1);
        hdNote = soundPool.load(this, R.raw.scalehighd, 1);
        hdshNote = soundPool.load(this, R.raw.scalehighds, 1);
        heNote = soundPool.load(this, R.raw.scalehighe, 1);
        hfNote = soundPool.load(this, R.raw.scalehighf, 1);
        hfshNote = soundPool.load(this, R.raw.scalehighfs, 1);
        hgNote = soundPool.load(this, R.raw.scalehighg, 1);
        hgshNote = soundPool.load(this, R.raw.scalehighgs, 1);
        laNote = soundPool.load(this, R.raw.scalea, 1);
        lashNote = soundPool.load(this, R.raw.scalebb, 1);
        lbNote = soundPool.load(this, R.raw.scaleb, 1);

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
        octave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                octaveHigh = !octaveHigh;
            }
        });
        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isSoundPoolLoaded) {
                    soundPool.play(dNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(dNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(hdNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(aNote, 1, 1, 1, 0, 1f);
                    delay(425);
                    soundPool.play(gshNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(gNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(fNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(dNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(fNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(gNote, 1, 1, 1, 0, 1f);
                    delay(125); //end of first phrase
                    soundPool.play(cNote, 1, 1, 1, 0, 1);
                    delay(125);
                    soundPool.play(cNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(hdNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(aNote, 1, 1, 1, 0, 1f);
                    delay(425);
                    soundPool.play(gshNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(gNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(fNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(dNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(fNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(gNote, 1, 1, 1, 0, 1f);
                    delay(125);//end of second phrase
                    soundPool.play(lbNote, 1, 1, 1, 0, 1);
                    delay(125);
                    soundPool.play(lbNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(hdNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(aNote, 1, 1, 1, 0, 1f);
                    delay(425);
                    soundPool.play(gshNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(gNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(fNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(dNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(fNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(gNote, 1, 1, 1, 0, 1f);
                    delay(125);//end of third phrase
                    soundPool.play(lashNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(lashNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(hdNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(aNote, 1, 1, 1, 0, 1f);
                    delay(425);
                    soundPool.play(gshNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(gNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(fNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(dNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(fNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(gNote, 1, 1, 1, 0, 1f);
                    delay(125);//end of fourth phrase
                    soundPool.play(dNote, 1, 1, 1, 0, 1);
                    delay(125);
                    soundPool.play(dNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(hdNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(aNote, 1, 1, 1, 0, 1f);
                    delay(425);
                    soundPool.play(gshNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(gNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(fNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(dNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(fNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(gNote, 1, 1, 1, 0, 1f);
                    delay(125); //end of first phrase
                    soundPool.play(cNote, 1, 1, 1, 0, 1);
                    delay(125);
                    soundPool.play(cNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(hdNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(aNote, 1, 1, 1, 0, 1f);
                    delay(425);
                    soundPool.play(gshNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(gNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(fNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(dNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(fNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(gNote, 1, 1, 1, 0, 1f);
                    delay(125);//end of second phrase
                    soundPool.play(lbNote, 1, 1, 1, 0, 1);
                    delay(125);
                    soundPool.play(lbNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(hdNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(aNote, 1, 1, 1, 0, 1f);
                    delay(425);
                    soundPool.play(gshNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(gNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(fNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(dNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(fNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(gNote, 1, 1, 1, 0, 1f);
                    delay(125);//end of third phrase
                    soundPool.play(lashNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(lashNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(hdNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(aNote, 1, 1, 1, 0, 1f);
                    delay(425);
                    soundPool.play(gshNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(gNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(fNote, 1, 1, 1, 0, 1f);
                    delay(300);
                    soundPool.play(dNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(fNote, 1, 1, 1, 0, 1f);
                    delay(125);
                    soundPool.play(gNote, 1, 1, 1, 0, 1f);
                    delay(125);//end of fourth phrase

                }
            }
        });
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
        octave = findViewById(R.id.button_main_octave);
        song1 = findViewById(R.id.button_main_song1);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_main_c: {
                if (isSoundPoolLoaded) {
                    if (octaveHigh) {
                        soundPool.play(hcNote, 1, 1, 1, 0, 1f);
                    } else {
                        soundPool.play(cNote, 1, 1, 1, 0, 1f);
                    }
                }
                break;
            }
            case R.id.button_main_csh: {
                if (isSoundPoolLoaded) {
                    if (octaveHigh) {
                        soundPool.play(hcshNote, 1, 1, 1, 0, 1f);
                    } else {
                        soundPool.play(cshNote, 1, 1, 1, 0, 1f);
                    }
                }
                break;
            }
            case R.id.button_main_d: {
                if (isSoundPoolLoaded) {
                    if (octaveHigh) {
                        soundPool.play(hdNote, 1, 1, 1, 0, 1f);
                    } else {
                        soundPool.play(dNote, 1, 1, 1, 0, 1f);
                    }
                }
                break;
            }
            case R.id.button_main_dsh: {
                if (isSoundPoolLoaded) {
                    if (octaveHigh) {
                        soundPool.play(hdshNote, 1, 1, 1, 0, 1f);
                    } else {
                        soundPool.play(dshNote, 1, 1, 1, 0, 1f);
                    }
                }
                break;
            }
            case R.id.button_main_e: {
                if (isSoundPoolLoaded) {
                    if (octaveHigh) {
                        soundPool.play(heNote, 1, 1, 1, 0, 1f);
                    } else {
                        soundPool.play(eNote, 1, 1, 1, 0, 1f);
                    }
                }
                break;
            }
            case R.id.button_main_f: {
                if (isSoundPoolLoaded) {
                    if (octaveHigh) {
                        soundPool.play(hfNote, 1, 1, 1, 0, 1f);
                    } else {
                        soundPool.play(fNote, 1, 1, 1, 0, 1f);
                    }
                }
                break;
            }
            case R.id.button_main_fsh: {
                if (isSoundPoolLoaded) {
                    if (octaveHigh) {
                        soundPool.play(hfshNote, 1, 1, 1, 0, 1f);
                    } else {
                        soundPool.play(fshNote, 1, 1, 1, 0, 1f);
                    }
                }
                break;
            }
            case R.id.button_main_g: {
                if (isSoundPoolLoaded) {
                    if (octaveHigh) {
                        soundPool.play(hgNote, 1, 1, 1, 0, 1f);
                    } else {
                        soundPool.play(gNote, 1, 1, 1, 0, 1f);
                    }
                }
                break;
            }
            case R.id.button_main_gsh: {
                if (isSoundPoolLoaded) {
                    if (octaveHigh) {
                        soundPool.play(hgshNote, 1, 1, 1, 0, 1f);
                    } else {
                        soundPool.play(gshNote, 1, 1, 1, 0, 1f);
                    }
                }
                break;
            }
            case R.id.button_main_a: {
                if (isSoundPoolLoaded) {
                    if (octaveHigh) {
                        soundPool.play(laNote, 1, 1, 1, 0, 1f);
                    } else {
                        soundPool.play(aNote, 1, 1, 1, 0, 1f);
                    }
                }
                break;
            }
            case R.id.button_main_ash: {
                if (isSoundPoolLoaded) {
                    if (octaveHigh) {
                        soundPool.play(lashNote, 1, 1, 1, 0, 1f);
                    } else {
                        soundPool.play(ashNote, 1, 1, 1, 0, 1f);
                    }
                }
                break;
            }
            case R.id.button_main_b: {
                if (isSoundPoolLoaded) {
                    if (octaveHigh) {
                        soundPool.play(lbNote, 1, 1, 1, 0, 1f);
                    } else {
                        soundPool.play(bNote, 1, 1, 1, 0, 1f);
                    }
                }
                break;
            }


        }

    }
}
